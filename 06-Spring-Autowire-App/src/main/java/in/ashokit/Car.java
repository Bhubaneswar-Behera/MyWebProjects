package in.ashokit;

public class Car {
	private DiselEngine diselEngine;
	
	public Car() {
		System.out.println("Car:Constructor");
	}
	
	public void setDiselEngine(DiselEngine diselEngine) {
		this.diselEngine = diselEngine;
	}
	
	public void drive() {
		int status = diselEngine.start();
		if(status >= 1) {
			System.out.println("Car started");
		} else {
			System.out.println("Car doesnt start");
		}
		
	}

}
