package in.ashokit.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import in.ashokit.exception.ExceptionInfo;
import in.ashokit.exception.NoDataFoundException;

/**
 * 
 * @author Bhubaneswar Behera @date 26-Aug-2022
 *
 */
@RestControllerAdvice
public class AppExceptionHandler {
	
	@ExceptionHandler(value=ArithmeticException.class)
	public ResponseEntity<ExceptionInfo> handleArithmeticException(ArithmeticException arithmeticException){
		ExceptionInfo exceptionInfo = new ExceptionInfo();
		
		exceptionInfo.setMessage(arithmeticException.getMessage());
		exceptionInfo.setCode("AIT0004");
		
		return new ResponseEntity<ExceptionInfo>(exceptionInfo, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(value = NoDataFoundException.class)
	public ResponseEntity<ExceptionInfo> handleNoDataFoundException(NoDataFoundException exception) {
		ExceptionInfo exceptionInfo = new ExceptionInfo();
				
		exceptionInfo.setMessage(exception.getMessage());
		exceptionInfo.setCode("ATT005");
		
		return new ResponseEntity<>(exceptionInfo, HttpStatus.BAD_REQUEST);
		
	}

}
