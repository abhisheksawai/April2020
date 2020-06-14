package testngAnnotation;

import org.testng.annotations.Test;

public class TestNGReport {
	
	@Test
	public void one()  //method
	{
		System.out.println("TC-one - Executed");
	}
	
	@Test
	public void two()  //method
	{
		System.out.println("TC-two - Executed");
	}
	
}
