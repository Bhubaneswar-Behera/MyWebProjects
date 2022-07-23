package in.ashokit.converters;

import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;

import in.ashokit.binding.Author;
import in.ashokit.binding.Book;

/**
 * 
 * @author Bhubaneswar Behera @date 23-Jul-2022
 *
 */

public class JavatoJsonConverter {
	public static void main(String[] args) throws Exception{
		Author author = new Author();
		author.setAuthorName("Rod Johnson");
		author.setAuthorEmail("rod.johnson@gamil.com");
		author.setAuthoPhoneNumber(88236868l);
		
		Book book = new Book();
		book.setId(101);
		book.setName("Spring");
		book.setPrice(560.00);
		book.setAuthor(author);

		ObjectMapper objectMapper = new ObjectMapper();
		System.out.println("Convertion started");
		
		//converting Java Object to JSON and store into a file
		objectMapper.writeValue(new File("book.json"), book);
		
		System.out.println("Convertion completed");
	}

}
