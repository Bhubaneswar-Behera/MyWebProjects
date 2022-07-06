package in.ashokit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Employee;

/**
 * 
 * @author Bhubaneswar Behera @date 06-Jul-2022
 *
 */

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
