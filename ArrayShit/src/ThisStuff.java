import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Josh
 *
 */
public class ThisStuff {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner filereader = null;
		try {
			filereader = new Scanner(new File("/Users/Josh/Desktop/97MFTCL.dat"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		while (filereader.hasNext()) {
			
		}
	}

}