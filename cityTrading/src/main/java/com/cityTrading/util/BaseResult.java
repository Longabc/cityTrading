package com.cityTrading.util;

import java.util.List;

public class BaseResult<T> {

	/**
	 * 默认成功
	 */
	private int status = StatusEnum.SUCCESS.getStatus();
	
	private String message  = StatusEnum.SUCCESS.getMessage();
	
	private List<T> data;//返回数据

	public BaseResult() {
		super();
	}


	public List<T> getData() {
		return data;
	}


	public void setData(List<T> data) {
		this.data = data;
	}

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
