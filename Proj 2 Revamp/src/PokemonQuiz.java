import java.util.*;
import java.util.Scanner;
/**
 * @author Josh
 *
 */
public class PokemonQuiz {
	
	/**
	 * @param args
	 * @param keyboard 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			double pkmnmaster = 0; 
			double loser = 0;
			String ans = null;
			
			System.out.println("Welcome to the pokemon quiz!");
			Scanner keyboard = new Scanner(System.in);
				
			System.out.println("Do you like pokemon?! Yes or No");
				ans = keyboard.nextLine();
				
			do {
				System.out.print("Enter Yes or No: ");
					ans = keyboard.nextLine();
			} while(!keyboard.hasNextDouble()); {
					keyboard.next();
					System.out.println("Don't mess around!");
					System.out.print("Do you like pokemon?! Yes or No");
					System.out.print(ans);
			    if(ans.equals("Yes")){
			    //temporary
			    	System.out.println("Good job bitchface");
			    	 ans = keyboard.nextLine(); 
			    } else {
			    	
							
			    }
				
							
}}}
