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
	 * @throws FileNotFoundException
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double checking = 0.0;
		double savings = 0.0;
		double credit = 0.0;

		Scanner filereader = null;
		try {
			filereader = new Scanner(new File("/Users/Josh/Desktop/input.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		while (filereader.hasNext()) {
			
			// Skip date
			filereader.next();

			// Determine account type
			String accountType = filereader.next(); 
			if (accountType.equals("Credit")) {
				
			}
				// skip word "card"
				// if opening
			if (accountType.equals("Opening")){
				
			}
					// skip word "balance"
					// read amount and add to credit balance
				// else if deposit
					// read amount and add to credit balance
				// else if withdrawal
					// read amount and subtract from credit balance
			
			// else if checking
				// if opening
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
					// read amount and subtract from credit balance
		}

		// if(filereader.hasNext("Checking"));
		// System.out.println(filereadver.nextLine());

	}

	// double CheckingBalance = 1540;
	// { CheckingBalance = filereader.nextInt();

	// String account=filereader.next();
	// System.out.println(filereader.hasnext());

	// filereader.close();

	public static double processChecking(String line) {
		double amount;

		Scanner linereader = new Scanner(line);
		while (linereader.hasNext() && !linereader.hasNextDouble()) {
			amount = linereader.nextDouble();
			if (line.contains("Withdrawal"))
				;
			amount *= -1;
		}
		return  amount;
	}

}