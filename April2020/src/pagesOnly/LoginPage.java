package pagesOnly;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	By txt_username_fb = By.xpath("//input[@id='email']");
	By txt_password_fb = By.xpath("//input[@id='pass']");
	By btn_login_fb = By.xpath("//input[@value='Log In']");
	
	WebDriver  driver;	
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
	}

	public void enterusername()
	{
		driver.findElement(txt_username_fb).sendKeys("pomdemo");
	}

	public void enterpassword()
	{
		driver.findElement(txt_password_fb).sendKeys("pom@password");
	}

	public void clickonloginbutton()
	{
		driver.findElement(btn_login_fb).click();
	}

	public void verifyloginscuss()
	{
		System.out.println("welcome to facebook, login done");
	}
	
}
