package in.ashokit.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * 
 * @author Bhubaneswar Behera @date 27-Aug-2022
 *
 */
@Service
public class WelcomeService {
	
	private String apiUrl = "http://localhost:8080/";
	
	public void invokeWelcomeUsingRestClient() {
		
		
		RestTemplate restTemplate = new RestTemplate();
		
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setBasicAuth("admin","admin@1234");
		
		HttpEntity<String> requestEntity = new HttpEntity<>(httpHeaders);
		
		ResponseEntity<String> responseEntity = restTemplate.exchange(apiUrl, HttpMethod.GET,requestEntity,String.class);
		
		//ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiUrl, String.class);
		
		String responseBody  = responseEntity.getBody();
		
		System.out.println(responseBody);
	}
	
	public void invokeWelcomeUsingWebClient() {
		WebClient webClient = WebClient.create();
		
		String block = webClient.get()
					.uri(apiUrl)
					.headers(headers -> headers.setBasicAuth("admin","admin@1234"))
					.retrieve()
					.bodyToMono(String.class)
					.block();
		
		
		System.out.println(block);
	}
	

	
	

}
