package webElementCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebEleCommands5 {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\browser exe\\chromedriver83.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement username =driver.findElement(By.xpath("//input[@id='email']"));
		
		boolean usernamecheck;
		usernamecheck = username.isEnabled();
		System.out.println("usernamecheck  isEnabled or not->>  "+usernamecheck);
		
		if(usernamecheck)
		{
			username.sendKeys("karthik");
		}
		
		//driver.findElement(By.xpath("//input[@id='u_0_7']")).click();
		driver.findElement(By.xpath("//label[@for='u_0_7']")).click();
		
	}

}
