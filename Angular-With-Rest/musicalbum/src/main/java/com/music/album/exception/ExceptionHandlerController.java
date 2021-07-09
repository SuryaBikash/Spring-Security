package com.music.album.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerController {

	@ExceptionHandler(AlbumException.class)
	protected ResponseEntity<ExceptionResponse>  albumException(AlbumException me){
		
		ExceptionResponse exceptionResponse= new ExceptionResponse(HttpStatus.BAD_REQUEST);
		
		exceptionResponse.setMessage(me.getMessage());
		return new ResponseEntity<ExceptionResponse> (exceptionResponse,HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
