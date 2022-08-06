package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.client.BookClient;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);
		
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		
		BookClient bookClient = run.getBean(BookClient.class);
		bookClient.invokeBookTicket();
		System.out.println("###############################################");
		bookClient.invokeGetBooks();
		System.out.println("###############################################");
		bookClient.invokeGetBooksInJson();
	}

}
