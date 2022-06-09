package in.ashokit;

public class CrediCardPayment implements IPayment {

	@Override
	public String pay(double amount) {
		return "Payment successful through Creditcard";
	}

}
