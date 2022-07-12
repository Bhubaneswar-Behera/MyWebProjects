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
public class SecondController {
	
	@GetMapping("/wish")
	public ModelAndView getWishMessage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", "All The Best...!!!");
		modelAndView.setViewName("wish");
		return modelAndView;
	}

}
