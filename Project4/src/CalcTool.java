import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;

/**
 * @author Josh
 *
 */
public class CalcTool {

	/**
	 * @param args
	 * @param close
	 * @return 
	 * @throws FileNotFoundException
	 * 
	 */
	public static double main(String[] args) {
		// TODO Auto-generated method stub
		double checking = 0.0;
		double savings = 0.0;
		double credit = 0.0;
		double amount = 0.0;
		String trans;
		Scanner filereader = null;
		

		while (filereader.hasNext()) {

			if(trans.contains("2014")){
			filereader.next();
			}
			// Determine account type
			String accountType = filereader.next();
			if (accountType.contains("Credit")) {
				
			}
			// skip word "card"
			// if opening
			if (accountType.contains("Opening")) {
				return amount;
			}
			// skip word "balance"
			// read amount and add to credit balance
				else if (accountType.contains("Deposit")) {
				amount *= +1;
				}
				// else if withdrawal
				// read amount and subtract from credit balance
				else if(accountType.contains("Withdrawal"));{
				amount *= -1;	
				}
				// else if checking
				// if opening
				if(accountType.contains("Checking")){
					
				/*This is confusing!*/
					
					
				// skip word "balance"
				// read amount and add to credit balance
				// else if deposit
				// read amount and add to credit balance
				// else if withdrawal
				// read amount and subtract from credit balance
				// else if savings
				// if opening
				// skip word "balance"
				// read amount and add to credit balance
				// else if deposit
				// read amount and add to credit balance
				// else if withdrawal
	
				while (filereader.hasNext() && !filereader.hasNextDouble()) {
					amount = filereader.nextDouble();
					if (accountType.contains("Withdrawal")) {
						;
						amount *= -1;
						return amount;
					}
					
				}
				// read amount and subtract from credit balance
			}

			if (filereader.hasNext("Checking"))
				;
			System.out.println(filereader.nextLine());

		}

		//double CheckingBalance = 1540;
		{
			//CheckingBalance = filereader.nextInt();

			//String account = filereader.next();
			//System.out.println(filereader.hasNextInt());

			//filereader.close();
		}
	}

	//public static double processChecking(String line) {
		//double amount = 0.0;

		
		//return amount;
		

	

}

