package loadgenerator;

import exceptions.ExpiredNumberException; 
import exceptions.InvalidNetworkException;
import exceptions.InvalidLoadAmountException;

public class LoadGenerator {
	
	public void generateLoad(String netWork, double simNumber, int amount)
	 throws ExpiredNumberException, InvalidNetworkException, InvalidLoadAmountException
	{
		double expiredNumber = 09151231234d;
		if(amount <= 19)
		{
			throw new InvalidLoadAmountException();
		}
		else if(netWork.equalsIgnoreCase("Smart") ||
				netWork.equalsIgnoreCase("Sun") || 
				netWork.equalsIgnoreCase("Talk and Text") )
		{
			throw new InvalidNetworkException();
		}
		else if(simNumber == expiredNumber)
		{
			throw new ExpiredNumberException();
		}
		else
		{
			System.out.println("Thank you for Reloading, wait for your load.");
		}
		
	}

}
