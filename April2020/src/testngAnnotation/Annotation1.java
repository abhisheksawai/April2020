package testngAnnotation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation1 {
	
	
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("@BeforeMethod");
	}
	
	@Test
	public void one()  //method
	{
		System.out.println("TC-one");
	}
	
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("@AfterMethod");
	}

}
