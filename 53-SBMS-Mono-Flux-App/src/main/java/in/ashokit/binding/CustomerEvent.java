package in.ashokit.binding;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author Bhubaneswar Behera @date 24-Aug-2022
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerEvent {

		private String name;
		private Date createdDate;
}
