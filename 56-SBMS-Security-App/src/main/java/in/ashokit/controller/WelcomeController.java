package in.ashokit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Bhubaneswar Behera @date 26-Aug-2022
 *
 */
@RestController
public class WelcomeController {
	
		@GetMapping("/")
		public String welcome() {
			
			String message = "Welcome to Spring Boot Security ...!!!";
			
			return message;
			
		}
}
