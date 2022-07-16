package in.ashokit.binding;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 
 * @author Bhubaneswar Behera @date 16-Jul-2022
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {
	private Integer productId;
	
	private String productName;
	
	private Double productPrice;

}
