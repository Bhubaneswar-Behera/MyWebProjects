package in.ashokit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.exception.NoDataFoundException;

/**
 * 
 * @author Bhubaneswar Behera @date 26-Aug-2022
 *
 */
@RestController
public class BookController {
	
	@GetMapping("/price/{isbn}")
	public String getPrice(@PathVariable  String isbn) {
		
		String message = "";
		
		if(isbn.equals("ISBN001")) {
			message = "Book Price is : 400$";
		} else {
			throw new NoDataFoundException("Invalid ISBN");
		}
		
		return message;
		
	}

}
