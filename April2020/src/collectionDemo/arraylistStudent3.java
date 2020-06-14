package collectionDemo;

import java.util.ArrayList;

public class arraylistStudent3 {
	
	public static void main(String[] args) {
		
		ArrayList<Student> al1 = new ArrayList<Student>();
		al1.add(new Student(101,"Abhijeet"));
		
		System.out.println(al1);
		
		for( Student o : al1)
		{
				System.out.println(o.rollno);
				System.out.println(o.name);
		}
	}
}
