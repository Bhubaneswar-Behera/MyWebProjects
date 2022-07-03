package in.ashokit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.User;

/**
 * 
 * @author Bhubaneswar Behera @date 03-Jul-2022
 *
 */

public interface UserRepositoryJPA extends JpaRepository<User, Integer> {

}
