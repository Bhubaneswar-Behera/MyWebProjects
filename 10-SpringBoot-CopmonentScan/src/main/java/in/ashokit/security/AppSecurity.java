package in.ashokit.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @Configuration is replacement for XML (Spring-Beans.xml)
 * @Configuration -- > IOC wont create the object by default and will consider
 * definition provided by the programmer.
 * 
 * @author Bhubaneswar Behera @date 23-Jun-2022
 *
 */
@Configuration
public class AppSecurity {
	public AppSecurity() {
		System.out.println("AppSecurity :: Constructor");
	}
	
	@Bean
	public AppSecurity createInstance() {
		AppSecurity appSecurity = new AppSecurity();
		return appSecurity;
	}

}
