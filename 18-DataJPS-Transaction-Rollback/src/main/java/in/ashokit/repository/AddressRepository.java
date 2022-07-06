package in.ashokit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Address;

/**
 * 
 * @author Bhubaneswar Behera @date 06-Jul-2022
 *
 */

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
