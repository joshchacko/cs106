import java.util.ArrayList;
import java.util.Iterator;

//List list = Collections.synchronizedList(new LinkedList(...));
// SortedSet s = Collections.synchronizedSortedSet(new TreeSet(...));
//for (Integer number : arrlist) {
//System.out.println("Number = " + number);
public class TheList {
	public static void main(String[] args){
		
		ArrayList<Integer> cheese = new ArrayList<Integer>();
		
		
		cheese.add(42);
		cheese.add(14);
		cheese.add(7);
		cheese.add(22);
		cheese.add(30);
	
		
		System.out.println("There are " + cheese.size() + " huge blocks of cheese. Each piece of cheese weighs differently:");
		for (Integer wine : cheese) {
			System.out.println("Weight = " + wine + " lbs.");
			
		}
		
		
		cheese.remove(2);
		
		
		
		System.out.println("\nHowever, one block of cheese was NOT huge. We have weeded out the false cheese and now only " + cheese.size() + " remain!" );
		
		Iterator<Integer> fromage = cheese.iterator();
		
		while(fromage.hasNext()){
			System.out.println(fromage.next());
		}
		
		

		
}}
