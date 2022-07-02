package in.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author Bhubaneswar Behera @date 02-Jul-2022
 *
 */
@Entity
@Table(name = "USER_MASTER")
@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class User {
	
	@Id
	@Column(name = "USER_ID")
	private Integer userId;
	
	@Column(name = "USER_NAME")
	private String userName;
	
	@Column(name = "USER_GENDER")
	private String gender;
	
	@Column(name = "USER_AGE")
	private Integer age;
	
	@Column(name = "USER_COUNTRY")
	private String country;
	public User () {
		
	}
	
	public User(int userId, String userName, String gender, int age, String country) {
		this.userId = userId;
		this.userName = userName;
		this.gender = gender;
		this.age = age;
		this.country = country;
	}
	

}
