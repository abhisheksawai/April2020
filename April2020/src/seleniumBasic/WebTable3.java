package seleniumBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\browser exe\\chromedriver83.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[1]/td[1]/a")).click();
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[1]/td[1]/a")).getText());
		
		List <WebElement> compname = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]"));  // compnay name
		System.out.println("compname of count is "+compname.size()); 
		
		String comptosearch = "Prism Johnson";
		
		//xpath ofr prem close 
		List <WebElement> prevclose =  driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[3]"));
		for(int row=1; row<10 ; row++)
		{
				System.out.println(compname.get(row).getText());  // getting company name
				if(compname.get(row).getText().equalsIgnoreCase(comptosearch))
				{
					//print it prev close
					System.out.println(prevclose.get(row).getText());
				}
		}
		
		
	}

}
