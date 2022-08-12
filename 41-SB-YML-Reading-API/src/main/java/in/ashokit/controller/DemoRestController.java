package in.ashokit.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.properties.AppProperties;

/**
 * 
 * @author Bhubaneswar Behera @date 12-Aug-2022
 *
 */
@RestController
public class DemoRestController {
	
	@Autowired
	private AppProperties appProperties;
	
	@GetMapping("/welcome")
	public String getWelcomeMessage() {
		
		Map<String, String> messages = appProperties.getMessages();
		String value = messages.get("welcomeMessage");
		return value;
	}
	
	@GetMapping("/greet")
	public String getGreetMessage() {
		
		Map<String, String> messages = appProperties.getMessages();
		String value = messages.get("greetMessage");
		return value;
	}
	
	@GetMapping("/wish")
	public String getWishMessage() {
		return appProperties.getMessages().get("wishMessage");
	}

}
