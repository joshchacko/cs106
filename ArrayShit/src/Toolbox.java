import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Toolbox {

	public Enemy[] e;
	
	public void init() {
		int l = 0;
		int j = 0;
		

		Scanner filereader = null;
		try {
			filereader = new Scanner(new File("/Users/Josh/Desktop/locations.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		while(filereader.hasNextLine()) {
			filereader.nextLine();
			l++;
		}
	    filereader.close();

		this.e = new Enemy[l];

		try {
			filereader = new Scanner(new File("/Users/Josh/Desktop/locations.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	    while(filereader.hasNext()){
	    	String Name = filereader.next(); 
	    	String Location = filereader.next(); 
	    	
	        this.e[j]= new Enemy(Name, Location);
	        j++;
	    }
	    filereader.close();
	}
	public int horde(String Location) {
		int t = 0;
		for (int q = 0; q< e.length; q++){
			if (Location.equals(e[q].getLocation())) {
				t++;
			}
		}

		return t;
	}

}

	
