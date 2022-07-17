package in.ashokit.binding;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

/**
 * 
 * @author Bhubaneswar Behera @date 17-Jul-2022
 *
 */
@Data
public class User {
	
	@NotEmpty(message="User name is required")
	@Size(min = 3,max = 8 , message = "User name should be {min} to {max} characters")
	private String userName;
	
	@NotEmpty(message="Password is required")
	private String password;
	
	@NotEmpty(message="Email is required")
	@Email(message="Enter valid email id")
	private String email;
	
	@NotEmpty(message="Phone number is required")
	@Size(min = 10 , message = "Phone numer should have atleast 10 digits")
	private String phoneNumber;
	
	@NotNull(message="Age is required")
	@Min(value = 21, message="Age should be minimum 21 years")
	@Max(value = 60, message="Age should be maximum 60 years")
	private Integer age;
	
}
