package in.ashokit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.ashokit.security.AppSecurity;

/**
 * 
 * @author Bhubaneswar Behera @date 24-Jun-2022
 *
 */
@Configuration
public class AppConfig {
	public AppConfig() {
		System.out.println("AppConfig :: Constructor");
	}
	
	@Bean
	public AppSecurity createInstance() {
		AppSecurity appSecurity = new AppSecurity();
		return appSecurity;
	}
}
