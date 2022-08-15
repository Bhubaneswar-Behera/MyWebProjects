package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.client.WelcomeClient;

/**
 * 
 * @author Bhubaneswar Behera @date 14-Aug-2022
 *
 */
@RestController
public class GreetRestController {
	
	@Autowired
	private WelcomeClient welcomeClient;
	
	@GetMapping("/greet")
	public String getGreetMessage() {
		String greetMessage = "Good Morning, ";
		
		String welcomeMessage = welcomeClient.invokeWelcomeAPI();
		return greetMessage + welcomeMessage;
	}

}
