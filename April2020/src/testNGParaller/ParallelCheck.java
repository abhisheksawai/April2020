package testNGParaller;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelCheck {

	@Test
	public void add()  
	{  
	System.out.println("1 ");  
	}
	
	@Test
	public void sub()  
	{  
	System.out.println("2 ");  
	}
	
	@Test
	public void mul()  
	{  
	System.out.println("3 ");  
	}
}
