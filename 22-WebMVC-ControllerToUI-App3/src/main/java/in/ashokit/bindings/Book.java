package in.ashokit.bindings;
/**
 * 
 * @author Bhubaneswar Behera @date 14-Jul-2022
 *
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
	private Integer bookId;
	private String bookName;
	private double bookPrice;

}
