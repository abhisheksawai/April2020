package exceptionHandles;

import java.io.File;
import java.io.FileInputStream;

public class tryCatchArith {
	
	public static void main(String[] args) {
		
		int num1=100;
		int num2=0;
		int div;
		
	try {
			div=num1/num2;  //arithemtic run time , uncheck
			System.out.println("division is "+div);
	}
		catch(NullPointerException ae) 	{
		System.out.println(ae);	
	}
	catch(ArithmeticException ae) 	{
		System.out.println(ae);	
	}
	
	
		System.out.println("baki ka coding here");
		//1000 lineof code here
	
	
	}

}
