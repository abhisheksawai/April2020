package testNGOne;

import org.testng.annotations.Test;

public class FirstTestNG5 {
	
	@Test(priority=1)
	public void tc_verifylogin()
	{
		System.out.println("tc_verifylogin");
	}
	
	@Test(priority=3)
	public void tc_recharemob()
	{
		System.out.println("tc_recharemob");
	}
	
	@Test(priority=2)
	public void tc_checktitile()
	{
		System.out.println("tc_checktitile");
	}

}
