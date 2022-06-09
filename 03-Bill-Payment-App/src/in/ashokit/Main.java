package in.ashokit;

public class Main {

	public static void main(String[] args) {
		BillCollector billCollector = new BillCollector();
		//Injecting CreditCard object into BillCollector through Setter method (Setter Injection)
		billCollector.setPayment(new CrediCardPayment());
		billCollector.collectPayment(1400);
		
		//Injecting DebitCard object into BillCollector through Constructor (Constructor Injection)
		BillCollector billCollector1 = new BillCollector(new DebitCardPayment());
		billCollector1.collectPayment(1500);
	}

}
