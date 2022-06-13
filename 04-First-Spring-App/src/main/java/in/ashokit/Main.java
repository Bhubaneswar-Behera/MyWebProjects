package in.ashokit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws Exception {
		//Loading Spring beans xml file
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Beans.xml");
		
		
		//Getting the BillCollector
		BillCollector billCollector = context.getBean("billCollector", BillCollector.class);
		billCollector.collectPayment(1500.00);
	}

}
