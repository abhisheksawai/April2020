package collectionDemo;

import java.util.ArrayList;

public class arraylistStudent2 {
	
	public static void main(String[] args) {
		
		ArrayList<Student> al1 = new ArrayList<Student>();
		al1.add(new Student(101,"Abhijeet"));
		
		
		System.out.println(al1);
		
		for( Object o : al1)
		{
				Student s =  (Student) o; // o - type cast to student 
				System.out.println(s.rollno);
				System.out.println(s.name);
		}
		
		
	}

}
