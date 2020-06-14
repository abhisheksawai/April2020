package exceptionHandles;

import java.io.File;
import java.io.FileInputStream;

public class exception1 {
	
	public static void main(String[] args) {
		
		int num1=100;
		int num2=0;
		int div;
		div=num1/num2;  //arithemtic run time , uncheck
		System.out.println("division is "+div);
		
		File f= new File("D:\\your path");
		FileInputStream fis = new FileInputStream(f); // check exception at complite time
		
		System.out.println("baki ka coding here");
		//1000 lineof code here
	}

}
