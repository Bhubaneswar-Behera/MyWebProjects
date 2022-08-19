package in.ashokit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Bhubaneswar Behera @date 18-Aug-2022
 *
 */
@RestController
public class DemoRestController {
	
	@GetMapping("/")
	public String method1() {
		System.out.println("************method1() executed*********");
		
		String message = "This is method1() response";
		try {
			int i = 10 / 0;
		} catch (Exception e) {
			e.printStackTrace();
			return  method2();
		}
		return message;
	}
	
	
	public String method2() {
		System.out.println("************method2() executed*********");
		String message = "This is method2() response";
		return message;
	}

}
