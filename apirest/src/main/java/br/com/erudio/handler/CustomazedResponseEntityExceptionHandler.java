package br.com.erudio.handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import br.com.erudio.Exceptions.ExceptionsResponse;
import br.com.erudio.Exceptions.UnsupportedMathOperation;

@RestController
@ControllerAdvice
public class CustomazedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ExceptionsResponse> handelerAllException
	(Exception ex, WebRequest request){
		ExceptionsResponse exceptionResponse = new ExceptionsResponse(
				new Date(),
				ex.getMessage(),
				request.getDescription(false)				
				);
		return new ResponseEntity<>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(UnsupportedMathOperation.class)
	public final ResponseEntity<ExceptionsResponse> handelerBadRequestException
	(Exception ex, WebRequest request){
		ExceptionsResponse exceptionResponse = new ExceptionsResponse(
				new Date(),
				ex.getMessage(),
				request.getDescription(false)				
				);
		return new ResponseEntity<>(exceptionResponse, HttpStatus.BAD_REQUEST);
	}

}
