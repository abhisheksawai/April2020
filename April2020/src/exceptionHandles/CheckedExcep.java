package exceptionHandles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExcep {

	public static void main(String[] args) throws IOException,FileNotFoundException {

		File f = new File("path");
		FileInputStream fis = new FileInputStream(f);
		
		System.out.println("after file wal code");
		
		
	}

}
