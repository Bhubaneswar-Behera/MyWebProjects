package in.ashokit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.ashokit.entity.Book;
import in.ashokit.repository.BookRepository;

/**
 * 
 * @author Bhubaneswar Behera @date 01-Aug-2022
 *
 */

@Service
public class BookServiceImpl implements BookService {
	
	private BookRepository bookRepository;
	
	public BookServiceImpl (BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	@Override
	public String upsertBook(Book book) {
		Integer bookId = book.getBookId();
		
		System.out.println(book);
		
		bookRepository.save(book);
		
		System.out.println(book);
		
		if(bookId == null) {
			return "Record Inserted...!!!";
		} else {
			return "Record Updated...!!!";
		}
		
		//return null;
		
	}
	
	@Override
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}
	
	
	@Override
	public String deleteBook(Integer bookId) {
		bookRepository.deleteById(bookId);
		return "Book deleted successfully...!!!";
	}

}
