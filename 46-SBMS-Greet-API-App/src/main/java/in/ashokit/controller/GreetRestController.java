package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
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
	
	@Autowired
	private Environment environment;
	
	@GetMapping("/greet")
	public String getGreetMessage() {
		String port = environment.getProperty("server.port");
		String greetMessage = "Good Morning, " + " Port :: "+port;
		
		String welcomeMessage = welcomeClient.invokeWelcomeAPI();
		return greetMessage + welcomeMessage;
	}

}
