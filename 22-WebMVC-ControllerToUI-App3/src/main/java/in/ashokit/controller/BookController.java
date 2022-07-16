package in.ashokit.controller;

import java.util.Arrays;
import java.util.List;

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
	
	@GetMapping("/books")
	public String getBooksData(Model model) {
		
		//setting data to binding object
		Book bookObejct1 = new Book(101,"Spring",560.00);
		Book bookObejct2 = new Book(102,"DSA",600.00);
		Book bookObejct3 = new Book(103,"AWS",1100.00);
		
		List<Book> bookList = Arrays.asList(bookObejct1,bookObejct2,bookObejct3);
		
		//adding data to model object to send to UI
		model.addAttribute("books", bookList);
		
		//return view name
		return "books";
	}
	
}
