package in.ashokit.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import in.ashokit.binding.PassengerInfo;
import in.ashokit.binding.TicketInfo;

/**
 * 
 * @author Bhubaneswar Behera @date 30-Jul-2022
 *
 */
@RestController
public class TicketRestController {
	
	
	@GetMapping("/ticket/{ticketId}")
	public ResponseEntity<TicketInfo> getTicket(@PathVariable("ticketId") PassengerInfo request){
		System.out.println(request);
		
		//logic to get the ticket data
		
		TicketInfo tikcetInfo  = new TicketInfo();
		tikcetInfo.setTicketId(1234);
		tikcetInfo.setPnrNummber("JLJ6868");
		tikcetInfo.setTicketStatus("CONFIRMED");
		
		return new ResponseEntity<TicketInfo>(tikcetInfo,HttpStatus.OK);
	}
	
	@PostMapping(value = "/ticket",
			produces = {"application/json"},
			consumes =  {"application/json"}
	)
	public ResponseEntity<TicketInfo> boookTicket(@RequestBody PassengerInfo request){
		System.out.println(request);
		
		//logic to book the ticket
		
		TicketInfo tikcetInfo  = new TicketInfo();
		tikcetInfo.setTicketId(1234);
		tikcetInfo.setPnrNummber("JLJ6868");
		tikcetInfo.setTicketStatus("CONFIRMED");
		
		return new ResponseEntity<TicketInfo>(tikcetInfo,HttpStatus.CREATED);
	}
	
	@PutMapping("/ticket")
	public ResponseEntity<String> updateTicket(@RequestBody PassengerInfo request){
		System.out.println(request);
		//logic to update ticket
		return new ResponseEntity<String>("Ticket Updated...", HttpStatus.OK);
		
	}
	
	@DeleteMapping("/ticket/{ticketId}")
	public ResponseEntity<String> deleteTicket(@PathVariable("ticketId") Integer ticketId){
		//logic to update delete the ticket
	
		return new ResponseEntity<String>("Tieckt Deleted...",HttpStatus.OK);
		
	}

}
