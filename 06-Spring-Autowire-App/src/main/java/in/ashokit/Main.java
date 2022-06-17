package in.ashokit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		//Loading Spring beans xml file
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Beans.xml");
		
		Car car = context.getBean("car", Car.class);
		car.drive();
		
	}

}
