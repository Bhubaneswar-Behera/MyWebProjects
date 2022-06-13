package in.ashokit;

import java.lang.reflect.Field;



public class Main {

	public static void main(String[] args) throws Exception {
		//Setter Injection Starts###################################
		BillCollector billCollector = new BillCollector();
		//Injecting CreditCard object into BillCollector through Setter method (Setter Injection)
		billCollector.setPayment(new CreditCardPayment());
		billCollector.collectPayment(1400.00);
		//Setter Injection End###################################
		
		//Constructor Injection Starts###################################
		//Injecting DebitCard object into BillCollector through Constructor (Constructor Injection)
		BillCollector billCollector1 = new BillCollector(new DebitCardPayment());
		billCollector1.collectPayment(1500.00);
		//Constructor Injection Ends###################################
		
		
		//Field Injection Starts###################################
		Class<?> cls = Class.forName("in.ashokit.BillCollector");
		
		Field field = cls.getDeclaredField("payment");
		field.setAccessible(true);
		
		Object object = cls.newInstance();
		field.set(object, new UpiPayment());
		
		BillCollector billCollector3 = (BillCollector)object;
		billCollector3.collectPayment(2000.00);
		//Field Injection Ends###################################
		
	}

}
