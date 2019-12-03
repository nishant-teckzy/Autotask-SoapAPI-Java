package com.nft.daoImpl;

import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;

import org.apache.log4j.Logger;

import util.AtwsCustomResponse;
import util.CommonsUtil;
import util.ConstantsUtil;
import util.QueryXml;
import net.autotask.ATWS.v1_6.ATWSResponse;
import net.autotask.ATWS.v1_6.ATWSSoapStub;
import net.autotask.ATWS.v1_6.Entity;
import net.autotask.ATWS.v1_6.Ticket;

import com.nft.dao.TicketDao;



/**
 * Implements Ticket Create,Update & Query Methods for TicketDao
 * @author Nishant Tiwari
 * @see TicketDao
 * @created at 05-Nov-2019
 *
 */
public class TicketDaoImpl implements TicketDao {
	private static final Logger log = Logger.getLogger(TicketDaoImpl.class);
	ATWSSoapStub stub = null;
	
	
	public TicketDaoImpl() {
		stub = new CommonsUtil().getStub();
		
	}

	/**
	 * Implements Create for TicketDao
	 * @param AccountID
	 *            : Customer Account id as String
	 * @param queueID
	 *            : queueID as String
	 * @param TicketCategory
	 *            : Category of Ticket as String
	 * @param DueDateTime
	 *            : Due Date & Time of Ticket as String
	 * @param CreateDate
	 *            : The Date of Creation of Ticket as String
	 * @param Priority
	 *            : Priority of Ticket as  an Integer
	 * @param Status
	 *            : Status of Ticket as an Integer
	 * @param Title
	 *            : Title of Ticket as String
	 * @author Nishant Tiwari
	 * @created at 05-Nov-2019
	 * @return Case1: Returns 1 if successfully Created the Contact.
	 * 			Case2: Returns 0 in case of faliure.
	 * @see AtwsCustomResponse#getStatus() Returns Status of Response
	 * @see AtwsCustomResponse#getData() Returns Object as an ArrayLsit of Response
	 * @see AtwsCustomResponse#getStatus() Returns Status of Response
	 */
	public AtwsCustomResponse Create(String accountID,String queueID,String ticketCategory,String dueDateTime,String createDate,String priority,String status,String title) {
		
		Ticket ticket = null;
		AtwsCustomResponse custResponse = null;
		
		try {
			custResponse = new AtwsCustomResponse(ConstantsUtil.ZERO,ConstantsUtil.EXCEPTION_MESSAGE);
			ticket = new Ticket();
			ticket.setAccountID(Integer.parseInt(accountID));
			ticket.setQueueID(Integer.parseInt(queueID));
			ticket.setTicketCategory(Integer.parseInt(ticketCategory));
			ticket.setCreateDate(createDate);
			ticket.setDueDateTime(dueDateTime);
			ticket.setPriority(Integer.parseInt(priority));
			ticket.setStatus(Integer.parseInt(status));
			ticket.setTitle(title);
			
			
			
			Entity[] arrEntity = {ticket};
			/**Setting Default Response**/
			custResponse = new AtwsCustomResponse(ConstantsUtil.ZERO,ConstantsUtil.EXCEPTION_MESSAGE);
			/** Getting Response from Service **/
			ATWSResponse response = stub.create(arrEntity);
			//Logging Resposne Here
			log.debug(ConstantsUtil.RESPONSE+" : "+ConstantsUtil.RETURN_CODE+"["+response.getReturnCode()+"] "+ConstantsUtil.RETURN_TYPE+"["+response.getEntityResultType()+"]");
			if (response.getReturnCode() == ConstantsUtil.ONE
					&& response.getEntityResults().length > ConstantsUtil.ZERO) {
				custResponse = new AtwsCustomResponse(ConstantsUtil.ONE,ConstantsUtil.CREATED+" "+ConstantsUtil.SUCCESSFULLY);
			} else  {
				custResponse = new AtwsCustomResponse(ConstantsUtil.ZERO,
						ConstantsUtil.UNABLE_TO + " " + ConstantsUtil.CREATE);
				
				CommonsUtil.throwAtwsErrror(response);
			

			}

		}catch (RemoteException e) {
			e.printStackTrace();
			log.error(e.getMessage());
		}catch(ClassCastException e){
			
			log.error(e.getMessage());
		}
		
		
		
		return custResponse;
	}
	
	
	/**
	 * Implements Update for TicketDao
	 * 
	 * @param AccountID
	 *            : Customer Account id as String
	 * @param TicketNumber
	 *            : Ticket Number as String
	 * @param TicketCategory
	 *            : Category of Ticket as String
	 * @param DueDateTime
	 *            : Due DateTime of Ticket id as String
	 * @param CreateDate
	 *            : CreateDate of Ticket as String
	 * @param Priority
	 *            : Priority of Ticket an Integer
	 * @param Status
	 * 			  : Status of Ticket as an Integer
	 * @param Title
	 * 			  : Title of Ticket as an String
	 * @author Nishant Tiwari
	 * @created at 05-Nov-2019
	 * @return Case1: Returns 1 if successfully Updated the Ticket. 
	 * 			Case2: Returns 0 in case of faliure.
	 * @see AtwsCustomResponse#getStatus() Returns Status of Response
	 * @see AtwsCustomResponse#getData() Returns Object as an ArrayLsit of Response
	 * @see TicketDao#Update(Integer, String, Integer, String, String, Integer, Integer, String)
	 */

