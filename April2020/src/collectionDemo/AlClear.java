package collectionDemo;

import java.util.ArrayList;
import java.util.List;

public class AlClear {

	public static void main(String[] args) {

		//ArrayList a1 = new ArrayList(); 
		List a1 = new ArrayList();
		a1.add(100);
		a1.add("abhishek");
		a1.add('Y');
		a1.add(null);
		a1.add("karthik");
		System.out.println(a1);
		List a2 = new ArrayList(a1);
		System.out.println(a2);
		
		List a3 = new ArrayList();
		a3.addAll(a1);
		a3.add("extra other a1");
		System.out.println(a3);
		
	}

}
