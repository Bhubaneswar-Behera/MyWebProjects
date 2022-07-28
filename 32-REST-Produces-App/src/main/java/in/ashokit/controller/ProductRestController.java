package in.ashokit.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.Product;

/**
 * 
 * @author Bhubaneswar Behera @date 27-Jul-2022
 *
 */
@RestController
public class ProductRestController {
	
	@GetMapping(
			value = "/product", 
			//produces = {"application/xml","application/json"}
			produces = {"application/json"}
			)
	public ResponseEntity<Product> getProduct(){
		
		Product productObject = new Product();
		productObject.setProductId(101);
		productObject.setProductName("Mouse");
		productObject.setProductPrice(560.00);
		
		return new ResponseEntity<Product>(productObject, HttpStatus.OK);
	}
	
	@GetMapping("/products")
	public ResponseEntity<List<Product>> getProductList(){ 
		Product productObject1 = new Product(101,"Mouse",560.00);
		Product productObject2 = new Product(102,"Mouse2",566.00);
		Product productObject3 = new Product(103,"Mouse3",650.00);
		
		List<Product> products = Arrays.asList(productObject1,productObject2,productObject3);
		
		return new ResponseEntity<List<Product>>(products,HttpStatus.OK);
		
	}
	

}
