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
public class CourseController {
	
	/**
	 * To test the application use the below URL in POSTMAN
	 * http://localhost:8080/course?courseName=JRTP&trainerName=Ashok
	 * 
	 * @param courseName
	 * @param trainerName
	 * @return
	 */
	@GetMapping("/course")
	public ResponseEntity<String> getCourseFess(@RequestParam("courseName")String courseName , @RequestParam("trainerName") String trainerName){
		
		String responseBody  = courseName + " By " + trainerName + " Fess is 7000 INR";
		
		return new ResponseEntity<>(responseBody, HttpStatus.OK);
		
	}

}
