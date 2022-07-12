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
public class IndexController {

	@GetMapping("/")
	public ModelAndView getIndex() {
		ModelAndView modelAndView = new ModelAndView();
		//modelAndView.addObject("message", "Welcome to Spring Boot and Microservices");
		modelAndView.setViewName("index");
		return modelAndView;
	}
}
