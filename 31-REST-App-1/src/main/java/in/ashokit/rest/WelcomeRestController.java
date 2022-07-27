package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Bhubaneswar Behera @date 25-Jul-2022
 *
 */
@RestController
public class WelcomeRestController {
	
	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcomeMessage(){
		
		String responsePayload = "Welcome To Spring RESTFul Services";
		
		return new ResponseEntity<>(responsePayload, HttpStatus.OK);
		
	}
	
	/**
	 * To test the application use the below URL in POSTMAN
	 * 	http://localhost:8080/welcome1?name=Raju
	 * 
	 * @param name
	 * @return
	 */
	@GetMapping("/welcome1")
	public ResponseEntity<String> getWelcomeMessage1(@RequestParam("name") String  name){
		
		String responsePayload = name + " Welcome To Spring RESTFul Services";
		
		return new ResponseEntity<>(responsePayload, HttpStatus.OK);
		
	}
	
	@GetMapping("/greet")
	public String getGreetMessage(){
		
		String responsePayload = "Good Morning ...!!!";
		
		return responsePayload;
		
	}

}
