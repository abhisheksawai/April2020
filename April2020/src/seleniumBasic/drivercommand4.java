package seleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class drivercommand4 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\browser exe\\chromedriver81.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.paytm.com/");
		driver.manage().window().maximize();
		
		//System.out.println(driver.getPageSource());
		
		String pagesource = driver.getPageSource();
		
		//if(pagesource.lik)
		
		if(pagesource.contains("Mobile Recharge or Bill Payment"))
		{
			System.out.println("Yes given string is present");
		}
		else
		{
			System.out.println("Yes given string is NOT present");
		}
		
	}
}
