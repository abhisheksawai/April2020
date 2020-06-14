package conditionsDemo;

public class forloopContinue3 {
	
	public static void main(String[] args) {
		
		//System.out.println("i  k");
		for(int i=0 ; i< 5; i++)  // row
		{
			System.out.println(i);
			if(i==3)
			{
				System.out.println("i is 3");
				continue;  // continue the for loop
			}
		}
		
		
		
		
	}

}