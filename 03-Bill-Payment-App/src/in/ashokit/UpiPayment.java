package in.ashokit;

public class UpiPayment implements IPayment {

	@Override
	public String pay(double amount) {
		return "Payment successful through UpiPayment";
	}

}
