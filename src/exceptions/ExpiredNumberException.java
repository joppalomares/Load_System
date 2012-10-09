package exceptions;

public class ExpiredNumberException extends Exception{
	
	public ExpiredNumberException(String message)
	{
		super(message);
	}
	
	public ExpiredNumberException()
	{
		super("The number you input is already Expired");
	}

}
//pull request