package testngAnnotation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvDemo {
	
	@Test(dataProvider="data")
	public void one(String uname, String pwd)  
	{
		System.out.println("username is "+uname);
		System.out.println("password is "+pwd);
		System.out.println("TC-one - Executed");
	}
	
	@DataProvider
	public Object[][] data()
	{
	Object arr[][]= new Object[2][2];
	arr[0][0]="abhishek 1";
	arr[0][1]="Password@1";

	arr[1][0]="karthik 2";
	arr[1][1]="password@2";

	return arr;

	}

	
}
