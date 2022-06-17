package in.ashokit;

public class DebitCardPayment implements IPayment {
	
	public DebitCardPayment() {
		System.out.println("DebitCardPayment constcuctor called");
	}

	public String pay(double amount) {
		return "Payment successful through DebitCard";
	}

}
