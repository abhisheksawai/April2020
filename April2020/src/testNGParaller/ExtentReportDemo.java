package testNGParaller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportDemo {
	
	static ExtentTest  test;
	static ExtentReports report;
	
	@BeforeClass
	public void beoforeclass()
	{
		System.out.println("user dir is-> ");
		System.out.println(System.getProperty("user.dir"));
		report = new ExtentReports(System.getProperty("user.dir")+"\\Extentanything.html");
		test = report.startTest("RegressionPack Release 7.6 ");
		
	}
	
		@Test
		public void extentcheck()
		{
			test.log(LogStatus.PASS, "launching browser");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\browser exe\\chromedriver83.exe");
			WebDriver driver = new ChromeDriver();
			//driver.get("https://www.facebook.com/");
			test.log(LogStatus.PASS, "browser lauch succesfuly");
			driver.manage().window().maximize();
			
			driver.get("https://www.google.co.in");
			if(driver.getTitle().equals("Google"))
			{
			test.log(LogStatus.PASS, "Navigated to the specified URL");
			}
			else
			{
			test.log(LogStatus.FAIL, "Test Failed");
			}

		}
		
		@AfterClass
		public void afterclass()
		{
			report.endTest(test);
			report.flush();
		}

}
