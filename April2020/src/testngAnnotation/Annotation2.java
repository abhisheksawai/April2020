package testngAnnotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation2 {
	
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("BeforeClass");
	}
	
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("@BeforeMethod");
	}
	
	@Test
	public void one()  //method
	{
		System.out.println("TC-one - Executed");
	}
	
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("@AfterMethod");
	}

	@AfterClass
	public void AfterClass()
	{
		System.out.println("@AfterClass");
	}
	
	
}
