import java.util.Iterator;
import java.util.LinkedList;


public class LinkedLis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	LinkedList<String> cheese = new LinkedList<String>();
	
	cheese.add("Apple");
	cheese.add("Banana");
	cheese.add("Carrot");
	cheese.add("Durian");
	cheese.add("Grapes");
	System.out.println("Here are a list of all our available fruits!\n");
		for(String f: cheese) {
			
			System.out.println(f);
		
		}
			
		
	cheese.remove("Grapes");
	
	System.out.println("\n Now there are only alphabetical fruits remaining!");
	
	Iterator<String> fromage = cheese.iterator();
	
	System.out.println(fromage.next());
	System.out.println(fromage.next());
	System.out.println(fromage.next());
	System.out.println(fromage.next());
	}

}
