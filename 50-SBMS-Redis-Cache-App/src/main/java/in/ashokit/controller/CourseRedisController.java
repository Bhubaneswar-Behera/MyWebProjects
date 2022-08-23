package in.ashokit.controller;

import java.util.List;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.User;

/**
 * 
 * @author Bhubaneswar Behera @date 19-Aug-2022
 *
 */
@RestController
public class CourseRedisController {

		private HashOperations<String, Integer, User> hashOperations;
		
		public CourseRedisController(RedisTemplate<String, String> redisTemplate) {
			hashOperations = redisTemplate.opsForHash();
		}
		
		@PostMapping("/user")
		public String storeData(User user) {
			hashOperations.put("PERSONS", user.getUserId(), user);
			return "success";
		}
		
		@GetMapping("/user/{userId}")
		public User getData(@PathVariable Integer userId) {
			User value = (User) hashOperations.get("PERSONS", userId);
			return value;
		}
		
		@GetMapping("/users")
		public List<User> getAllUser(){
			return hashOperations.values("PERSONS");
		}
		
		@GetMapping("user/{userId}")
		public String deleteUser(@PathVariable Integer userId){
			hashOperations.delete("PERSONS", userId);
			return "User deleted...";
			
		}
}
