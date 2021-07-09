package com.music.album.exception;

public class AlbumException extends RuntimeException {



	private String errorMessage;

	public AlbumException(String message) {
		super(message);
		// this.errorMessage=message;
	}

	public AlbumException(String message, Throwable cause) {
		super(message, cause);
	}

	public String getErrorMessage() {
		return errorMessage;
	}

}
