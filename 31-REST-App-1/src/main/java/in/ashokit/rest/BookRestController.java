package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Template Pattern Example :
 * 
 * @author Bhubaneswar Behera @date 27-Jul-2022
 *
 */
@RestController
public class BookRestController {

	/**
	 * URL : localhost:8080/book/Spring/ 
	 * 
	 * @param name
	 * @return
	 */
	@GetMapping("/book/{name}")
	public ResponseEntity<String> getBookPrice(@PathVariable("name") String name) {
		String responseBody = name + " Price is 400$ ";
		return new ResponseEntity<>(responseBody, HttpStatus.OK);
	}

	/**
	 * URL : localhost:8080/book/Spring/rodjohnson
	 * 
	 * @param bookName
	 * @param authorName
	 * @return
	 */
	@GetMapping("/book/{bookName}/{authorName}")
	public ResponseEntity<String> getBook(@PathVariable("bookName") String bookName,
			@PathVariable("authorName") String authorName) {
		String responseBody = bookName + " By " + authorName + " is out of stock ";

		return new ResponseEntity<>(responseBody, HttpStatus.OK);

	}

}
