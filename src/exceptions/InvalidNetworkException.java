package exceptions;

public class InvalidNetworkException extends Exception{

	public InvalidNetworkException(String message)
	{
		super(message);
	}
	
	public InvalidNetworkException()
	{
		super("We don't cover that network! We only cover Globe and TM");
	}
}
