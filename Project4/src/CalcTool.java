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
		int checking = 0;
		int savings = 0;
		int credit = 0;

		Scanner filereader = null;
		try {
			filereader = new Scanner(new File("/Users/Josh/Desktop/input.txt"));
		} catch (FileNotFoundException e) {
			// Nah Nigga
			e.printStackTrace();
		}

		while (filereader.hasNext()) {
			// System.out.println(filereader.next());
			
			//String next = filereader .next();
			//System.out.println(next);
			if (filereader.next().equals("Credit")) {
				System.out.println(filereader.next());
			}
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