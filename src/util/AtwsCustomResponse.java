package util;



public class AtwsCustomResponse {

	private int status;
	private String message;
	private java.lang.Object data;
	
	
	
	public AtwsCustomResponse(int status, String message) {
		super();
		this.status = status;
		this.message = message;
	}


	public AtwsCustomResponse(int status, String message, Object data) {
		super();
		this.status = status;
		this.message = message;
		this.data = data;
	}
	
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public java.lang.Object getData() {
		return data;
	}
	public void setData(java.lang.Object data) {
		this.data = data;
	}
	
	
	
	
}
