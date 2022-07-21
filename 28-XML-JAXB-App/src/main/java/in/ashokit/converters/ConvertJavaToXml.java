package in.ashokit.converters;
/**
 * 
 * @author Bhubaneswar Behera @date 21-Jul-2022
 *
 */

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import in.ashokit.bindings.Address;
import in.ashokit.bindings.Person;

public class ConvertJavaToXml {
	
	public static void main(String[] args) throws Exception{
		Address address = new Address();
		address.setCity("Hyd");
		address.setState("TG");
		address.setCountry("India");
		
		Person person = new Person();
		person.setId(101);
		person.setName("Ravi");
		person.setAge(32);
		person.setPhoneNumber(12345);
		person.setAddress(address);
		
		
		JAXBContext instance = JAXBContext.newInstance(Person.class);
		Marshaller marshaller = instance.createMarshaller();
		System.out.println("Marshalling Started...");
		marshaller.marshal(person, new File("Person.xml"));
		System.out.println("Marshalling Completed...");
		
	}
	

}
