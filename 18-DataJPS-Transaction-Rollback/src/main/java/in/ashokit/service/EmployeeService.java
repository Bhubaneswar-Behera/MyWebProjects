package in.ashokit.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Address;
import in.ashokit.entity.Employee;
import in.ashokit.repository.AddressRepository;
import in.ashokit.repository.EmployeeRepository;

/**
 * 
 * @author Bhubaneswar Behera @date 06-Jul-2022
 *
 */
@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private AddressRepository addressRepository;
	
	@Transactional(rollbackOn = Exception.class)
	public void saveData() {
		Employee employee = new Employee();
		employee.setEmployeeId(201);
		employee.setEmployeeName("Ketan");
		employee.setEmployeeSalary(25000.00);
		employeeRepository.save(employee);
		
		int i = 10/0 ;
		
		Address  address  = new Address();
		address.setAddressId(501);
		address.setEmployeeId(201);
		address.setCity("Pune");
		address.setState("MH");
		address.setCountry("INDIA");
		addressRepository.save(address);
		
	}

}
