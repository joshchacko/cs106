
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class PokeMain {
	public static ArrayList<Pokemon> Pkmn = new ArrayList<Pokemon>();
	
	/**
	 * @param running: I created a boolean to determine that while running is true, it will print the original prompt and continue to prompt the user for input. 
	 *
	 */
	public static void main(String[] args){
		boolean running = true; 
		Scanner keyboard = new Scanner(System.in);
		try {
			BigList.statRead();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	print();
		while(running){
			System.out.println("Who would you like to beat? ");
			System.out.println("  ");
			System.out.println("Enter list for a list of trainers I can help you with.");
			String command = keyboard.nextLine();
			PokeInput input = new PokeInput(command);
			if(command.equals("Stop")){
				break;

		}
	
	}
}
	public static void print(){
		for(int i = 0; i < Pkmn.size(); i++){
		
		}
	}
}
	
