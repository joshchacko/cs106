import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author Josh
 *
 */
public class PokeInput {
	String commandlist;

	/**
	 * 
	 * @param commandlist - Created an accepted list of commands. Is break - proof.
	 * 						Instead of locking the commands to certain phrases, I made keywords. 
	 * 						Please read my e-mail in regards to the only error my program has.
	 * 
	 */
	public PokeInput(String commandlist) {
		ArrayList<Pokemon> boomerang = new ArrayList<Pokemon>();
		String[] goodInput = { "List", "Brock", "Misty", "Surge", "Erica",
				"Sabrina", "Koga", "Blaine", "Giovanni", "Blue", "Red" };
		Scanner scan = new Scanner(commandlist);
		String answers = null;
		commandFix: while (scan.hasNext()) {
			answers = scan.next();

			for (int i = 0; i < goodInput.length; i++) {
				if (answers.equals(goodInput[i])) {
					break commandFix;
				}

			}
		}
		System.out.println(answers);
		if (answers == null) {
			answers = "Billybob";
		}
		if (answers.equals("list")) {
			System.out.println("I want to beat Brock");
			System.out.println("I want to beat Misty");
			System.out.println("I want to beat Lt. Surge");
			System.out.println("I want to beat Erica");
			System.out.println("I want to beat Sabrina");
			System.out.println("I want to beat Koga");
			System.out.println("I want to beat Blaine");
		}

		else if (answers.equalsIgnoreCase("Brock")) {
			boomerang = Brock();
			System.out.println("Go team!" + boomerang);
		} else if (answers.equalsIgnoreCase("Misty")) {

			boomerang = Misty();
			System.out.println("Go team!" + boomerang);
		} else if (answers.equalsIgnoreCase("Surge")) {

			boomerang = Surge();
			System.out.println("Go team!" + boomerang);
		} else if (answers.equalsIgnoreCase("Erica")) {

			boomerang = Erica();
			System.out.println("Go team!" + boomerang);
		} else if (answers.equalsIgnoreCase("Sabrina")) {

			boomerang = Sabrina();
			System.out.println("Go team!" + boomerang);
		} else if (answers.equalsIgnoreCase("Koga")) {

			boomerang = Koga();
			System.out.println("Go team!" + boomerang);
		} else if (answers.equalsIgnoreCase("Blaine")) {

			boomerang = Blaine();
			System.out.println("Go team!" + boomerang);
		} else if (answers.equalsIgnoreCase("Giovanni")) {

			boomerang = Giovanni();
			System.out.println("Go team!" + boomerang);
		} else {
			System.out.println("NO HELP FOR YOU!");
			System.out.println(" ");
		}
		scan.close();
	}

	/**
	 * 
	 * @return: this sorts the pokemon through multiple arrays(A<B<C) the first
	 *          small array(B) sorts through a type based criteria from A the
	 *          second array(C) pulls six randomly generated pokemon The next
	 *          several methods are all the same lines of code. I will not put
	 *          explanations in those.
	 *
	 */
	public static ArrayList<Pokemon> Brock() {
		ArrayList<Pokemon> roster = new ArrayList<Pokemon>();
		ArrayList<Pokemon> pokedex = new ArrayList<Pokemon>();
		for (int i = 0; i < PokeMain.Pkmn.size(); i++) {
			if (PokeMain.Pkmn.get(i).getType().equals("Grass")
					|| PokeMain.Pkmn.get(i).getType().equals("Water")
					|| PokeMain.Pkmn.get(i).getType().equals("Fighting")) {
				pokedex.add(PokeMain.Pkmn.get(i));
			}
		}
		Random rand = new Random();
		System.out.println("Pokedex size " + pokedex.size());
		for (int i = 0; i < 6; i++) {
			roster.add(pokedex.get(rand.nextInt(pokedex.size())));
		}
		return roster;
	}

	/**
	 * 
	 * @return
	 */
	public static ArrayList<Pokemon> Misty() {
		ArrayList<Pokemon> roster = new ArrayList<Pokemon>();
		ArrayList<Pokemon> pokedex = new ArrayList<Pokemon>();
		for (int i = 0; i < PokeMain.Pkmn.size(); i++) {
			if (PokeMain.Pkmn.get(i).getType().equals("Grass")
					|| PokeMain.Pkmn.get(i).getType().equals("Electric")
					|| PokeMain.Pkmn.get(i).getType().equals("Normal")) {
				pokedex.add(PokeMain.Pkmn.get(i));
			}
		}
		Random rand = new Random();
		for (int j = 0; j < 6; j++) {
			roster.add(pokedex.get(rand.nextInt(pokedex.size())));
		}
		return roster;
	}

