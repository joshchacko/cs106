import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Toolbox {
	
	public static Enemy[] init(){
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
		System.out.println("stuck");
		l++;
	}
   
Enemy[]e = new Enemy [l];
   
    while(filereader.hasNext()){
    	String Name = filereader.next(); 
    	String Location = filereader.next(); 
    	
        Enemy f = new Enemy(Name, Location);
        e[j]= f;
        j++;
    }
    filereader.close();
    return e;
	}
	public static int horde(String Location, Enemy[]e ){
		int i = 0;
		int t = 0;
		for(int q = 0; q< e.length; q++){
			System.out.println("You have no more enemies!")
		}
		if(Location.equals(e[i].getLocation()));
			t++;
	
	}

}

	
