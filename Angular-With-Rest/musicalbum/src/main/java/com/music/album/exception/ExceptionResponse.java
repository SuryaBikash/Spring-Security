package com.music.album.exception;

import org.springframework.http.HttpStatus;

public class ExceptionResponse {

	private HttpStatus status;
	private String message;

	public HttpStatus getStatus() {
		return status;
	}

	public String getData() {
		return message;
	}

	public ExceptionResponse(HttpStatus status, String message) {
		super();
		this.status = status;
		this.message = message;
	}

	public ExceptionResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ExceptionResponse(HttpStatus status) {
		super();
		this.status = status;
	}

}
