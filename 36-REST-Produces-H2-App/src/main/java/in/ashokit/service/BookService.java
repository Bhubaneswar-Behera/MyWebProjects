package in.ashokit.service;

import java.util.List;
import in.ashokit.entity.Book;

/**
 * 
 * @author Bhubaneswar Behera @date 01-Aug-2022
 *
 */

public interface BookService {
	
	public String upsertBook(Book book);
	
	public List<Book> getAllBooks();
	
	//public String updateBook(Book book);
	
	public String deleteBook(Integer bookId);

	
}
