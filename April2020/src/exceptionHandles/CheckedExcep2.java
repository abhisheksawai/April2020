package exceptionHandles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExcep2 {

	public static void main(String[] args)  {

		try {
			
		
		File f = new File("path");
		FileInputStream fis = new FileInputStream(f);
		}
		catch(Exception e)
		{
			System.out.println("your msg"+e);
		}
		System.out.println("after file wal code");
		
		
	}

}
