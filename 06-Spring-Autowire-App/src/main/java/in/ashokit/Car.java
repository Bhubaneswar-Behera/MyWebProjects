package in.ashokit;

public class Car {
	private DiselEngine diselEngine;
	
	public Car() {
		System.out.println("Car:0-param Constructor");
	}
	
	public Car(DiselEngine diselEngine) {
		System.out.println("Car:Param Constructor");
		this.diselEngine = diselEngine;
		
	}
	
	public void setDiselEngine(DiselEngine diselEngine) {
		System.out.println("setDiselEngine() method executed");
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
