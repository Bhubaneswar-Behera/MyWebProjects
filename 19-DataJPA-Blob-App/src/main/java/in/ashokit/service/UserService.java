package in.ashokit.service;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.User;
import in.ashokit.repository.UserRepository;

/**
 * 
 * @author Bhubaneswar Behera @date 06-Jul-2022
 *
 */
@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	public void saveUser()  throws Exception{
		String imagePath = "D:\\MyWebProjects\\19-DataJPA-Blob-App\\src\\main\\resources\\Docker.jpg";
		
		
		long fileSize = Files.size(Paths.get(imagePath));
		byte[] byteArray = new byte[(int)fileSize];
		
		FileInputStream fileInputStream = new FileInputStream(new File(imagePath));
		fileInputStream.read(byteArray);
		fileInputStream.close();
		
		User user = new User();
		user.setUserName("Suresh");
		user.setUserEmail("suresh@gmail.com");
		user.setUserImage(byteArray);
		
		userRepository.save(user);
	}
}
