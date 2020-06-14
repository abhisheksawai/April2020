package sundaySelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser3 {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\browser exe\\chromedriver81.exe");
		ChromeDriver driver = new ChromeDriver();
		//webdriver driver = new ChromeDriver();
		
		// get is the method to launch
		//driver.get("https://www.facebook.com/");
	
		driver.navigate().to("https://paytm.com/");
		driver.manage().window().maximize();
		
		
		driver.navigate().back();
		
		Thread.sleep(3000);  // wait for 3 seconds
		
		driver.navigate().forward();
		
		
		
		//close the browser
		//driver.close();
		System.out.println("driver closed browser successfully");
		
	}

}
