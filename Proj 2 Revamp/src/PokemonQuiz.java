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
			double GenOne = 0; 
			double GenTwo = 0;
			String ans = null;
			
			System.out.println("Welcome to the pokemon quiz!");
			Scanner keyboard = new Scanner(System.in);
				
			System.out.println("Do you like pokemon?! Yes or No");
				ans = keyboard.nextLine();
				
			
				
				
			    if(ans.equals("Yes")){
			    //temporary
			    	System.out.println("Good job bitchface");
			    	 ans = keyboard.nextLine();
			    } else {
			    	while(!ans.equals("Yes\n")){
						keyboard.next();
						System.out.println("Don't mess around!");
						System.out.print("Smell ya later, gramps!(Please type Yes to continue)")
			    }
				
				
}}}
