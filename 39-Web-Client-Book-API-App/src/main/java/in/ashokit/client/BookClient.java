package in.ashokit.client;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import in.ashokit.binding.Book;

/**
 * 
 * @author Bhubaneswar Behera @date 09-Aug-2022
 *
 */
@Service
public class BookClient {
	
	public void invokeSaveBooks() {
		
		Book book = new Book();
		book.setBookName("Angular");
		book.setBookPrice(120.00);
		
		String apiUrl = "https://ashokit-book-app.herokuapp.com/book";
		
		WebClient webClient = WebClient.create();
		
		String response = webClient.post() //POST Request
						.uri(apiUrl) //Endpoint URL
						.bodyValue(book) //set the body
						.retrieve() //retrieve response body
						.bodyToMono(String.class) //bind response data
						.block(); //make it sync
		
		System.out.println(response);
	}
	
	
	/**
	 * Synchronous call using WebClient using block() method
	 * 
	 */
	public void invokeGetBooks() {
		String apiUrl = "https://ashokit-book-app.herokuapp.com/books";
		
		WebClient webClient = WebClient.create();
		
		/*String body = webClient.get() //GET Request
					.uri(apiUrl) //Endpoint URL
					.retrieve() //retrieve response body
					.bodyToMono(String.class) //bind response data
					.block(); //make it sync
					
			System.out.println(body);
		 */		
		Book[] responseData = webClient.get()
				.uri(apiUrl)
				.retrieve()
				.bodyToMono(Book[].class)
				.block(); //Synchronous communication
		
		for(Book book : responseData) {
			System.out.println(book);
		}
		
	}
	
	/**
	 * Asynchronous call using WebClient using subscribe() method
	 * 
	 */
	public void invokeGetBooksAsync() {
		String apiUrl = "https://ashokit-book-app.herokuapp.com/books";
		
		WebClient webClient = WebClient.create();
			
		webClient.get()
				.uri(apiUrl)
				.retrieve()
				.bodyToMono(Book[].class)
				.subscribe(BookClient :: responseHandler); //Asynchronous communications
		
		System.out.println("******************Request Sent***********************");
		
		
	}
	
	public static void responseHandler(Book[] books) {
		for(Book book : books) {
			System.out.println(book);
		}
		
	}

}
