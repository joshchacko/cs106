import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class BigList {
	
		
		
		public static void statRead() throws FileNotFoundException{
		Scanner scan = new Scanner(new File("/Users/Josh/Desktop/input.txt"));
		while(scan.hasNextLine()){
			String line = scan.nextLine();
			Scanner keyboard2 = new Scanner(line);
			String name = keyboard2.next();
			int HP = Integer.parseInt(keyboard2.next());
			int attack = Integer.parseInt(keyboard2.next());
			int defense = Integer.parseInt(keyboard2.next());
			int spatk = Integer.parseInt(keyboard2.next());
			int spdef = Integer.parseInt(keyboard2.next());
			int speed = Integer.parseInt(keyboard2.next());
			int total = Integer.parseInt(keyboard2.next());
			String type = keyboard2.next();
			System.out.println(line);
			//Only using 1 type in this example, the input file's nightmare formatting kept me from doing type 2. 
			//This works because we know what order the "words" (read this as variables) are entered in in the text file. If the text file read Type then Name then Attack, we would have to change the order of the above lines.
			Pokemon temp = new Pokemon(name, HP, attack, defense , spatk, spdef, speed, total, type);
			
			PokeMain.Pkmn.add(temp);
		
		}
		
	}
	

}

	
