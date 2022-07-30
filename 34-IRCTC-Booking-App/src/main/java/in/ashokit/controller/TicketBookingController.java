package in.ashokit.controller;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import in.ashokit.binding.Passenger;
import in.ashokit.binding.TicketBokingDetails;

/**
 * 
 * @author Bhubaneswar Behera @date 29-Jul-2022
 *
 */
@RestController
public class TicketBookingController {
	
	@PostMapping(
			value = "/bookTicket" , 
			produces = {"application/json","application/xml"},
			consumes = {"application/json","application/xml"}
			)
	public ResponseEntity<TicketBokingDetails> boookTicket(@RequestBody Passenger passenger){
		System.out.println(passenger);
		
		TicketBokingDetails ticketBokingDetails = new TicketBokingDetails();
		ticketBokingDetails.setTicketPNRNumber(Math.random());
		ticketBokingDetails.setTicketPrice(560.00);
		ticketBokingDetails.setTicketStatus("CONFIRMED");
		
		System.out.println(ticketBokingDetails);
		
		return new ResponseEntity<TicketBokingDetails>(ticketBokingDetails, HttpStatus.OK);
		
	}

}
