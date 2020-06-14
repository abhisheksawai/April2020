package collectionDemo;

import java.util.ArrayList;
import java.util.List;

public class AlEmpty {

	public static void main(String[] args) {

		ArrayList a1 = new ArrayList(); 
		//List a2 = new ArrayList();
		//List a3 = new List();
		
		a1.add(100);
		a1.add("abhishek");
		a1.add('Y');
		a1.add(3.123);
		a1.add(3.124);
		a1.add(null);
		//a1.add();
		a1.add("karthik");
		
		a1.remove("abhishek");
		System.out.println(a1);
		
		a1.set(0, 200);
		System.out.println("after replace "+a1);
		
		System.out.println(a1.isEmpty());
		ArrayList a2 = new ArrayList(); 
		System.out.println(a2.isEmpty());
		
	}

}