	public AtwsCustomResponse Update(String accountID,String queueID,String id,String dueDateTime,String priority,String status,String title) {
		Ticket ticket = null;
		AtwsCustomResponse custResponse = null;
		
		try {
			custResponse = new AtwsCustomResponse(ConstantsUtil.ZERO,ConstantsUtil.EXCEPTION_MESSAGE);
			ticket = new Ticket();
			ticket.setAccountID(Integer.parseInt(accountID));
			ticket.setQueueID(Integer.parseInt(queueID));
			ticket.setId(Long.parseLong(id));
			ticket.setDueDateTime(dueDateTime);
			ticket.setPriority(Integer.parseInt(priority));
			ticket.setStatus(Integer.parseInt(status));
			ticket.setTitle(title);
			
			Entity[] arrEntity = {ticket};
			/**Setting Default Response**/
			custResponse = new AtwsCustomResponse(ConstantsUtil.ZERO,ConstantsUtil.EXCEPTION_MESSAGE);
			/** Getting Response from Service **/
			ATWSResponse response = stub.update(arrEntity);
			
			//Logging Resposne Here
			log.debug(ConstantsUtil.RESPONSE+" : "+ConstantsUtil.RETURN_CODE+"["+response.getReturnCode()+"] "+ConstantsUtil.RETURN_TYPE+"["+response.getEntityResultType()+"]");
			if (response.getReturnCode() == ConstantsUtil.ONE
					&& response.getEntityResults().length > ConstantsUtil.ZERO) {
				custResponse = new AtwsCustomResponse(ConstantsUtil.ONE,ConstantsUtil.UPDATED+" "+ConstantsUtil.SUCCESSFULLY);
			} else{
				custResponse = new AtwsCustomResponse(ConstantsUtil.ZERO,
						ConstantsUtil.UNABLE_TO + " " + ConstantsUtil.UPDATE);
				CommonsUtil.throwAtwsErrror(response);

			}
		}catch (Exception e) {
			e.printStackTrace();
			log.error(e.getMessage());}
//		}catch(ClassCastException e){
//			
//			log.error(e.getMessage());
//		}
		return custResponse;
	}


	/**
	 * Implements Query for TicketDao to Search Contact
	 * 
	 * @param searchKey
	 *            : Search Key as an String
	 * @param searchTerm
	 *            : Search Terms as an String
	 * @author Nishant Tiwari
	 * @created at 05-Nov-2019
	 * @return 	case1: Returns 1 with Search Object List if Search was Successful. 
	 * 			Case2: Returns 0 in case of faliure.
	 * @see AtwsCustomResponse#getStatus() Returns Status of Response
	 * @see AtwsCustomResponse#getData() Returns Object as an ArrayLsit of Response
	 * @see TicketDao#Query(String, String)
	 */
	public AtwsCustomResponse Query(String searchKey,String searchTerm) {
		AtwsCustomResponse custResponse = null;
		QueryXml queryXml = null;
		ArrayList<Ticket> ticketList = null;
		try {
			custResponse = new AtwsCustomResponse(ConstantsUtil.ZERO,ConstantsUtil.EXCEPTION_MESSAGE);
			
			queryXml = new QueryXml();
			String sxml = queryXml.createCData("Ticket", searchKey, searchTerm, "equals");
			System.out.println("sxml : "+sxml);
			
			/**Setting Default Response**/
			custResponse = new AtwsCustomResponse(ConstantsUtil.ZERO,ConstantsUtil.EXCEPTION_MESSAGE);
			/** Getting Response from Service **/
			ATWSResponse response = stub.query(sxml);
			
			//Logging Response Here
			log.debug(ConstantsUtil.RESPONSE+" : "+ConstantsUtil.RETURN_CODE+"["+response.getReturnCode()+"] "+ConstantsUtil.RETURN_TYPE+"["+response.getEntityResultType()+"]");
				
			if (response.getReturnCode() == ConstantsUtil.ONE) {
				
					if(response.getEntityResults().length > ConstantsUtil.ZERO){
						//Adding Entities in List
						ticketList = new ArrayList<>();
						for(Entity e:response.getEntityResults()){
							Ticket ticketRes = (Ticket) e;
							GregorianCalendar gcal_dueDate = (GregorianCalendar) ticketRes.getDueDateTime();
							GregorianCalendar gcal_createDate = (GregorianCalendar) ticketRes.getCreateDate();
							DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//							dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
							ticketRes.setDueDateTime(dateFormat.format(gcal_dueDate.getTime()));
							ticketRes.setCreateDate(dateFormat.format(gcal_createDate.getTime()));
							
							ticketList.add(ticketRes);
						}
						custResponse = new AtwsCustomResponse(ConstantsUtil.ONE,ConstantsUtil.SEARCH+" "+ConstantsUtil.RESULT+" : "+response.getEntityResults().length,ticketList);
					
					}else if(response.getEntityResults().length == ConstantsUtil.ZERO){
						
						custResponse = new AtwsCustomResponse(ConstantsUtil.ONE,ConstantsUtil.SEARCH+" "+ConstantsUtil.RESULT+" : "+response.getEntityResults().length);
					}
				
			} else{
				custResponse = new AtwsCustomResponse(ConstantsUtil.ZERO,ConstantsUtil.UNABLE_TO+" "+ConstantsUtil.SEARCH);
				
				CommonsUtil.throwAtwsErrror(response);
			}
		} catch (RemoteException e) {
			e.printStackTrace();
			log.error(e.getMessage());
		}catch(ClassCastException e){
			log.error(e.getMessage());
		}
		
		return custResponse;
	}


	
	
}
