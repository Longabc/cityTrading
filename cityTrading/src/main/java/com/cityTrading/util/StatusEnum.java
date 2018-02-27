package com.cityTrading.util;

public enum StatusEnum {

	SUCCESS(1,"请求成功"),
	ERROR(2,"参数异常"),
	
	;

	StatusEnum(int status, String message) {
		this.status = status;
		this.message = message;
	}

	private int status;
	
	private String message;

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
