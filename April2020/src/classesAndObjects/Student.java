package classesAndObjects;

public class Student {
	
	int rollno;
	String name;  // instance variable
	public void library()
	{
		int bookcount =190; // local to lib method
		System.out.println("total book in lib are "+bookcount);
	}

	public static void main(String[] args) {
		int i; // local variable
		//classname objref = new classname();
		Student s1 = new Student();
		s1.rollno = 100;
		s1.name = "Vishal";
		System.out.println(s1.rollno);  
		System.out.println(s1.name);		
		//objectname.methodname
		s1.library();
			
	}

}
