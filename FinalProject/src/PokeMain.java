import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class PokeMain {
	
	public static void main(String[] args){
		//lets you put multiple commands in one run
		boolean running = true; 
		Scanner keyboard = null;
		try {
			keyboard = new Scanner(new File(""));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		while(running){
			String command = keyboard.nextLine();
			//method call to PokeInput
			if(command.equals("Stop")){
				break;
			}
		}
	
	}
}
