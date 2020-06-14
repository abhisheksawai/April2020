package testNGPara;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Addition {
	
	@Test
	@Parameters({"no1","no2"})
	public void add(int num1, int num2)  
	{  
	int sum=num1+num2;  
	System.out.println("Sum of two numbers : "+sum);  
	}


}
