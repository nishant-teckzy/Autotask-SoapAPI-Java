package com.nft.dao;

import util.AtwsCustomResponse;

public interface ContactDao {
	
	public AtwsCustomResponse Create(String accountID,String active,String firstName,String lastName,String mobilePhone,String phone,String address,String email);
	
	public AtwsCustomResponse Update(String accountID,String id,String active,String firstName,String lastName,String mobilePhone,String phone,String address,String email);
	
	public AtwsCustomResponse Query(String searchKey,String searchTerm);

}
