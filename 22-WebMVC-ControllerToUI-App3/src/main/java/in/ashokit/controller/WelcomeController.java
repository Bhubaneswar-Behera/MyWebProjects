package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @author Bhubaneswar Behera @date 14-Jul-2022
 *
 */
@Controller
public class WelcomeController {

	@GetMapping("/welcome")
	public ModelAndView welcomeMessage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", "Welcome To Spring Web MVC");
		modelAndView.setViewName("welcome");
		return modelAndView;
	}
}
