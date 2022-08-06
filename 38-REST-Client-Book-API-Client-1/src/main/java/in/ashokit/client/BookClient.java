package in.ashokit.client;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.ashokit.binding.Book;

/**
 * Swagger URL : https://ashokit-book-app.herokuapp.com/swagger-ui.html
 * 
 * @author Bhubaneswar Behera @date 06-Aug-2022
 *
 */
@Service
public class BookClient {
	
	public void invokeBookTicket() {
		String apiUrl = "https://ashokit-book-app.herokuapp.com/book";
		
		Book book = new Book();
		book.setBookName("Java");
		book.setBookPrice(650.00);
		
		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<String> responseEntity = restTemplate.postForEntity(apiUrl, book, String.class);
		
		System.out.println(responseEntity.getBody());
	}
	
	public void invokeGetBooks() {
		String apiUrl = "https://ashokit-book-app.herokuapp.com/books";
		
		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiUrl,  String.class);
		
		String responseBody = responseEntity.getBody();
		
		System.out.println( responseBody);
		
	}
	
	public void invokeGetBooksInJson() {
		String apiUrl = "https://ashokit-book-app.herokuapp.com/books";
		
		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<Book[]> responseEntity = restTemplate.getForEntity(apiUrl,  Book[].class);
		
		Book[] responseBodyArray = responseEntity.getBody();
		List<Book> bookList = Arrays.asList(responseBodyArray);
		
		bookList.forEach(e -> System.out.println(e));
		/*for(Book book : responseBodyArray) {
			System.out.println( book);
		}*/
	}

}
