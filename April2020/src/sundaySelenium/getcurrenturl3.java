package sundaySelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class getcurrenturl3 {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\browser exe\\chromedriver81.exe");
		ChromeDriver driver = new ChromeDriver();
		//webdriver driver = new ChromeDriver();
		
		// get is the method to launch
		driver.get("https://www.facebook.com/");
	
		
		driver.manage().window().maximize();
		
		String currenturl = driver.getCurrentUrl();  //current url
		System.out.println("Current url is -> "+currenturl);
		
		String expectedurl =  "https://www.facebook.com/";  // brd this should
		
		if(currenturl.equals(expectedurl))
		{
			System.out.println("url match and test case pass");
		}
		else
		{
			System.out.println("url does not match , hence test case failed");
		}
		
		
		
	}

}
