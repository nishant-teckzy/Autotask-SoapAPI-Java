package com.nft.dao;

import util.AtwsCustomResponse;


public interface TicketDao {
	
	
	public AtwsCustomResponse Create(String accountID,String queueID,String ticketCategory,String dueDateTime,String createDate,String priority,String status,String title);
	
	public AtwsCustomResponse Update(String accountID,String queueID,String id,String dueDateTime,String priority,String status,String title);
	
	public AtwsCustomResponse Query(String searchKey,String searchTerm);
	

}
