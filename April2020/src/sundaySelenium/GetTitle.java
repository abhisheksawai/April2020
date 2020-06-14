package sundaySelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\browser exe\\chromedriver81.exe");
		ChromeDriver driver = new ChromeDriver();
		
		// get is the method to launch
		driver.get("https://www.facebook.com/");
	
		driver.manage().window().maximize();
		
		String gettitle = driver.getTitle();
		System.out.println("Title of webpage is -> "+gettitle);		
		
	}

}
