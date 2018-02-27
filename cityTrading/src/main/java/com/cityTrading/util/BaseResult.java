package com.cityTrading.util;

public class BaseResult {

	private int status;
	
	private String message;
	
	public BaseResult(int status, String message) {
		super();
		this.status = status;
		this.message = message;
	}

	public BaseResult(StatusEnum info) {
		this.status = info.getStatus();
		this.message = info.getMessage();
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
	
	
}
