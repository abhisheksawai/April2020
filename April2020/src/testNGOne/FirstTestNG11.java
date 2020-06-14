package testNGOne;

import org.testng.annotations.Test;

public class FirstTestNG11 {
	
	@Test(priority=0)
	public void Aa()
	{
		System.out.println("aa");
	}
	
	@Test
	public void Ab()
	{
		System.out.println("ab");
	}
	
	
	@Test(priority=3)
	public void B()
	{
		System.out.println("b");
	}
	
	@Test(priority=2)
	public void c()
	{
		System.out.println("c");
	}

}
