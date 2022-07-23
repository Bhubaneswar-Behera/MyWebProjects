package in.ashokit.converters;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import in.ashokit.bindings.Person;

/**
 * Unmarshalling --> XML to Java Object
 * 
 * @author Bhubaneswar Behera @date 22-Jul-2022
 *
 */

public class ConvertXmlToJava {
	
	public static void main(String[] args) throws Exception {
		File xmlFile = new File("Person.xml");
		
		JAXBContext context = JAXBContext.newInstance(Person.class);
		
		Unmarshaller unmarshaller = context.createUnmarshaller();
		System.out.println("Unmarshalling Started...");
		Object object = unmarshaller.unmarshal(xmlFile);
		Person person = (Person)object;
		System.out.println(person);
		System.out.println("Unmarshalling Completed...");
		
		
	}

}
