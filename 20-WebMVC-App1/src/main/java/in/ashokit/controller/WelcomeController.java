package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @author Bhubaneswar Behera @date 11-Jul-2022
 *
 */
@Controller
public class WelcomeController {
	
	@GetMapping("/welcome")
	public ModelAndView getWelcomeMessage() {
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("message","Welcome to Web MVC...!!!");
		modelAndView.setViewName("index");
		
		return modelAndView;
	}

}
