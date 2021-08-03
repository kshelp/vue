package com.example.demo.dto;

public class ResponseVO<T> {
	
	private String message;
	private boolean check = true;
	private T response;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isCheck() {
		return check;
	}
	public void setCheck(boolean check) {
		this.check = check;
	}
	public T getResponse() {
		return response;
	}
	public void setResponse(T response) {
		this.response = response;
	}
	@Override
	public String toString() {
		return "ResponseVO [message=" + message + ", check=" + check + ", response=" + response + "]";
	}
	
}
