package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Bhubaneswar Behera @date 14-Aug-2022
 *
 */
@RestController
public class WelcomeRestController {
	
	@Autowired
	private Environment environment;
	
	@GetMapping("/welcome")
	public String getWelcomeMessage() {
		String property = environment.getProperty("server.port");
		String message = "Welcome To Spring Boot and Microservice...!!!" + " Port is :: " + property;
		
		return message;
		
	}

}
