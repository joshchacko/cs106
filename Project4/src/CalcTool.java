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
	 * 
	 */
	public static void main(String[] args) {
	 	// TODO Auto-generated method stub
		
		Scanner filereader = new Scanner (new File("/Users/Josh/Desktop/input.txt"));
		
	while(filereader.hasNext()){ 
		System.out.println(filereader.next());
	}
	
	if(filereader.hasNext("Checking"));
	System.out.println(filereader.nextLine());
	}
	
	
	//double CheckingBalance = 1540;
	//{ CheckingBalance = filereader.nextInt();
}

	//String account=filereader.next();
	//System.out.println(filereader.hasnext());
	
	//filereader.close();
	
	public static double processChecking(String line)   { 
			double amount;
			
		Scanner linereader = new Scanner(line);
		while(linereader.hasNext() && !linereader.hasNextDouble())  {
			amount = linereader.nextDouble();
			if(line.contains("withdrawal"));
				amount *= -1;
		}
			return amount;
	}
		
} 