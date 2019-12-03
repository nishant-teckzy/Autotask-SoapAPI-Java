package com.nft.rpc;

import org.apache.log4j.Logger;
import util.AtwsCustomResponse;
import util.ConstantsUtil;
import com.nft.dao.TicketDao;
import com.nft.daoImpl.TicketDaoImpl;

/**
 * Contains Methods for CRUD Operation
 * 
 * @author Nishant Tiwari
 * @created at 05 Nov 2019
 * 
 */
public class TicketRPC {
	private static final Logger logger = Logger.getLogger(TicketRPC.class);


	TicketDao ticketImpl = new TicketDaoImpl();

	/**
	 * To Create A Ticket
	 * 
	 * @param AccountID
	 *            : Customer Account id as String
	 * @param queueID
	 *            : QueueID of the Ticket as Integer
	 * @param TicketCategory
	 *            : Category of Ticket as String
	 * @param DueDateTime
	 *            : Due Date & Time of Ticket as String
	 * @param CreateDate
	 *            : The Date of Creation of Ticket as String
	 * @param Priority
	 *            : Priority of Ticket as String
	 * @param Status
	 *            : Status of Ticket as String
	 * @param Title
	 *            : Title of Ticket as String
	 * @author Nishant Tiwari
	 * @return Case1: Returns 1 if successfully Created the Ticket. Case2:
	 *         Returns 0 in case of failure.
	 */
	public AtwsCustomResponse createTicket(String accountID, String queueID,
			String ticketCategory, String dueDateTime, String createDate,
			String priority, String status, String title) {
		logger.debug(ConstantsUtil.INPUT + ConstantsUtil.PIPE + accountID
				+ ConstantsUtil.PIPE + queueID + ConstantsUtil.PIPE
				+ ticketCategory + ConstantsUtil.PIPE + dueDateTime
				+ ConstantsUtil.PIPE + createDate + ConstantsUtil.PIPE
				+ priority + ConstantsUtil.PIPE + status + ConstantsUtil.PIPE
				+ title);

		AtwsCustomResponse response = ticketImpl.Create(accountID, queueID, ticketCategory,
				dueDateTime, createDate, priority, status, title);
		
		logger.debug(ConstantsUtil.OUTPUT + response);
		
		return response;
	}

	/**
	 * To Update A Ticket
	 * 
	 * @param AccountID
	 *            : Customer Account id as String
	 * @param queueID
	 *            : QueueID of the Ticket as String
	 * @param id
	 *            : id of the Ticket as String
	 * @param TicketCategory
	 *            : Category of Ticket as String
	 * @param DueDateTime
	 *            : Due DateTime of Ticket id as String
	 * @param CreateDate
	 *            : CreateDate of Ticket as String
	 * @param Priority
	 *            : Priority of Ticket an String
	 * @param Status
	 *            : Status of Ticket as an String
	 * @param Title
	 *            : Title of Ticket as an String
	 * @author Nishant Tiwari
	 * @return Case1: Returns 1 if successfully Updated the Ticket. Case2:
	 *         Returns 0 in case of faliure.
	 */

	public AtwsCustomResponse updateTicket(String accountID, String queueID,
			String id, String dueDateTime, String priority, String status,
			String title) {
		logger.debug(ConstantsUtil.INPUT + ConstantsUtil.PIPE + accountID
				+ ConstantsUtil.PIPE + queueID + ConstantsUtil.PIPE
				+ id + ConstantsUtil.PIPE + dueDateTime
				+ ConstantsUtil.PIPE + priority + ConstantsUtil.PIPE
				+ status + ConstantsUtil.PIPE + title);
		AtwsCustomResponse response = ticketImpl.Update(accountID, queueID, id, dueDateTime, priority,
				status, title);
		logger.debug(ConstantsUtil.OUTPUT + response);
		
		return response;
	}

	/**
	 * To Query A Ticket
	 * 
	 * @param searchKey
	 *            : Search Key as an String
	 * @param searchTerm
	 *            : Search Terms as an String
	 * @author Nishant Tiwari
	 * @return case1: Returns 1 with Search Object List if Search was
	 *         Successful. Case2: Returns 0 in case of faliure.
	 * @see AtwsCustomResponse#getStatus() Returns Status of Response
	 * @see AtwsCustomResponse#getData() Returns Object as an ArrayLsit of
	 *      Response
	 */

	public AtwsCustomResponse queryTicket(String searchKey, String searchTerm) {
		logger.debug(ConstantsUtil.INPUT + ConstantsUtil.PIPE + searchKey + ConstantsUtil.PIPE + searchTerm);
		AtwsCustomResponse response = ticketImpl.Query(searchKey, searchTerm);
		
		logger.debug(ConstantsUtil.OUTPUT + response);
		return response;
	}
}
