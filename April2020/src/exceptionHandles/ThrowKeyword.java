package exceptionHandles;

public class ThrowKeyword {
	
	public static void check(int Marks)
	{
		if(Marks < 40)
		{
			throw new ArithmeticException("you are fail");
			
			//	System.out.println("here..");
		}
		else
		{
			System.out.println("you are pass");
		}
		
	}
	
	public static void main(String[] args) {
		
		//ThrowKeyword tk = new ThrowKeyword();
		//tk.va
		
		check(35);
		System.out.println("after calling check method");
		
	}

}
