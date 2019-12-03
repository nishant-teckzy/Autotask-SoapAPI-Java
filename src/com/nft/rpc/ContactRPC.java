/*
 * 
 */
package com.nft.rpc;

import org.apache.log4j.Logger;

import util.AtwsCustomResponse;
import util.ConstantsUtil;
import util.Props;

import com.nft.dao.ContactDao;
import com.nft.daoImpl.ContactDaoImpl;

public class ContactRPC {
	private static final Logger logger = Logger.getLogger(ContactRPC.class);
	static{
		Props.Log4jConfigurator();
	}
	ContactDao contactImpl = new ContactDaoImpl();
	
	public AtwsCustomResponse createContact(String accountID, String active,
			String firstName, String lastName, String mobilePhone,
			String phone, String address, String email) {
		logger.debug(ConstantsUtil.INPUT + ConstantsUtil.PIPE + 
				accountID + 
				ConstantsUtil.PIPE + 
				active+
				ConstantsUtil.PIPE + 
				firstName+
				ConstantsUtil.PIPE + 
				lastName+
				ConstantsUtil.PIPE + 
				mobilePhone+
				ConstantsUtil.PIPE + 
				phone+
				ConstantsUtil.PIPE + 
				address+
				ConstantsUtil.PIPE + 
				address+
				ConstantsUtil.PIPE +
				email);

		AtwsCustomResponse response = contactImpl.Create(accountID, active, firstName, lastName,
				mobilePhone, phone, address, email);
		
		logger.debug(ConstantsUtil.OUTPUT + response);
		return response;
	}
	
	public AtwsCustomResponse updateContact(String accountID,String id, String active,
			String firstName, String lastName, String mobilePhone,
			String phone, String address, String email) {
		
		logger.debug(ConstantsUtil.INPUT + ConstantsUtil.PIPE + 
				accountID + 
				ConstantsUtil.PIPE + 
				id+
				ConstantsUtil.PIPE + 
				active+
				ConstantsUtil.PIPE + 
				firstName+
				ConstantsUtil.PIPE + 
				lastName+
				ConstantsUtil.PIPE + 
				mobilePhone+
				ConstantsUtil.PIPE + 
				phone+
				ConstantsUtil.PIPE + 
				address+
				ConstantsUtil.PIPE + 
				address+
				ConstantsUtil.PIPE +
				email);

		AtwsCustomResponse response = contactImpl.Update(accountID,id, active, firstName, lastName,
				mobilePhone, phone, address, email);
		
		logger.debug(ConstantsUtil.OUTPUT + response);
		return response;
	}
	
	public AtwsCustomResponse queryContact(String searchKey,String searchTerm) {
		logger.debug(ConstantsUtil.INPUT + ConstantsUtil.PIPE + searchKey + ConstantsUtil.PIPE + searchTerm);
		
		AtwsCustomResponse response = contactImpl.Query(searchKey, searchTerm);
		logger.debug(ConstantsUtil.OUTPUT + response);
		return response;
	}
}
