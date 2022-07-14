package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.ashokit.bindings.Book;

/**
 * 
 * @author Bhubaneswar Behera @date 14-Jul-2022
 *
 */
@Controller
public class BookController {
	
	@GetMapping("/book")
	public String getBookData(Model model) {
		
		//setting data to binding object
		Book bookObejct = new Book(101,"Spring",560.00);
		
		//adding data to model object to send to UI
		model.addAttribute("book", bookObejct);
		
		//return view name
		return "book";
	}
	
}
