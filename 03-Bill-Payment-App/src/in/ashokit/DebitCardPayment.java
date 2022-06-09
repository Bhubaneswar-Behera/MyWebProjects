package in.ashokit;

public class DebitCardPayment implements IPayment {

	@Override
	public String pay(double amount) {
		return "Payment successful through DebitCard";
	}

}
