package in.ashokit.converters;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.ashokit.binding.Book;

/**
 * 
 * @author Bhubaneswar Behera @date 23-Jul-2022
 *
 */

public class JsonToJavaConverter {
	public static void main(String[] args) throws Exception{
		File jsonFile = new File("book.json");
		
		ObjectMapper objectMapper = new ObjectMapper();
		Book book = objectMapper.readValue(jsonFile, Book.class);
		
		System.out.println(book);
		
	}

}
