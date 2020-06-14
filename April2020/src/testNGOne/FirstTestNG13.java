package testNGOne;

import org.testng.annotations.Test;

public class FirstTestNG13 {
	
	@Test(priority=-1)
	public void Aa()
	{
		System.out.println("-5000 to +5000");
	}
	
	@Test(priority=-2)
	public void zb()
	{
		System.out.println("zab");
	}
	
	
	@Test(priority=-3)
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
