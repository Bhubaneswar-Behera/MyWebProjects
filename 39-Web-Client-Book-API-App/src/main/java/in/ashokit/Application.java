package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.client.BookClient;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);
		
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		System.out.println("###############################################");
		BookClient bookClient = context.getBean(BookClient.class);
		System.out.println("###############################################");
		bookClient.invokeSaveBooks();
		System.out.println("###############################################");
		bookClient.invokeGetBooks();
		System.out.println("###############################################");
		bookClient.invokeGetBooksAsync();
	}

}
