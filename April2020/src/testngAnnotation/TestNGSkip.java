package testngAnnotation;

import org.apache.commons.io.filefilter.FalseFileFilter;
import org.testng.annotations.Test;

public class TestNGSkip {
	
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
	
	@Test(enabled=false)
	public void three()  //method
	{
		System.out.println("TC-3 - Executed");
	}
	
}
