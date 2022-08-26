package in.ashokit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.WritableResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.exception.ExceptionInfo;

/**
 * 
 * @author Bhubaneswar Behera @date 25-Aug-2022
 *
 */
@RestController
public class DemoRestController {
	
	private Logger logger = LoggerFactory.getLogger(DemoRestController.class);
	
	@GetMapping("/")
	public String doaction() {
		String message = "Action in progress";
		
		try {
			int i = 10 / 0;
		} catch (Exception ex) {
			logger.error("Exception occured : "+ex.getMessage());
			throw new ArithmeticException(ex.getMessage());
		}
		return message;
	}
	
	/*@ExceptionHandler(value=ArithmeticException.class)
	public ResponseEntity<ExceptionInfo> handleArithmeticException(ArithmeticException arithmeticException){
		ExceptionInfo exceptionInfo = new ExceptionInfo();
		
		exceptionInfo.setMessage(arithmeticException.getMessage());
		exceptionInfo.setCode("AIT0004");
		
		return new ResponseEntity<ExceptionInfo>(exceptionInfo, HttpStatus.INTERNAL_SERVER_ERROR);
	}*/

}
