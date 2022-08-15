package in.ashokit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Bhubaneswar Behera @date 14-Aug-2022
 *
 */
@RestController
public class WelcomeRestController {
	
	@GetMapping("/welcome")
	public String getWelcomeMessage() {
		String message = "Welcome To Spring Boot and Microservice...!!!";
		
		return message;
		
	}

}
