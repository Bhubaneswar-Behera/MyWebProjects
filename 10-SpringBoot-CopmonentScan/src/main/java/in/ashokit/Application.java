package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import in.ashokit.security.AppSecurity;

/**
 * @ComponentScan(basePackages = {}) overrides the default behavior.
 * It will only scan which is defined in the  
 * list under (@ComponentScan(basePackages)
 * 
 * 
 * @author Bhubaneswar Behera
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = {"in.ashokit","com.wallmart"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
