package collectionDemo;

import java.util.ArrayList;

public class arraylistStudent {
	
	public static void main(String[] args) {
		
		ArrayList als = new ArrayList();
		//als.add("some value");
		als.add(new Student(100,"Bhushan"));
		als.add(new Student(101,"Abhijeet"));
		als.add(new Employee(1002,"emp1"));
		
		System.out.println(als);
		
		for( Object o : als)
		{
			if(o instanceof Student)
			{
				Student s =  (Student) o; // o - type cast to student 
				System.out.println(s.rollno);
				System.out.println(s.name);
			}
			
			if(o instanceof Employee)
			{
				Employee e = (Employee) o;
				System.out.println(e.empno);
				System.out.println(e.empname);
			}
			
		}
		
		
		
		
	}

}
