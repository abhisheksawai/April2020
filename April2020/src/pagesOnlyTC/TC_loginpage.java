package pagesOnlyTC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pagesOnly.LoginPage;

public class TC_loginpage {
	
	@Test
	public void verifylogin()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\browser exe\\chromedriver83.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		LoginPage lp = new LoginPage(driver);
		lp.enterusername();
		lp.enterpassword();
		lp.clickonloginbutton();
		lp.verifyloginscuss();		
		
	}

}
