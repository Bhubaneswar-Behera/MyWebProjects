package in.ashokit.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

/**
 * 
 * @author Bhubaneswar Behera @date 04-Jul-2022
 *
 */
@Entity
@Table(name = "PRODUCT_MASTER")
public class Product {
	
	@Id
	@GeneratedValue
	@Column(name = "PRODCUT_ID")
	private int pid;
	
	@Column(name = "PRODCUT_NAME")
	private String pname;
	
	@Column(name = "PRODCUT_PRICE")
	private double price;
	
	@CreationTimestamp
	@Column(name = "CREATED_DATE", updatable = false)
	private LocalDateTime createdDate;
	
	@UpdateTimestamp
	@Column(name = "UPDATED_DATE" ,  insertable = false)
	private LocalDateTime updatedDate;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", createdDate=" + createdDate
				+ ", updatedDate=" + updatedDate + "]";
	}
	
	

}
