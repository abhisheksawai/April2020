package testngAnnotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation5 {
	
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("BeforeSuite");
	}
	
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("BeforeTest");
	}
	
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
	
	@Test
	public void two()  //method
	{
		System.out.println("TC-two - Executed");
	}
	
	@Test
	public void three()  //method
	{
		System.out.println("TC-three - Executed");
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
	
	@AfterTest
	public void AfterTest()
	{
		System.out.println("AfterTest");
	}

	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("@AfterSuite");
	}
}
