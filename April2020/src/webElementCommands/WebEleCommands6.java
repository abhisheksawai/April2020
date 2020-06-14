package webElementCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebEleCommands6 {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\browser exe\\chromedriver83.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//input[@id='u_0_7']")).click();
		WebElement genderMale = driver.findElement(By.xpath("//input[@id='u_0_7']"));
		genderMale.click();
		
		boolean isSelectgenderMale;
		isSelectgenderMale = genderMale.isSelected();	
		System.out.println("isSelectgenderMale value is -->> "+isSelectgenderMale);
		
		
		WebElement genderFemale = driver.findElement(By.xpath("//input[@id='u_0_6']"));
		boolean isSelectgenderFeMale;
		isSelectgenderFeMale = genderFemale.isSelected();	
		System.out.println("isSelectgenderFeMale value is -->> "+isSelectgenderFeMale);
		
	}

}
