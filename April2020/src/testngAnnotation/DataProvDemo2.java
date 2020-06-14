package testngAnnotation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvDemo2 {
	
	//Parameters()
	@Test(dataProvider="data")
	public void one(String uname, String pwd)  
	{
		System.out.println("username is "+uname);
		System.out.println("password is "+pwd);
		System.out.println("TC-one - Executed");
	}
	


	
}
