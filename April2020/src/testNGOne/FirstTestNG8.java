package testNGOne;

import org.testng.annotations.Test;

public class FirstTestNG8 {
	
	@Test(priority=1)
	public void A()
	{
		System.out.println("a");
	}
	
	@Test
	public void B()
	{
		System.out.println("b");
	}
	
	@Test
	public void C()
	{
		System.out.println("c");
	}

}
