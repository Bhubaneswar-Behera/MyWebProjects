package in.ashokit.binding;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author Bhubaneswar Behera @date 09-Aug-2022
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
	private Integer bookId;
	private String bookName;
	private Double bookPrice;
	

}
