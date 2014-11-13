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
@SuppressWarnings("unused")
public class ThisStuff {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Toolbox t = new Toolbox();
		t.init();
		System.out.println("Here are the number of enemies in Altar Cave." + t.horde("Altar-Cave"));
		
		System.out.println("Here are the number of enemies in the Forst near Castle Sasune." + t.horde("Forest-near-Castle-Sasune"));
		
		System.out.println("Here are the number of enemies in Castle Sasune: West Tower." + t.horde("Castle-Sasune:-West-Tower"));
		
		System.out.println("Here are the number of enemies in the Sealed Cave(Almost at the peak!)." + t.horde("The-Sealed-Cave"));
		
		System.out.println("Here are the number of enemies in Dragon's Peak." + t.horde("Dragon's-Peak"));
		
		System.out.println("Here are the number of enemies in the Forest near Vikings Cove." + t.horde("Forest-near-Vikings'-Cove"));
		
		System.out.println("Here are the number of enemies in Tozus Tunnel." + t.horde("Tozus-Tunnel"));
		
		System.out.println("Here are the number of enemies in Nepto Temple." + t.horde("Nepto-Temple"));
		
		System.out.println("Here are the number of enemies in the Floating Continent - Inner Sea." + t.horde("Inner-sea,-Floating-Continent"));
		
		System.out.println("Here are the number of enemies in the Floating Continent - South Edge." + t.horde("South-Edge-of-Floating-Continent"));
		
		System.out.println("Here are the number of enemies in the Grasslands near Tokkul." + t.horde("Grasslands-near-Tokkul"));
		
		System.out.println("Here are the number of enemies in The Floating Continent - Southwest Corner." + t.horde("Southest-corner-of-Floating-Continent"));
		
		System.out.println("Here are the number of enemies in the Tower of Owen." + t.horde("Tower-of-Owen"));
	}
}
		

