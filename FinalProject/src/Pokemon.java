public class Pokemon {
	private String name;
	private int HP;
	private int attack;
	private int defense;
	private int spatk;
	private int spdef;
	private int speed;
	private int total;
	private String type;

	// Defining all of the possible types
	/**
	 * 
	 * @param type - This is the MOST IMPORTANT PARAMETER. The entire project is sorted by type. 
	 * 				I have an existing bubblesort method for my stat arrays, but that part is incomplete.
	 * 				I plan on working on this project after this semester. 
	 */
	public void setType(String type) {
		String possibleTypes[] = { "Grass", "Electric", "Fire", "Water",
				"Dragon", "Fairy", "Poison", "Dark", "Steel", "Ice", "Flying",
				"Fighting", "Psychic", "Ghost", "Bug", "Rock", "Ground" };
		for (int i = 0; i < possibleTypes.length; i++) {
			if (type.equals(possibleTypes[i])) {
				this.type = possibleTypes[i];
				return;
			}
		}
		// this will keep you from entering an invalid type, and will redirect
		// you to the fairy type.
		type = possibleTypes[5];
	}
	
	public String getName() {
		return name;
	}

	public int getHP() {
		return HP;
	}

	public int getAttack() {
		return attack;
	}

	public int getDefense() {
		return defense;
	}

	public int getSpatk() {
		return spatk;
	}

	public int getSpdef() {
		return spdef;
	}

	public int getSpeed() {
		return speed;
	}

	public int getTotal() {
		return total;
	}

	public String getType() {
		return type;
	}

	/**
	 * 
	 * @param name - the name of the pokemon.
	 * @param HP - the "base value" of the hit points of the pokemon.
	 * @param attack - the "base value" of the attack of the pokemon.
	 * @param defense - the "base value" of the defense of the pokemon.
	 * @param spatk - the "base value" of the special attack of the pokemon.
	 * @param spdef - the "base value" of the special defense of the pokemon.
	 * @param speed - the "base value" of the speed of the pokemon.
	 * @param total - the total "base value" of the pokemon.
	 * @param type
	 */
	public Pokemon(String name, int HP, int attack, int defense, int spatk,
			int spdef, int speed, int total, String type) {
		this.name = name;
		this.HP = HP;
		this.attack = attack;
		this.defense = defense;
		this.spatk = spatk;
		this.spdef = spdef;
		this.speed = speed;
		this.total = total;
		this.type = type;
	}

	public String toString() {
		return " " + this.name + "; "  + this.type + " type";
	}
}
