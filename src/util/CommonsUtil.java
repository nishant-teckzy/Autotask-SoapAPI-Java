package util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPException;

import net.autotask.ATWS.v1_6.ATWSError;
import net.autotask.ATWS.v1_6.ATWSLocator;
import net.autotask.ATWS.v1_6.ATWSResponse;
import net.autotask.ATWS.v1_6.ATWSSoapStub;

import org.apache.axis.message.SOAPHeaderElement;
import org.apache.log4j.Logger;

/**
 * Contains Common used Methods for All classes
 * @author Nishant Tiwari
 * @created at 06-Nov-2019
 * 
 */
public class CommonsUtil {
	private static final Logger log = Logger.getLogger(CommonsUtil.class);
	
	/**
	 * Implements Error Logging for Errors in API Responses
	 * @author Nishant Tiwari
	 * @created at 06-Nov-2019
	 * @param res
	 * 		:res as ATWSResponse
	 */
	public static void throwAtwsErrror(ATWSResponse res){
		if(res.getErrors().length > ConstantsUtil.ZERO){
			for(int i=0;i<res.getErrors().length;i++){
				ATWSError atwsErr = res.getErrors()[i];
				log.error(res.getClass().getSimpleName()+ConstantsUtil.PIPE+ConstantsUtil.ATWS_ERROR+(i+ConstantsUtil.ONE)+" : "+atwsErr.getMessage());
			}
				

			
		}
		
	}
	
	/**
	 * Implements Stub Generation for API Service
	 * @author Nishant Tiwari
	 * @created at 06-Nov-2019
	 * @return ATWSSoapStub
	 * @see ATWSSoapStub
	 * 
	 */
	public ATWSSoapStub getStub(){
		ATWSSoapStub stub = null;
		ATWSLocator locator = new ATWSLocator();
		try {
			stub = (ATWSSoapStub) locator.getATWSSoap();
			
			// ------------Adding header & Authentication here---------------------------------//
			SOAPHeaderElement AutotaskIn = new SOAPHeaderElement(Props
					.getProps().getProperty(ConstantsUtil.QNAME), ConstantsUtil.AUTOTASK_INTEGRATIONS);
			SOAPHeaderElement IntegrationCode = new SOAPHeaderElement(Props
					.getProps().getProperty(ConstantsUtil.QNAME), Props.getProps()
					.getProperty(ConstantsUtil.CODE_NAME), Props.getProps().getProperty(
							ConstantsUtil.CODE));
			AutotaskIn.addChild(IntegrationCode);
			stub.setHeader(AutotaskIn);
			stub._setProperty(ATWSSoapStub.USERNAME_PROPERTY, Props.getProps().getProperty(ConstantsUtil.USERNAME));
			stub._setProperty(ATWSSoapStub.PASSWORD_PROPERTY,Props.getProps().getProperty(ConstantsUtil.PASSWORD));
			stub._setProperty(ATWSSoapStub.ENDPOINT_ADDRESS_PROPERTY, Props.getProps().getProperty(ConstantsUtil.ENDPONT_ADDRESS));
			// -----------------*********************************---------------------------------//
	
		} catch (ServiceException e) {
			e.printStackTrace();
			log.error(e.getMessage());
		} catch (SOAPException e) {
			e.printStackTrace();
			log.error(e.getMessage());
		}
		
		return stub;
	}
	
	public static String convertToEST(String strDate){
		Date date = null;
		try {
			date = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(strDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String EST_Date = null;
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
//		df.setTimeZone(TimeZone.getTimeZone("EST"));
		EST_Date = df.format(date);
		return EST_Date;
	}
}
