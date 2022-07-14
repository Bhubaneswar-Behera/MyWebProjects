package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 
 * @author Bhubaneswar Behera @date 14-Jul-2022
 *
 */
@Controller
//@RestController == @Controller + @ResponseBody
public class WishController {
	
	@GetMapping("/wish")
	@ResponseBody
	public String getWishMessage() {
		String message = "All The Best...!!!";
		return message;
	}

}
