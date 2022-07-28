package in.ashokit.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.Book;

/**
 * 
 * @author Bhubaneswar Behera @date 28-Jul-2022
 *
 */
@RestController
public class BookRestController {
	
	@PostMapping(
			value = "/book" , 
			consumes = {"application/json","application/xml"}
			)
	public ResponseEntity<String> addBook(@RequestBody Book book){
		System.out.println(book);
		
		String message = "Book added successfully...!!!";
		 return new ResponseEntity<String>(message, HttpStatus.CREATED);
		
		 
	}

}
