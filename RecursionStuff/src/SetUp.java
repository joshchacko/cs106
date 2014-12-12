
public class SetUp {
	public static void main(String[] args){
		
		countUp(10);
		
		
		}
	


	//public static int countUp(int max){
		//System.out.print(max);
		
		//if(max > 1)
			//return max + countUp(max -1);
		
	
		//return 1;
	//}
	
	public static void countUp(int z){
		if(z > 1){
			countUp(z-1);
		}
		System.out.println(z);
	}
}

