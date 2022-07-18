package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.binding.Book;

/**
 * 
 * @author Bhubaneswar Behera @date 18-Jul-2022
 *
 */
@Controller
public class BookController {
	
	@GetMapping("/")
	public String displayForm(Model model) {
		Book bookObject = new Book();
		model.addAttribute("book", bookObject);
		return "index";
	}
	
	@PostMapping("/book")
	public String saveBook(Book bookObject, Model model) {
		System.out.println(bookObject);
		model.addAttribute("message", "Book saved successfully...!!!");
		return "success";
	}
	

}
