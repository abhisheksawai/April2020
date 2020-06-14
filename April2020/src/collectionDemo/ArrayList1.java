package collectionDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {

		ArrayList a1 = new ArrayList(); 
		//List a2 = new ArrayList();
		//List a3 = new List();
		a1.add(100);
		a1.add("abhishek");
		a1.add('Y');
		a1.add(3.123);
		
		a1.add((Integer.valueOf(10)));  // if auto box is not there , then need to write this.
		System.out.println(a1);
	}

}
