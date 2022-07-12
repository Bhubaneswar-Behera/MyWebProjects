package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @author Bhubaneswar Behera @date 12-Jul-2022
 *
 */
@Controller
public class FirstController {
	
	@GetMapping("/welcome")
	public ModelAndView getWelcomeMessage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", "Welcome to Spring Boot and Microservices");
		modelAndView.setViewName("welcome");
		return modelAndView;
	}
	
	@GetMapping("/greet")
	public ModelAndView getGreetMessage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", "Good Morning...!!!");
		modelAndView.setViewName("greet");
		return modelAndView;
		
	}

}
