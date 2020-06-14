package testNGOne;

import org.testng.annotations.Test;

public class FirstTestNG12 {
	
	@Test
	public void Aa()
	{
		System.out.println("aa");
	}
	
	@Test(priority=0)
	public void zb()
	{
		System.out.println("zab");
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
