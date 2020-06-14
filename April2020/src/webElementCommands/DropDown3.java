package webElementCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown3 {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\browser exe\\chromedriver83.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement dd_month = driver.findElement(By.xpath("//select[@id='month']"));
		Select selectday = new Select(dd_month);
						//equal to 
	//	Select selectday1 = new Select(driver.findElement(By.xpath("//select[@id='day']")));
		
		//selectday.selectByIndex(0);  // index start from 0
		//selectday.selectByVisibleText("8");
		selectday.selectByValue("4");
	
		//month.getFirstSelectedOption().getText()
	}

}
