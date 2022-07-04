package in.ashokit;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Product;
import in.ashokit.repository.ProductRepository;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);
		
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		ProductRepository userRepository = context.getBean(ProductRepository.class);
		
		Product product1 = new Product();
		Product product2 = new Product();
		Product product3 = new Product();
		Product product4 = new Product();
		Product product5 = new Product();
		
		product1.setPid(102);
		product1.setPname("Mouse");
		product1.setPrice(500.00);
		
		product2.setPid(102);
		product2.setPname("Keyboard");
		
		
		product3.setPid(103);
		product3.setPname("HDD");
		product3.setPrice(300.00);
		
		product4.setPname("RAM");
		product4.setPrice(300.00);
		
		product5.setPname("MONITOR");
		product5.setPrice(300.00);
	
		userRepository.saveAll(Arrays.asList(product1, product2, product3,product4));
	}

}
