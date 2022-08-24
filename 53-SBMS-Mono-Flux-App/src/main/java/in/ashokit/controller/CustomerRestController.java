package in.ashokit.controller;

import java.time.Duration;
import java.util.Date;
import java.util.stream.Stream;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.CustomerEvent;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;

/**
 * 
 * @author Bhubaneswar Behera @date 24-Aug-2022
 *
 */
@RestController
public class CustomerRestController {
	
	@GetMapping(value = "/event" , produces = "application/json")
	public ResponseEntity<Mono<CustomerEvent>> getEvent(){
		CustomerEvent customerEvent = new CustomerEvent("Ashok", new Date());
		
		Mono<CustomerEvent> customerMono = Mono.just(customerEvent);
		return new ResponseEntity<Mono<CustomerEvent>>(customerMono,HttpStatus.OK);
	}
	
	@GetMapping(value = "/events" , produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	public ResponseEntity<Flux<CustomerEvent>> getEvents(){
		//Creating binding object with data
		CustomerEvent customerEvent = new CustomerEvent("Ashok", new Date());
		
		//Creating stream for binding objects
		Stream<CustomerEvent> customerStream = Stream.generate(() -> customerEvent);
		
		
		//Create flux objects using stream
		Flux<CustomerEvent> customerFlux = Flux.fromStream(customerStream);
		
		//Setting response interval
		Flux<Long> intervalFlux = Flux.interval(Duration.ofSeconds(5));
		
		//combine interval flux and customer event flux
		Flux<Tuple2<Long, CustomerEvent>> zip = Flux.zip(intervalFlux, customerFlux);
		
		//Getting Tuple value as T2
		Flux<CustomerEvent> fluxMap = zip.map(Tuple2::getT2);
		
		//sending response
		return new ResponseEntity<>(fluxMap, HttpStatus.OK);
	}

}
