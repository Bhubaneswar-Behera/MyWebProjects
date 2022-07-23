package in.ashokit.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import lombok.Data;

/**
 * 
 * @author Bhubaneswar Behera @date 21-Jul-2022
 *
 */
@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder
public class Person {
	private Integer id;
	private String name;
	
	@XmlTransient
	private Integer age;
	
	@XmlElement(name= "PhoneNum")
	private long phoneNumber;
	
	@XmlAttribute
	private String type;
	private Address address;
	
	
	
	
}
