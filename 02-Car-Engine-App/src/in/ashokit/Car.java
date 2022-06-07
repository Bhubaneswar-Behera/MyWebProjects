package in.ashokit;

public class Car  {
	
	public void drive() {
		Engine engine = new Engine();
		int status = engine.start();
		
		if(status >= 1) {
			System.out.println("Journey Started");
		} else {
			System.out.println("Engine having some issues ...");
		}
	}
}
