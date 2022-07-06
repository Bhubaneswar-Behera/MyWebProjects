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
//@Data
@Entity
@Table(name = "BANK_ACCOUNTS")
public class Account {
	
	@Column(name = "BRANCH_NAME")
	private String branchName;
	
	@Column(name = "MIN_BAL")
	private Double minBal;
	
	@EmbeddedId
	private AccountPK accPk;

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public Double getMinBal() {
		return minBal;
	}

	public void setMinBal(Double minBal) {
		this.minBal = minBal;
	}

	public AccountPK getAccPk() {
		return accPk;
	}

	public void setAccPk(AccountPK accPk) {
		this.accPk = accPk;
	}

	@Override
	public String toString() {
		return "Account [branchName=" + branchName + ", minBal=" + minBal + ", accPk=" + accPk + "]";
	}
	
	

}
