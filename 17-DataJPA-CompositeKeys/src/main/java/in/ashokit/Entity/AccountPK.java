package in.ashokit.Entity;

import java.io.Serializable;
import javax.persistence.Embeddable;
import lombok.Data;

/**
 * 
 * @author Bhubaneswar Behera @date 05-Jul-2022
 *
 */
@Data
@Embeddable
public class AccountPK implements Serializable {
	
	private Integer accId;
	private String accType;
	private String holderName;
	
}
