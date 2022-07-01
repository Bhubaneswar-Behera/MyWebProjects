package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Player;
import in.ashokit.repository.PlayerRepository;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);
		
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		PlayerRepository playerRepository = context.getBean(PlayerRepository.class);
		
		Player player1 = new Player();
		player1.setPlayeId(101);
		player1.setPlayeName("Dhoni");
		player1.setPlayeAge(42);
		player1.setLocation("Ranchi");
		
		playerRepository.save(player1); // Save method = Update + Insert
		System.out.println("Record Inserted");
		
	}

}
