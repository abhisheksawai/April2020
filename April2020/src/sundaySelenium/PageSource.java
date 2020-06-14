package sundaySelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class PageSource {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\browser exe\\chromedriver81.exe");
		ChromeDriver driver = new ChromeDriver();
		
		// get is the method to launch
		driver.get("https://www.paytm.com/");
	
		driver.manage().window().maximize();
		
		String pagesource = driver.getPageSource();
		//System.out.println(pagesource);
		
		String expectedword = "Mobile Recharge or Bill Payment";
		
		System.out.println(pagesource.contains(expectedword));
		
		
		
	}

}
