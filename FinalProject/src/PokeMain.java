
import java.util.Scanner;
public class PokeMain {
	
	/*
	 * This will keep the program running, and propmt the user to input to the next line
	 * "stop" will prompt a break, which will force terminate the program.S
	 */
	public static void main(String[] args){
		//lets you put multiple commands in one run
		boolean running = true; 
		Scanner keyboard = new Scanner(System.in);
		
		while(running){
			System.out.println("What is your move?");
			String command = keyboard.nextLine();
			PokeInput input = new PokeInput(command);
			if(command.equals("Stop")){
				break;

		}
	
	}
}
}
	
