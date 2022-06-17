package in.ashokit;

public class CreditCardPayment implements IPayment {
	
	public CreditCardPayment() {
		System.out.println("CreditCard constructor called");
	}

	public String pay(double amount) {
		return "Payment successful through Creditcard";
	}

}
