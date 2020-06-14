package conditionsDemo;

public class IfElsePrg2 {

	public static void main(String[] args) {
		
		int no1=10;
		int no2=20;
		
		if(no1 < no2 ) // condition true
		{
			System.out.println("no1 is less than no2");
		}
		
		if(no1 > no2 )  // condition false and hence went to else block
		{
			System.out.println("no1 is greater than no2");
		}
		else
		{
			System.out.println("no1 is not greater than no2");
		}
		
		System.out.println("remaining code");
		
		
	}
	
}
