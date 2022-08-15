package in.ashokit.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 
 * @author Bhubaneswar Behera @date 14-Aug-2022
 *
 */
@FeignClient(name="WELCOME-API")
//@FeignClient(url="http://localhost::8081/welcome") Note : not recommended as URL might change
public interface WelcomeClient {
	
	@GetMapping("/greet")
	public String invokeWelcomeAPI();

}
