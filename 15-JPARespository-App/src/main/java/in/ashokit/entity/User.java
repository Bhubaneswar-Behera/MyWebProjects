package in.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * 
 * @author Bhubaneswar Behera @date 03-Jul-2022
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
	
	
	
	public Integer getUserId() {
		return userId;
	}



	public void setUserId(Integer userId) {
		this.userId = userId;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public Integer getAge() {
		return age;
	}



	public void setAge(Integer age) {
		this.age = age;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public User(int userId, String userName, String gender, int age, String country) {
		this.userId = userId;
		this.userName = userName;
		this.gender = gender;
		this.age = age;
		this.country = country;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", gender=" + gender + ", age=" + age
				+ ", country=" + country + "]";
	}

}
