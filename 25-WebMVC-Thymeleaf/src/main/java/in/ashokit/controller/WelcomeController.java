package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 
 * @author Bhubaneswar Behera @date 17-Jul-2022
 *
 */
@Controller
public class WelcomeController {
	
	@GetMapping("/")
	public String getWelcomeMessage(Model model) {
		model.addAttribute("message", "Welcome to Spring Web MVC Thymeleaf...!!!");
		return "index";
		
	}

}
