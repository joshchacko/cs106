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
	 * @return 
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
		
		while (!ans.equalsIgnoreCase("Yes") && !ans.equalsIgnoreCase("No"))
		{
			while(ans.equals("No")){
				System.out.println("Boo! No Quiz for you(Restart the program to retake the quiz)");
			}
		}
		System.out.println("Lets go! Now the real quiz begins.");  
			ans = keyboard.nextLine();
			
		System.out.println("Is the original name of pokemon pocket monsters?");
		ans = keyboard.nextLine();
			if(ans.equals("Yes")){
				pkmnmaster ++;
				
			} else {
				loser ++;
			}
		System.out.println("Is Gary Oak Proffessor Birch's grandson?");
			ans = keyboard.nextLine();
		if(ans.equals("No")){
			pkmnmaster ++;
			
		} else {
			loser ++;
		}
		System.out.println("Final Question! Do you truly want to be a pokemon master?");
			ans = keyboard.nextLine();
			if(ans.equals("No")){
				pkmnmaster ++;
				
			} else {
				loser ++;
			}
		
		keyboard.close();	
		

        System.out.println("Results are in!");
		
		if(pkmnmaster > loser){
			System.out.println("You are a Pokemon Master!");
		} else { 
			System.out.println("Loooooser! Smell ya later, gramps.");
		}
	}
		
		
}
