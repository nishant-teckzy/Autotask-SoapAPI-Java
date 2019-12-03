package main;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import net.autotask.ATWS.v1_6.ATWSResponse;
import net.autotask.ATWS.v1_6.ATWSSoapStub;
import net.autotask.ATWS.v1_6.Contact;
import net.autotask.ATWS.v1_6.Entity;
import net.autotask.ATWS.v1_6.Ticket;
import util.CommonsUtil;
import util.ConstantsUtil;

import com.nft.rpc.ContactRPC;
import com.nft.rpc.TicketRPC;
//TODO:Put Username,Password,Integration Code in atws.properties & put Account ID in Constants


public class Test {
//	contact.setAccountID(ConstantsUtil.ACCOUNT_ID);
	public static void main(String[] args) throws RemoteException, MalformedURLException {
	
//		ContactRPC conrpc = new ContactRPC();
		TicketRPC ticketRPC = new TicketRPC();
		System.out.println(ticketRPC.createTicket(ConstantsUtil.ACCOUNT_ID, "8", "3", "2018-9-06", "2019-11-06", "3", "1", "TestTicket").getMessage());
//		System.out.println(ticketRPC.updateTicket("ConstantsUtil.ACCOUNT_ID","8","7884","2019-11-06","3","8","MyTicket1").getMessage());
//		ArrayList<Ticket> al = (ArrayList<Ticket>) ticketRPC.queryTicket("AccountID", "ConstantsUtil.ACCOUNT_ID").getData();
//		System.out.println(al.size());
//		ArrayList<Contact> al1 = (ArrayList<Contact>) conrpc.queryContact("AccountID", "ConstantsUtil.ACCOUNT_ID").getData();
//		
//		DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//		df.setTimeZone(TimeZone.getTimeZone("GMT"));
//		System.out.println(conrpc.queryContact("AccountID", "ConstantsUtil.ACCOUNT_ID").getMessage());
//		ticketRPC.createTicket("ConstantsUtil.ACCOUNT_ID", "8", "3", "2019-11-06T07:35:03Z", "2019-11-06", "3", "1", "TestTicket");
//		System.out.println(ticketRPC.queryTicket("AccountID", "ConstantsUtil.ACCOUNT_ID").getMessage());
//				System.out.println(ticketRPC.queryTicket("AccountID", "ConstantsUtil.ACCOUNT_ID").getMessage());
//		System.out.println(conrpc.createContact("ConstantsUtil.ACCOUNT_ID", "1", "Test", "BOT", "999999999", "854755", "MilkyWay", "testBot@BotWorld.com").getMessage());

//		System.out.println(conrpc.queryContact("EmailAddress", "testBot@BotWorld.com"));
//		ticketRPC.createTicket(accountID, queueID, ticketCategory, dueDateTime, createDate, priority, status, title)
		
		
		
//		ATWSSoapStub stub = new CommonsUtil().getStub();
		
		
//		System.out.println(stub.query(sxml).getEntityResults().length);
		
		Ticket ticket = new Ticket();
		ticket.setAccountID(ConstantsUtil.ACCOUNT_ID);
		ticket.setId(7884);
		ticket.setQueueID(8);
		ticket.setDueDateTime("2019-11-06");
		ticket.setPriority(3);
		ticket.setStatus(8);
		ticket.setTitle("MyTicket3");
		ticket.setQueueID(8);
		
		
//		Entity[] arrEntity = {ticket};
//		ATWSResponse response = stub.update(arrEntity);
//		
//		
//		System.out.println(response.getReturnCode());
//		System.out.println(response.getEntityResultType());
//		System.out.println(response.getErrors()[0].getMessage());
//		Entity e =  response.getEntityResults()[0];
//		
//		Ticket t = (Ticket)e;
//		System.out.println(t.getAccountID());

	}

	
}
