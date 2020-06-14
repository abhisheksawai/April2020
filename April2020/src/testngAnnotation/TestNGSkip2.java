package testngAnnotation;

import org.apache.commons.io.filefilter.FalseFileFilter;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNGSkip2 {
	
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
	
	@Test
	public void three()  //method
	{
		System.out.println("TC-3 - Executed");
		throw new SkipException("mnot able to login hence will skip this tc");
	}
	
}
