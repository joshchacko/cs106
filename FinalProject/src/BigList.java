import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class BigList {
	
		ArrayList Pkmn = new ArrayList();
		Scanner keyboard = new Scanner(new File("/Users/Josh/Desktop/input.txt"));
		while(keyboard.hasNext()){
			String line = keyboard.next();
			Scanner keyboard2 = new Scanner(line);
			String name = keyboard2.next();
			int attack = Integer.parseInt(keyboard2.next());
			int defense = Integer.parseInt(keyboard2.next());
			int spAtk = Integer.parseInt(keyboard2.next());
			int spDef = Integer.parseInt(keyboard2.next());
			int speed = Integer.parseInt(keyboard2.next());
			int total = Integer.parseInt(keyboard2.next());
			String type1 = keyboard2.next();
			//Only using 1 type in this example, the input file's nightmare formatting kept me from doing type 2. 
			//This works because we know what order the "words" (read this as variables) are entered in in the text file. If the text file read Type then Name then Attack, we would have to change the order of the above lines.
			Pokemon temp = new Pokemon(name, attack, defense , spAtk, spDef, speed,total, type1);
			
			Pkmn.add(temp);
		
		}
	
	}


}}

	
}