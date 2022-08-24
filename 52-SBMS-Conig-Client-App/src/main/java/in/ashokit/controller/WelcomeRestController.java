package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Bhubaneswar Behera @date 23-Aug-2022
 *
 */
@RestController
@RefreshScope
public class WelcomeRestController {
	
	@Value("${msg:Config Server Not Working}")
	private String message;
	
	
	@GetMapping("/")
	public String getWelcomeMessage() {
		return message;
	}
	
	

}
