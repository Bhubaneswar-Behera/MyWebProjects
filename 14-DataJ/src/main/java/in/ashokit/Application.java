package in.ashokit;

import java.sql.Array;
import java.util.Arrays;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.User;
import in.ashokit.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);
		
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
		
		/*User user1 = new User(101,"Ramu","Male",25,"India");
		//userRepository.save(user1);
		
		User user2 = new User(102,"Raju","Male",25,"India");
		User user3 = new User(103,"John","Male",25,"USA");
		User user4 = new User(104,"Smith","Male",25,"CANADA");
		userRepository.saveAll(Arrays.asList(user1,user2,user3,user4));
		
		Optional<User> findById = userRepository.findById(101);
		
		if(findById.isPresent()) {
			System.out.println(findById.get());
		}
		
		Iterable<User> allById = userRepository.findAllById(Arrays.asList(101,102,103));
		
		allById.forEach( user -> {
			System.out.println(user);
		});
		
		Iterable<User> findAll = userRepository.findAll();
		findAll.forEach( user -> {
			System.out.println(user);
		});
		
		long count  = userRepository.count();
		System.out.println("Total number of records : "+count);
		
		boolean existsById = userRepository.existsById(101);
		System.out.println("Records present with id 101 : "+existsById);
		
	
		//userRepository.deleteById(104);
		//System.out.println();
		userRepository.deleteAllById(Arrays.asList(102,103));*/
		
		User user1 = new User(101,"Ramu","Male",75,"India");
		//userRepository.save(user1);
		
		User user2 = new User(102,"Raju","Male",75,"India");
		User user3 = new User(103,"John","Male",85,"USA");
		User user4 = new User(104,"Smith","Male",25,"CANADA");
		userRepository.saveAll(Arrays.asList(user1,user2,user3,user4));
		
		//Retrieve records based on USER_COUNTRY column data. Retrieve user records
		//who belongs to India
		
		//Retrieve users whose age is is below 30 years
		
		
	}

}
