package constructorsDemo;

public class Student {

	int rollno;
	String name;
	
	public void Student()
	{
		System.out.println("defualt const");
	}
	
	public void m1()
	{
		System.out.println("small m");
	}
	
	public void M1()
	{
		System.out.println("cap M");
	}
	
	public static void main(String[] args) {

		Student s = new Student();
		s.M1();
		s.m1();
				
	}

}
