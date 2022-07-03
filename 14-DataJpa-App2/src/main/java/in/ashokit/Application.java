package in.ashokit;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;
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
		
		
		//*********Find by methods in Data JPA Starts *************
		/*User user1 = new User(101,"Ramu","Male",25,"INDIA");
		//userRepository.save(user1);
		
		User user2 = new User(102,"Raju","Male",25,"INDIA");
		User user3 = new User(103,"John","Male",30,"USA");
		User user4 = new User(104,"Smith","Male",32,"CANADA");
		userRepository.saveAll(Arrays.asList(user1,user2,user3,user4));
		
		//Retrieve records based on USER_COUNTRY column data.
		//Retrieve user records who belongs to India
		
		List<User> findByBountry = userRepository.findByCountry("INDIA");
		findByBountry.forEach( user	-> {
			System.out.println("findByBountry : " + user.toString());
		});
			
		//Retrieve records based on AGE column data.
		List<User> findByAge = userRepository.findByAge(30);
			findByAge.forEach( user	-> {
				System.out.println("findByAge : " +user.toString());
			});
		
		//Retrieve users whose age is below 30 years
		List<User> findByAgeGreaterThansAndEqualTo = userRepository.findByAgeGreaterThanEqual(30);
		findByAgeGreaterThansAndEqualTo.forEach( user	-> {
			System.out.println(user.toString());
		});
		
		//Retrieve users whose country is INDAI or USA
		List<User> findByCountriesIn  = userRepository.findByCountryIn(Arrays.asList("INDIA","USA"));
		findByCountriesIn.forEach( user	-> {
			System.out.println("findByCountriesIn : "+user.toString());
		});
		
		//Retrieve users whose country is INDIA and Age is 25 years
		List<User> findByCountriesAndAge  = userRepository.findByCountryAndAge("INDIA", 25);
		findByCountriesAndAge.forEach( user	-> {
			System.out.println("findByCountriesAndAge : "+user.toString());
		});
		
		//Retrieve users whose country is INDIA and AGE is 25 years and GENDER is MALE
		List<User> findByCountryAndAgeAndGender  = userRepository.findByCountryAndAgeAndGender("INDIA", 25,"MALE");
		findByCountryAndAgeAndGender.forEach( user	-> {
			System.out.println("findByCountryAndAgeAndGender : "+user.toString());
		});*/
		//************Find by methods in Data JPA Ends ******************
		
		
		
		//************Custom Queries Starts***************
		User user1 = new User(101,"Ramu","Male",25,"INDIA");
		//userRepository.save(user1);
		
		User user2 = new User(102,"Raju","Male",25,"INDIA");
		User user3 = new User(103,"John","Male",30,"USA");
		User user4 = new User(104,"Smith","Male",32,"CANADA");
		userRepository.saveAll(Arrays.asList(user1,user2,user3,user4));
		
		List<User> getAllUsersHql = userRepository.getAllUsersHql();
		getAllUsersHql.forEach(user -> {
			System.out.println("getAllUsersHql : "+user.toString());
		});
		
		System.out.println("####################################################");
		
		List<User> getAllUsersSql = userRepository.getAllUsersSql();
		getAllUsersSql.forEach(user -> {
			System.out.println("getAllUsersSql : "+user.toString());
		});
		
		System.out.println("####################################################");
		List<User> getAllUsersByCountryHql = userRepository.getAllUsersByCountryHql("INDIA");
		getAllUsersByCountryHql.forEach(user -> {
			System.out.println("getAllUsersByCountryHql : "+user.toString());
		});
		
		System.out.println("####################################################");
		List<User> getAllUsersByCountryAndAgeHql = userRepository.getAllUsersByCountryAndAgeHql("INDIA",25);
		getAllUsersByCountryAndAgeHql.forEach(user -> {
			System.out.println("getAllUsersByCountryAndAgeHql : "+user.toString());
		});
		
		//*****************Custom Queries End **************
		
	}

}
