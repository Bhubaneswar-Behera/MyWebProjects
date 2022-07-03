package in.ashokit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.User;

/**
 * 
 * @author Bhubaneswar Behera @date 03-Jul-2022
 *
 */

public interface UserRepository extends JpaRepository<User, Integer>{
	
	

}
