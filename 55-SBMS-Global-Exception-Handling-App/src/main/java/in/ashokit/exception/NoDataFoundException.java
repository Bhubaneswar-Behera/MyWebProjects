package in.ashokit.exception;
/**
 * 
 * @author Bhubaneswar Behera @date 26-Aug-2022
 *
 */

public class NoDataFoundException extends RuntimeException{
	
	
	private static final long serialVersionUID = 1L;

	public NoDataFoundException(String message) {
		super(message);
	}

}
