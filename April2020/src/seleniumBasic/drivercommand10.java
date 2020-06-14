package seleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class drivercommand10 {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\browser exe\\chromedriver81.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.paytm.com/");
		//driver.manage().window().maximize();

		driver.navigate().to("https://www.paytm.com/");
		System.out.println("Yes launched browser");
		
		driver.navigate().refresh();
		System.out.println("refersh done");
		
	}
}
