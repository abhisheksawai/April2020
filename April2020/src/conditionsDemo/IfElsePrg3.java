package conditionsDemo;

public class IfElsePrg3 {

	public static void main(String[] args) {
		
		int no1=10;
		int no2=20;
		
				
		if(no1 > no2 )  // condition false and hence went to else block
		{
			System.out.println("no1 is greater than no2");
		}
		else if(no1 > 5)
		{
			System.out.println("no1 is  greater than 5");
		}
		else
		{
			System.out.println("some code");
		}
		
		System.out.println("remaining code");
		
		
	}
	
}
