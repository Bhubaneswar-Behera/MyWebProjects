package in.ashokit.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * life cycle methods for Spring Bean by implementing interface
 * @author Bhubaneswar Behera @date 27-Jun-2022
 *
 */
@Component
public class Motor implements InitializingBean, DisposableBean{
	public Motor() {
		System.out.println("Motor :: Constructor");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet() method called...");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy() method called...");
		
	}
}
