package in.ashokit;

public class UpiPayment implements IPayment {
	
	public UpiPayment () {
		System.out.println("UpiPayment constructor called");
	}

	public String pay(double amount) {
		return "Payment successful through UpiPayment";
	}

}
