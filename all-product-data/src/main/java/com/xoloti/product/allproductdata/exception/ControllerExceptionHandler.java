package com.xoloti.product.allproductdata.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.xoloti.product.allproductdata.dto.Errors;
import com.xoloti.product.allproductdata.dto.ProductResponse;

@ControllerAdvice
public class ControllerExceptionHandler extends ResponseEntityExceptionHandler{

	@ExceptionHandler(value = {BusinessServiceException.class})
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	protected ResponseEntity<ProductResponse> handleException(BusinessServiceException exception,
			WebRequest webRequest){
		ProductResponse response = new ProductResponse();
		Errors error = new Errors();
		error.setErrorStatus(exception.getMessage());
		error.setErrorCode(500);
		response.setError(error);
		
		return new ResponseEntity<ProductResponse> (response, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(value = {CustomRuntimeException.class})
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	protected ResponseEntity<ProductResponse> handleRuntimeException(BusinessServiceException exception,
			WebRequest webRequest){
		ProductResponse response = new ProductResponse();
		Errors error = new Errors();
		error.setErrorStatus(exception.getMessage());
		error.setErrorCode(500);
		response.setError(error);
		
		return new ResponseEntity<ProductResponse> (response, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
