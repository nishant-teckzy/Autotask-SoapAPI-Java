package com.nft.daoImpl;

import java.rmi.RemoteException;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import util.AtwsCustomResponse;
import util.CommonsUtil;
import util.ConstantsUtil;
import util.QueryXml;
import net.autotask.ATWS.v1_6.ATWSResponse;
import net.autotask.ATWS.v1_6.ATWSSoapStub;
import net.autotask.ATWS.v1_6.Contact;
import net.autotask.ATWS.v1_6.Entity;


import com.nft.dao.ContactDao;

/**
 * The Class ContactDaoImpl implements all methods of ContactDao.
 * @author Nishant Tiwari
 * @created at 05-Nov-2019
 * @see ContactDao
 */
public class ContactDaoImpl implements ContactDao {
	private static final Logger log = Logger.getLogger(ContactDaoImpl.class);

	/** The stub. */
	ATWSSoapStub stub = null;

	/**
	 * Instantiates a new ContactDaoImpl.
	 */
	public ContactDaoImpl() {
		stub = new CommonsUtil().getStub();
	}

	/**
	 * Implements Create for ContactDao
	 * 
	 * @param AccountID
	 *            : Customer Account id as an Integer
	 * @param Active
	 *            : Active as an Integer
	 * @param firstname
	 *            : firstname of Contact as an String
	 * @param lastname
	 *            : lastname of Contact as an String
	 * @param MobilePhone
	 *            : MobilePhone of Contact as an String
	 * @param Phone
	 *            : Phone of Contact as an String
	 * @param Address
	 *            : Address of Contact as an String
	 * @param Email
	 *            : Email of Contact as an String
	 * @author Nishant Tiwari
	 * @created at 05-Nov-2019
	 * @return Case1: Returns 1 if successfully Created the Contact.
	 * 			Case2: Returns 0 in case of faliure.
	 * @see AtwsCustomResponse#getStatus() Returns Status of Response
	 */
	public AtwsCustomResponse Create(String accountID, String active,
			String firstName, String lastName, String mobilePhone,
			String phone, String address, String email) {
		Contact contact = null;
		AtwsCustomResponse custResponse = null;

		try {
			
			contact = new Contact();
			contact.setAccountID(Integer.parseInt(accountID));
			contact.setActive(Integer.parseInt(active));
			contact.setFirstName(firstName);
			contact.setLastName(lastName);
			contact.setMobilePhone(mobilePhone);
			contact.setPhone(phone);
			contact.setAddressLine(address);
			contact.setEMailAddress(email);

			Entity[] arrEntity = { contact };
			
			/**Setting Default Response**/
			custResponse = new AtwsCustomResponse(ConstantsUtil.ZERO,ConstantsUtil.EXCEPTION_MESSAGE);
			/** Getting Response from Service **/
			ATWSResponse response = stub.create(arrEntity);
	
			//Logging Response Here
			log.debug(ConstantsUtil.RESPONSE+" : "+ConstantsUtil.RETURN_CODE+"["+response.getReturnCode()+"] "+ConstantsUtil.RETURN_TYPE+"["+response.getEntityResultType()+"]");
			
			if (response.getReturnCode() == ConstantsUtil.ONE
					&& response.getEntityResults().length > ConstantsUtil.ZERO) {
				custResponse = new AtwsCustomResponse(ConstantsUtil.ONE,
						ConstantsUtil.CREATED + " "
								+ ConstantsUtil.SUCCESSFULLY);

			} else {

				custResponse = new AtwsCustomResponse(ConstantsUtil.ZERO,
						ConstantsUtil.UNABLE_TO + " " + ConstantsUtil.CREATE);
				
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

	
	/**
	 * Implements Update for ContactDao
	 * 
	 * @param AccountID
	 *            : Customer Account id as an Integer
	 * @param Active
	 *            : Active as an Integer
	 * @param firstname
	 *            : firstname of Contact as an String
	 * @param lastname
	 *            : lastname of Contact as an String
	 * @param MobilePhone
	 *            : MobilePhone of Contact as an String
	 * @param Phone
	 *            : Phone of Contact as an String
	 * @param Address
	 *            : Address of Contact as an String
	 * @param Email
	 *            : Email of Contact as an String
	 * @author Nishant Tiwari
	 * @created at 05-Nov-2019
	 * @return Case1: Returns 1 if successfully Updated the Contact. 
	 * 			Case2: Returns 0 in case of faliure.
	 * @see AtwsCustomResponse#getStatus() Returns Status of Response
	 */
	
	public AtwsCustomResponse Update(String accountID, String id,
			String active, String firstName, String lastName,
			String mobilePhone, String phone, String address, String email) {
		Contact contact = null;
		AtwsCustomResponse custResponse = null;
		try {
			contact = new Contact();
			contact.setAccountID(Integer.parseInt(accountID));
			contact.setId(Long.parseLong(id));
			contact.setActive(Integer.parseInt(active));
			contact.setFirstName(firstName);
			contact.setLastName(lastName);
			contact.setMobilePhone(mobilePhone);
			contact.setPhone(phone);
			contact.setAddressLine(address);
			contact.setEMailAddress(email);

			Entity[] arrEntity = { contact };
			/**Setting Default Response**/
			custResponse = new AtwsCustomResponse(ConstantsUtil.ZERO,ConstantsUtil.EXCEPTION_MESSAGE);
			/** Getting Response from Service **/
			ATWSResponse response = stub.update(arrEntity);
			
			//Logging Resposne Here
			log.debug(ConstantsUtil.RESPONSE+" : "+ConstantsUtil.RETURN_CODE+"["+response.getReturnCode()+"] "+ConstantsUtil.RETURN_TYPE+"["+response.getEntityResultType()+"]");
			if (response.getReturnCode() == ConstantsUtil.ONE
					&& response.getEntityResults().length > ConstantsUtil.ZERO) {
				custResponse = new AtwsCustomResponse(ConstantsUtil.ONE,
						ConstantsUtil.CREATED + " "
								+ ConstantsUtil.SUCCESSFULLY);

			} else {

				custResponse = new AtwsCustomResponse(ConstantsUtil.ZERO,
						ConstantsUtil.UNABLE_TO + " " + ConstantsUtil.UPDATE);
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

	/**
	 * Implements Query for ContactDao to Search Contact
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
	 * @see ContactDao#Query(String, String)
	 */
	public AtwsCustomResponse Query(String searchKey, String searchTerm) {
		AtwsCustomResponse custResponse = null;
		QueryXml queryXml = null;
		ArrayList<Contact> contactList = null;
		try {
			queryXml = new QueryXml();
			String sxml = queryXml.createCData("Contact", searchKey, searchTerm,"equals");
			System.out.println("QUERY--> "+sxml);
			/**Setting Default Response**/
			custResponse = new AtwsCustomResponse(ConstantsUtil.ZERO,ConstantsUtil.EXCEPTION_MESSAGE);
			/** Getting Response from Service **/
			ATWSResponse response = stub.query(sxml);
			//Logging Response Here
			log.debug(ConstantsUtil.RESPONSE+" : "+ConstantsUtil.RETURN_CODE+"["+response.getReturnCode()+"] "+ConstantsUtil.RETURN_TYPE+"["+response.getEntityResultType()+"]");
				if (response.getReturnCode() == ConstantsUtil.ONE) {
				
					if(response.getEntityResults().length > ConstantsUtil.ZERO){
						//Adding Entities in List
						Contact contactRes = (Contact) response.getEntityResults()[0];
						custResponse = new AtwsCustomResponse(response.getReturnCode(),ConstantsUtil.SEARCH+" "+ConstantsUtil.RESULT+" : "+response.getEntityResults().length,contactRes);
					}else if(response.getEntityResults().length == ConstantsUtil.ZERO){
						custResponse = new AtwsCustomResponse(response.getReturnCode(),ConstantsUtil.SEARCH+" "+ConstantsUtil.RESULT+" : "+response.getEntityResults().length);
					}
				
			} else {
				custResponse = new AtwsCustomResponse(response.getReturnCode(),ConstantsUtil.UNABLE_TO+" "+ConstantsUtil.SEARCH);
				CommonsUtil.throwAtwsErrror(response);
			}
			
		}catch (RemoteException e) {
			log.error(e.getMessage());
		}catch(ClassCastException e){
			log.error(e.getMessage());
		}

		return custResponse;
	}

}
