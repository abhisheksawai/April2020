package seleniumBasic;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandle1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\browser exe\\chromedriver83.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/selenium-webdriver/handling-multiple-browsers-in-selenium-webdriver/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@title='Switch Window Practice Page for Selenium WebDriver']")).click();
	
		System.out.println("check parent title-->> "+driver.getTitle());

		Set <String>  sets = driver.getWindowHandles();
		
		Iterator <String> one = sets.iterator();
		
		String parentwin = one.next();  // get parent window id
				//next() - return the next element in the iterator
				
		String childwind = one.next(); // child window id
		
		driver.switchTo().window(childwind);  //we are swithed to child window
		
		System.out.println("check child title-->> "+driver.getTitle());
		
		driver.switchTo().window(parentwin);// switch to parent
		System.out.println("check parent title->>  "+driver.getTitle()); // check parent title
		
		
		
	}

}
