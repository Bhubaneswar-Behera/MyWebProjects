package in.ashokit.bindings;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

/**
 * 
 * @author Bhubaneswar Behera @date 21-Jul-2022
 *
 */
@Data
@XmlRootElement
public class Person {
	private Integer id;
	private String name;
	private Integer age;
	private long phoneNumber;
	private Address address;
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", phoneNumber=" + phoneNumber + "]";
	}

	
	
}
