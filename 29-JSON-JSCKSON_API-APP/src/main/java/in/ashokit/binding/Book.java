package in.ashokit.binding;

import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

/**
 * 
 * @author Bhubaneswar Behera @date 23-Jul-2022
 *
 */
@Data
@JsonPropertyOrder
public class Book {
	
	@JsonProperty(value = "bookId")
	private Integer Id;
	private String name;
	private Double price;
	private Author author;

}
