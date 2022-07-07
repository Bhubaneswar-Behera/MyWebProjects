package in.ashokit.Entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

/**
 * 
 * @author Bhubaneswar Behera @date 05-Jul-2022
 *
 */
@Data
@Entity
@Table(name = "BANK_ACCOUNTS")
public class Account {
	
	@Column(name = "BRANCH_NAME")
	private String branchName;
	
	@Column(name = "MIN_BAL")
	private Double minBal;
	
	@EmbeddedId
	private AccountPK accPk;

}
