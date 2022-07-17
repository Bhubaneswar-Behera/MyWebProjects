package in.ashokit.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import in.ashokit.binding.User;

/**
 * 
 * @author Bhubaneswar Behera @date 17-Jul-2022
 *
 */
@Controller
public class UserController {
	
	@GetMapping("/")
	public String getForm(Model model) {
		User userObject = new User();
		model.addAttribute("user",userObject);

		return "index";
		
	}
	
	@PostMapping("/register")
	public String handleRegistrationButton(@Valid User userForm, BindingResult bindingResult,Model model) {
		
		if(bindingResult.hasErrors()) {
			return "index";
		}
		
		System.out.println(userForm);
		//logic to store form data in DB
		
		model.addAttribute("message", "Your Registration Successful...!!!");
		
		return "success";
		
	}

}
