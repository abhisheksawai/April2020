package testngAnnotation;


import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNGDependent {
	
	@Test
	public void login()  //method
	{
		System.out.println("TC-one - Executed");
	}
	
	@Test(dependsOnMethods = "login")
	public void buymobile()  //method
	{
		System.out.println("TC-two - Executed");
	}
	
	@Test
	public void three()  //method
	{
		System.out.println("TC-3 - Executed");
		//throw new SkipException("mnot able to login hence will skip this tc");
	}
	
}
