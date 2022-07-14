package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 
 * @author Bhubaneswar Behera @date 14-Jul-2022
 *
 */
@Controller
public class GreetController {
	
	@GetMapping("/greet")
	public String getGreetMessage(Model model) {
		String messageText = "Greeting...!!!";
		model.addAttribute("message",messageText);
		return "greet";
	}

}
