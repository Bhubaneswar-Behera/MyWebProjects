package in.ashokit;

public class CreditCardPayment implements IPayment {

	@Override
	public String pay(double amount) {
		return "Payment successful through Creditcard";
	}

}
