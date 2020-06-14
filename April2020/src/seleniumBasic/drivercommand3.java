package seleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class drivercommand3 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\browser exe\\chromedriver81.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.paytm.com/");
		driver.manage().window().maximize();
		
		
		System.out.println(driver.getCurrentUrl());
		
		String expected = "https://paytm.com/welcome";  // url from brd which cross check
		                        //https://paytm.com/electricity-bill-payment
		
		String actual = driver.getCurrentUrl();
		
		if(expected.equals(actual))
		{
			System.out.println("Yes both are same, hence test case pass");
			System.out.println("actual "+actual +"and expected is "+expected );
		}
		else
		{
			System.out.println("both are different, hence test case failed");
			System.out.println("actual "+actual +"and expected is "+expected );
		}
		
		
	
	}
}
