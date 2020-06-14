package exceptionHandles;

import java.io.File;
import java.io.FileInputStream;

public class tryBlockTry {
	
	public static void main(String[] args) {
		
		int num1=100;
		int num2=0;
		int div;
		
	try {
				try {
						div=num1/num2;  //arithemtic run time , uncheck
						System.out.println("division is "+div);
				}
				catch(Exception e)
				{
					System.out.println("anushree doubt");
				}
		}
		catch(ArithmeticException ae) 	{
		System.out.println(ae);	
	}
	
	
	
		finally
		{
			System.out.println("it is going to run for sure");
		}
	
		System.out.println("baki ka coding here");
		//1000 lineof code here
	
	
	}

}
