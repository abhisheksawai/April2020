package conditionsDemo;

public class forloopContinue {
	
	public static void main(String[] args) {
		
		System.out.println("i  k");
		for(int i=0 ; i< 3; i++)  // row
		{
			for(int k=0 ; k< 10; k++) // col
			{
				if(k==2)
				{
					System.out.println("we are good and we can stop our for loop exe");
					continue;
				}
				
					
				System.out.println(i +" " +k);
			}
		}
		
		
		
		
	}

}
