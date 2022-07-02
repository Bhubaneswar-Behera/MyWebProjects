package in.ashokit.repository;

import org.springframework.data.repository.CrudRepository;

import in.ashokit.entity.User;

/**
 * 
 * @author Bhubaneswar Behera @date 02-Jul-2022
 *
 */

public interface UserRepository extends CrudRepository<User, Integer>{

}
