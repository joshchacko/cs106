import java.util.TreeSet;


public class MySet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> cheese = new TreeSet<String>();
		
		cheese.add("Link");
		cheese.add("Kirby");
		cheese.add("Zelda");
		cheese.add("Mewtwo");
		cheese.add("Mewtwo");
		cheese.add("Solid Snake");
		
		System.out.println("One of these 5 Smash Bro's characters is NOT in the new smash bros.......");
		
		for(String f: cheese){
			System.out.println(f);
		}
		
		
		cheese.remove("Solid Snake");
		System.out.println("\n Heres the real roster!\n");
		java.util.Iterator<String> fromage = cheese.iterator();
		
		System.out.println(fromage.next());
		System.out.println(fromage.next());
		System.out.println(fromage.next());
		System.out.println(fromage.next());
	}

}
