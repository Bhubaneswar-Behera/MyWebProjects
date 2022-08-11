package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Bhubaneswar Behera @date 11-Aug-2022
 *
 */
@RestController
public class WelcomeRestController {
	
	@Value("${messages.welcome}")
	private String welcomeMessage ;
	
	@Value("${messages.greet}")
	private String greetMessage ;
	
	@GetMapping("/welcome")
	public String welcomeMessage() {
		
		return welcomeMessage;
	}
	
	@GetMapping("/greet")
	public String greetMessage() {
		
		return greetMessage;
	}

}
