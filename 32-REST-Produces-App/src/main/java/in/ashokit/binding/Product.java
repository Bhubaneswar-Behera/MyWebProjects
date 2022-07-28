package in.ashokit.binding;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author Bhubaneswar Behera @date 27-Jul-2022
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
//@XmlRootElement
public class Product {
	
	private Integer productId;
	private String productName;
	private Double productPrice;
	

}
