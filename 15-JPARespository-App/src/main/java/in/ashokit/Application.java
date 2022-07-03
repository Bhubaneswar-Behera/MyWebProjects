package in.ashokit;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import in.ashokit.entity.User;
import in.ashokit.repository.UserRepository;



@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
		
		User user5 = new User(105,"Ganesh","Male",33,"India");
		User user6 = new User(106,"Orleon","Male",33,"Germany");
		User user7 = new User(107,"Charles","Male",33,"Maxico");
		User user8 = new User(108,"Buttler","Male",33,"Austrila");
		User user9 = new User(109,"Cathy","Female",33,"USA");
		User user10 = new User(110,"Tanny","Female",33,"Canada");
		
		userRepository.saveAll(Arrays.asList(user5,user6,user7,user8,user9,user10));
		
		System.out.println("*************Sorting Starts****************");
		List<User> users = userRepository.findAll();
		users.forEach(user -> {
			System.out.println("Users : "+ user);
		});
		
		List<User> usersAscending = userRepository.findAll(Sort.by("age").descending());
		usersAscending.forEach(user -> {
			System.out.println("usersAscending : "+ user);
		});
		
		List<User> usersDescending = userRepository.findAll(Sort.by("userName").descending());
		usersDescending.forEach(user -> {
			System.out.println("usersDescending : "+ user);
		});
		System.out.println("*************Sorting Ends****************");
		//*************Sorting Ends****************
		
		//*************Pagination Starts****************
		System.out.println("*************Pagination Starts****************");
		int pageSize = 3;
		int pageNo = 0;
		
		PageRequest pageRequest = PageRequest.of(pageNo, pageSize);
		Page<User> pageData = userRepository.findAll(pageRequest);
		
		int totalPages= pageData.getTotalPages();
		System.out.println("Total Pages : "+totalPages);
		
		List<User> pageDataUsers = pageData.getContent();
		pageDataUsers.forEach(user -> {
			System.out.println("pageDataUsers : "+ user);
		});
		System.out.println("*************Pagination Ends****************");
		//*************Pagination Ends****************
		
		
		//*****************QBE Starts*******************
		System.out.println("*************QBE Starts****************");
		User entity = new User();
		entity.setCountry("INDIA"); //set if required
		entity.setAge(25); //set if required
		
		Example<User> example = Example.of(entity);
		List<User> exampleUsers = userRepository.findAll();
		
		exampleUsers.forEach(user -> {
			System.out.println("exampleUsers : "+ user);
		});
		System.out.println("*************QBE Ends****************");
		
		
		//*****************QBE Ends*******************
		
	}

}
