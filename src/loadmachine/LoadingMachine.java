package loadmachine;

import loadgenerator.LoadGenerator; 

import exceptions.InvalidLoadAmountException;
import exceptions.InvalidNetworkException;
import exceptions.ExpiredNumberException;

import java.util.Scanner;

public class LoadingMachine {

	public static void main(String[] args) {
		try 
		{
			Scanner scanner = new Scanner(System.in);
			
			
			
			System.out.println("Please insert network: ");
			String network = scanner.nextLine();
			
			System.out.println("Please insert amount: ");
			int amountLoad = scanner.nextInt();
			
			System.out.println("Please insert number: ");
			double simCardNumber = scanner.nextDouble();
			
			LoadGenerator lg = new LoadGenerator();
			lg.generateLoad(network, simCardNumber, amountLoad);
			
		}
		catch(ExpiredNumberException ene){
			System.err.println(ene.getMessage());
		}
		catch(InvalidNetworkException inwe){
			System.err.println(inwe.getMessage());
		}
		catch(InvalidLoadAmountException ilae){
			System.err.println(ilae.getMessage());
		}
		catch(Exception exc)
		{
			System.err.println("You input a worng data");
		}
			
		

	}

}
