package in.ashokit.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

/**
 * life cycle methods for Spring Bean by using Annotations
 * @author Bhubaneswar Behera @date 27-Jun-2022
 *
 */
@Component
public class Engine {
	public Engine() {
		System.out.println("Engine :: Constructor");
	}
	
	@PostConstruct
	public void init()  {
		System.out.println("start engine...");
	}
	
	@PreDestroy
	public void destroy() throws Exception {
		System.out.println("stop engine...");
	}

}
