package in.ashokit.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;
import lombok.ToString;

/**
 * 
 * @author Bhubaneswar Behera @date 04-Jul-2022
 *
 */
@Entity
@Table(name = "PRODUCT_MASTER")
@Data
@ToString
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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

}
