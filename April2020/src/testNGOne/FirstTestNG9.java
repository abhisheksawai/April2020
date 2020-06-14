package testNGOne;

import org.testng.annotations.Test;

public class FirstTestNG9 {
	
	@Test
	public void A()
	{
		System.out.println("a");
	}
	
	@Test(priority=1)
	public void B()
	{
		System.out.println("b");
	}
	
	@Test
	public void smallwith123()
	{
		System.out.println("c");
	}

}
