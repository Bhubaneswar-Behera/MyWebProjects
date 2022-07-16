package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import in.ashokit.binding.Product;


/**
 * 
 * @author Bhubaneswar Behera @date 16-Jul-2022
 *
 */
@Controller
public class ProductController {
	
	@GetMapping("/")
	public String getProductForm(Model model) {
		
		//setting data to binding object
		Product productObejct = new Product();
		model.addAttribute("product", productObejct);
		
		//return view name
		return "index";
		
	}
	
	@PostMapping("/product")
	public String handleFormSubmit(Product product, Model model) {
		System.out.println(product);
		
		model.addAttribute("message", "Product saved successfully...");

		//return view name
		return "success";
		
	}

}
