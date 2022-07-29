package in.ashokit.binding;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author Bhubaneswar Behera @date 29-Jul-2022
 *
 */
@Data
@XmlRootElement
@NoArgsConstructor
@AllArgsConstructor
public class Passenger {
	private String passengerFirstName;
	private String passengerMiddleName;
	private String passengerLastName;
	private String passengerAge;
	private Integer passengerPhoneNumber;
	private Integer passengerEmailAddress;

}
