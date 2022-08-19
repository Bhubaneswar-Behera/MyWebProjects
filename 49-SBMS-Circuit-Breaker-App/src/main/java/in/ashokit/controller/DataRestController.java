package in.ashokit.controller;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Bhubaneswar Behera @date 18-Aug-2022
 *
 */
@RestController
public class DataRestController {
	
	@GetMapping("/")
	public String getDataFromRedis() {
		System.out.println("***Redis() method called****");
		if(new Random().nextInt(10) <= 10) {
			throw new RuntimeException("Redis Server is down");
		}
		//logic to access data from Redis
		return "data access from redis (main logic) ...";
	}
	
	public String getDataFromDatabse() {
		System.out.println("***Database() method called****");
		//logic to access data from Database
		return "data access from database (fall logic)";
	}

}
