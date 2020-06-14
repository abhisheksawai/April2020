package advanceSelenium;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4JDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\browser exe\\chromedriver83.exe");
		WebDriver driver = new ChromeDriver();
		
		Logger log = Logger.getLogger("Regression pack release 2.3");
		PropertyConfigurator.configure("log4j.properties");
		log.info("-------------------------------------------------");
		log.info("Execution Started.....!!!");
		driver.get("https://www.facebook.com/");
		log.info("browser launched");
		driver.manage().window().maximize();
		log.info("browser maximise");
		log.error("error occureder");
		log.debug("debug msg");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("aprilbatch");
		log.info("entered username");
		log.error("error occureder");
		driver.findElement(By.xpath("//input[@id='wronf']")).sendKeys("some");
		log.info("entered password");
		log.error("error occureder");
		log.debug("debug msg");
		
		//i am on mute
		
		
		
		
	}
}