	/**
	 * 
	 * @return
	 */
	public static ArrayList<Pokemon> Surge() {
		ArrayList<Pokemon> roster = new ArrayList<Pokemon>();
		ArrayList<Pokemon> pokedex = new ArrayList<Pokemon>();
		for (int i = 0; i < PokeMain.Pkmn.size(); i++) {
			if (PokeMain.Pkmn.get(i).getType().equals("Ground")
					|| PokeMain.Pkmn.get(i).getType().equals("Rock")
					|| PokeMain.Pkmn.get(i).getType().equals("Grass")) {
				pokedex.add(PokeMain.Pkmn.get(i));
			}
		}
		Random rand = new Random();
		for (int i = 0; i < 6; i++) {
			roster.add(pokedex.get(rand.nextInt(pokedex.size())));
		}
		return roster;
	}

	/**
	 * 
	 * @return
	 */
	public static ArrayList<Pokemon> Erica() {
		// Make second array list
		ArrayList<Pokemon> roster = new ArrayList<Pokemon>();
		ArrayList<Pokemon> pokedex = new ArrayList<Pokemon>();
		for (int i = 0; i < PokeMain.Pkmn.size(); i++) {
			if (PokeMain.Pkmn.get(i).getType().equals("Fire")
					|| PokeMain.Pkmn.get(i).getType().equals("Ice")
					|| PokeMain.Pkmn.get(i).getType().equals("Flying")
					|| PokeMain.Pkmn.get(i).getType().equals("Normal")) {
				pokedex.add(PokeMain.Pkmn.get(i));
			}
		}
		Random rand = new Random();
		for (int i = 0; i < 6; i++) {
			roster.add(pokedex.get(rand.nextInt(pokedex.size())));
		}
		return roster;
	}

	/**
	 * 
	 * @return
	 */
	public static ArrayList<Pokemon> Sabrina() {
		// Make second array list
		ArrayList<Pokemon> roster = new ArrayList<Pokemon>();
		ArrayList<Pokemon> pokedex = new ArrayList<Pokemon>();
		for (int i = 0; i < PokeMain.Pkmn.size(); i++) {
			if (PokeMain.Pkmn.get(i).getType().equals("Normal")
					|| PokeMain.Pkmn.get(i).getType().equals("Bug")
					|| PokeMain.Pkmn.get(i).getType().equals("Blue")) {
				pokedex.add(PokeMain.Pkmn.get(i));
			}
		}
		Random rand = new Random();
		for (int i = 0; i < 6; i++) {
			roster.add(pokedex.get(rand.nextInt(pokedex.size())));
		}
		return roster;
	}

	/**
	 * 
	 * @return
	 */
	public static ArrayList<Pokemon> Koga() {
		ArrayList<Pokemon> roster = new ArrayList<Pokemon>();
		ArrayList<Pokemon> pokedex = new ArrayList<Pokemon>();
		for (int i = 0; i < PokeMain.Pkmn.size(); i++) {
			if (PokeMain.Pkmn.get(i).getType().equals("Red")
					|| PokeMain.Pkmn.get(i).getType().equals("Ground")
					|| PokeMain.Pkmn.get(i).getType().equals("Psychic")) {
				pokedex.add(PokeMain.Pkmn.get(i));
			}
		}
		Random rand = new Random();
		for (int i = 0; i < 6; i++) {
			roster.add(pokedex.get(rand.nextInt(pokedex.size())));
		}
		return roster;
	}
	/**
	 * 
	 * @return
	 */
	public static ArrayList<Pokemon> Blaine() {
		ArrayList<Pokemon> roster = new ArrayList<Pokemon>();
		ArrayList<Pokemon> pokedex = new ArrayList<Pokemon>();
		for (int i = 0; i < PokeMain.Pkmn.size(); i++) {
			if (PokeMain.Pkmn.get(i).getType().equals("Rock")
					|| PokeMain.Pkmn.get(i).getType().equals("Water")
					|| PokeMain.Pkmn.get(i).getType().equals("Normal")) {
				pokedex.add(PokeMain.Pkmn.get(i));
			}
		}
		Random rand = new Random();
		for (int i = 0; i < 6; i++) {
			roster.add(pokedex.get(rand.nextInt(pokedex.size())));
		}
		return roster;
	}

	/**
	 * 
	 * @return
	 */
	public static ArrayList<Pokemon> Giovanni() {
		ArrayList<Pokemon> roster = new ArrayList<Pokemon>();
		ArrayList<Pokemon> pokedex = new ArrayList<Pokemon>();
		for (int i = 0; i < PokeMain.Pkmn.size(); i++) {
			if (PokeMain.Pkmn.get(i).getType().equals("Grass")
					|| PokeMain.Pkmn.get(i).getType().equals("Water")
					|| PokeMain.Pkmn.get(i).getType().equals("Fighting")
					|| PokeMain.Pkmn.get(i).getType().equals("Red")) {
				pokedex.add(PokeMain.Pkmn.get(i));
			}
		}
		Random rand = new Random();
		for (int i = 0; i < 6; i++) {
			roster.add(pokedex.get(rand.nextInt(pokedex.size())));
		}
		return roster;
	}
}
