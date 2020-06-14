package collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Aliterator {

	public static void main(String[] args) {

		//ArrayList a1 = new ArrayList(); 
		List a1 = new ArrayList();
		a1.add(100);
		a1.add("abhishek");
		a1.add('Y');
		a1.add(null);
		a1.add("karthik");
		
		//Iterator it1 = new Iterator();
		
		Iterator it = a1.iterator();  // iterator is method | Iterator is interface 
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
