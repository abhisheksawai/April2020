package testngAnnotation;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNGDependent2 {
	
	@Test
	public void checklogin()  //method
	{
		System.out.println("TC-one - Executed");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\browser exe\\chromedriver83.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("wornd value")).sendKeys("wrodnf");
		
	}
	
	@Test(dependsOnMethods = {"checklogin","four"})
	public void buymobile()  //method
	{
		System.out.println("TC-two - buymobile Executed");
	}
	
	@Test
	public void three()  //method
	{
		System.out.println("TC-3 - Executed");
		//throw new SkipException("mnot able to login hence will skip this tc");
	}

		@Test
	public void four()  //method
	{
		System.out.println("TC-four- Executed");
		//throw new SkipException("mnot able to login hence will skip this tc");
	}
}
