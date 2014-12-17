
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

	
	//Defining all of the possible types
	/**
	 * @param type1
	 */
	public void setType(String type){
		String possibleTypes[] = {"Grass", "Electric", "Fire", "Water" , "Dragon", "Fairy", "Poison", "Dark", "Steel", "Ice", "Flying" , "Fighting", "Psychic", "Ghost", "Bug", "Rock", "Ground"};                     
				for(int i = 0; i < possibleTypes.length; i++){
					if(type.equals(possibleTypes[i])){
						this.type = possibleTypes[i];
							return;
					}
				}	
						//this will keep you from entering an invalid type, and will redirect you to the fairy type. 
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
	 */
	//public void setType2(String type2){
		//String possibleTypes[] = {"Grass", "Electric", "Fire", "Water" , "Dragon", "Fairy", "Poison", "Dark", "Steel", "Ice", "Flying" , "Fighting", "Psychic", "Ghost", "Bug", "Rock", "Ground"};                     
			//for(int i = 0; i < possibleTypes.length; i++){
				//if(type2.equals(possibleTypes[i])){
					//this.type2 = possibleTypes[i];
						//return;
		
		
					//this will keep you from entering an invalid type, and will redirect you to the steel type.
			 		//type2 = possibleTypes[8];	
					 
	
	
	/*
	 * Constructed name, attack, defense, spatk,spdef,speed, and total parameters.
	 * Will sort them, and then utilize these parameters to create teams. 
	 */
	public Pokemon(String name,int HP, int attack, int defense, int spatk, int spdef, int speed, int total, String type) {
		this.name = name;
		this.HP = HP;
		this.attack = attack;
		this.defense = defense; 
		this.spatk = spatk;
		this.spdef = spdef;
		this.speed = speed; 
	}
	




	
	/**
	 * Using a bubble sort method
	 * This will sort my stat parameters, making it easy to pull a top 6 Stats. 
	 */
	public static void sortByAttack(Pokemon[] pkmns){
		for(int i = 0; i < pkmns.length; i++){
				
			for(int j = 0; j < pkmns.length -1 -i; j++){
					if (pkmns[j].attack < pkmns[j+1].attack){
						swap(pkmns, j, j+1);
					}
			}
			
		}
				
	}
	public static void sortByDefense(Pokemon[] pkmns){
		for(int i = 0; i < pkmns.length; i++){
				
			for(int j = 0; j < pkmns.length -1 -i; j++){
					if (pkmns[j].attack < pkmns[j+1].attack){
						swap(pkmns, j, j+1);
					}
			}
			
		}
				
	}
	public static void sortBySpAtk(Pokemon[] pkmns){
		for(int i = 0; i < pkmns.length; i++){
				
			for(int j = 0; j < pkmns.length -1 -i; j++){
					if (pkmns[j].attack < pkmns[j+1].attack){
						swap(pkmns, j, j+1);
					}
			}
			
		}
				
	}
	public static void sortBySpDef(Pokemon[] pkmns){
		for(int i = 0; i < pkmns.length; i++){
				
			for(int j = 0; j < pkmns.length -1 -i; j++){
					if (pkmns[j].attack < pkmns[j+1].attack){
						swap(pkmns, j, j+1);
					}
			}
			
		}
				
	}
	public static void sortBySpeed(Pokemon[] pkmns){
		for(int i = 0; i < pkmns.length; i++){
				
			for(int j = 0; j < pkmns.length -1 -i; j++){
					if (pkmns[j].attack < pkmns[j+1].attack){
						swap(pkmns, j, j+1);
					}
			}
			
		}
				
	}
	private static void swap(Pokemon[] pkmns, int i, int j){
		
		Pokemon k = pkmns[i];
			pkmns [i] = pkmns[j];
				pkmns [j] = k;
	}
	public String toString(){
		return "" + this.name + " " + this.HP + " " + this.attack + " " + this.defense + " " + this.spatk + " " + this.spdef + " " + this.speed + " " + this.total + " " + this.type;
	}
}
	
