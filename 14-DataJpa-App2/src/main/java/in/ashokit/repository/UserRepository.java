package in.ashokit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.ashokit.entity.User;

/**
 * 
 * @author Bhubaneswar Behera @date 02-Jul-2022
 *
 */

public interface UserRepository extends CrudRepository<User, Integer>{
	//***********find By Methods Starts*******************************
	
	//Select * from user_master where user_country = ?
	public List<User> findByCountry(String countryName);
	
	//Select * from user_master where user_age = ?
	public List<User> findByAge(Integer age);
	
	//Select * from user_master where user_age >= ?
	public List<User> findByAgeGreaterThanEqual(Integer age);
	
	//Select * from user_master where user_country IN (? , ? , ? ...) 
	public List<User> findByCountryIn(List<String> countries);
	
	//Select * from user_master where user_country = 'INDIA' and user_age = 25;
	public List<User> findByCountryAndAge(String countryName , Integer age);
	
	//Select * from user_master where user_country = 'INDIA' and user_age = 25 and gender = "MALE";
	public List<User> findByCountryAndAgeAndGender(String countryName , Integer age, String gender);
	
	//***********find By Methods Starts*******************************
	
	
	
	//***************Custom Query Starts *******************
	@Query(value = "From User")
	public List<User> getAllUsersHql();
	
	@Query(value = "select * from user_master" , nativeQuery = true)
	public List<User> getAllUsersSql();
	
	@Query(value = "From User where country = :countryName")
	public List<User> getAllUsersByCountryHql(String countryName);
	
	@Query(value = "From User where country = :countryName and age = :age")
	public List<User> getAllUsersByCountryAndAgeHql(String countryName, Integer age);
	
	//***************Custom Query Ends *******************
	
}
