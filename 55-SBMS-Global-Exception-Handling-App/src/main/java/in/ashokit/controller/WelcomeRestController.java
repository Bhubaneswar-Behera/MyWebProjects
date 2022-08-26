package in.ashokit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Bhubaneswar Behera @date 25-Aug-2022
 *
 */
@RestController
public class WelcomeRestController {
	private Logger logger = LoggerFactory.getLogger(WelcomeRestController.class);
	
	@GetMapping("/welcome")
	public String welcome() {
		String message = "Welcome to Spring Boot Exception Handling";
		
		try {
			int i = 10 / 0;
		} catch (Exception ex) {
			logger.error("Exception occured : "+ex.getMessage());
			throw new ArithmeticException(ex.getMessage());
		}
		
		return message;
	}

}
