package in.ashokit.conroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.entity.Book;
import in.ashokit.service.BookService;

/**
 * 
 * @author Bhubaneswar Behera @date 01-Aug-2022
 *
 */
@RestController
public class BookRestController {
	
	@Autowired
	private BookService bookService;
	
	/**
	 * 
	 * URL : localhost:8080/book
	 * 
	 * @param book
	 * @return
	 */
	@PostMapping("/book")
	public ResponseEntity<String> addBook(@RequestBody  Book book) {
		String message = bookService.upsertBook(book);
		return new ResponseEntity<String>(message ,  HttpStatus.CREATED);
	}
	
	/**
	 * URL : localhost:8080/book
	 * 
	 * @return
	 */
	@GetMapping("/books")
	public ResponseEntity<List<Book>> getAllBooks(){
		List<Book> bookList = bookService.getAllBooks();
		return new ResponseEntity<List<Book>>(bookList ,  HttpStatus.OK);
		
	}
	
	/**
	 * 
	 * URL : localhost:8080/book
	 * 
	 * @param book
	 * @return
	 */
	@PutMapping("/book")
	public ResponseEntity<String> updateBook(@RequestBody Book book){
		String message = bookService.upsertBook(book);
		return new ResponseEntity<String>(message, HttpStatus.OK);
		
	}
	
	/**
	 * 
	 * 
	 * @param bookId
	 * @return
	 */
	@DeleteMapping("/book/{bookId}")
	public ResponseEntity<String> deleteBook(@PathVariable Integer bookId){
		String message = bookService.deleteBook(bookId);
		return new ResponseEntity<String>(message, HttpStatus.OK);
	}

}
