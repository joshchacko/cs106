
import java.util.LinkedList;
import java.util.Queue;



public class TheList {
	public static void main(String[] args){
		
		Queue<String> myQueue = new LinkedList<String>();
		
		
	
		myQueue.add("Brie");
		myQueue.add("Larks");
		myQueue.add("Cherry");
		myQueue.add("Gouda");
		myQueue.add("Sackies");
		
		
		while(myQueue.size() < 0){
			System.out.println(myQueue.remove());
			System.out.println("Chicken Cider");
		}
	
		
}}
