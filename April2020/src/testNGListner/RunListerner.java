package testNGListner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testNGListner.ListenerDemo.class)
public class RunListerner {

	@Test
	public void LauchFb()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\browser exe\\chromedriver83.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.paytm.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("wornf"));
	}
	
	@Test
	public void test2()
	{
		System.out.println("test2");
	}
	
	@Test(enabled=false)
	public void test3()
	{
		System.out.println("test3");
	}
	
	
	@Test
	public void test4()
	{
		System.out.println("test4");
		throw new SkipException("in liisterner we are throwing");
	}
	
}
