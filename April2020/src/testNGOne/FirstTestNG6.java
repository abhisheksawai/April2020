package testNGOne;

import org.testng.annotations.Test;

public class FirstTestNG6 {
	
	@Test(priority=1)
	public void A()
	{
		System.out.println("a");
	}
	
	@Test(priority=3)
	public void B()
	{
		System.out.println("b");
	}
	
	@Test(priority=2)
	public void C()
	{
		System.out.println("c");
	}

}
