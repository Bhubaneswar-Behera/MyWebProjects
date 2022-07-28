package in.ashokit.binding;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

/**
 * 
 * @author Bhubaneswar Behera @date 28-Jul-2022
 *
 */
@Data
@XmlRootElement
public class Book {
	private Integer bookId;
	private String bookName;
	private Double bookPrice;

}
