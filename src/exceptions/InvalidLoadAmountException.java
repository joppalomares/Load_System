package exceptions;

public class InvalidLoadAmountException extends Exception {
	
	public InvalidLoadAmountException(String message)
	{
		super(message);
	}
	
	public InvalidLoadAmountException()
	{
		super("We only accept 20pesos and above");
	}
	

}
