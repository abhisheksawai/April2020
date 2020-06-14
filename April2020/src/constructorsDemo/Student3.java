package constructorsDemo;

public class Student3 {

	int rollno;
	String name;  // instance var
	
	public Student3(int i, String nm)
	{
		System.out.println("para const");
		
		System.out.println("printin i itself "+i);
		System.out.println("printin nm here "+nm);
		
		rollno = i;
		name = nm;
		
	}
	
	public void display()
	{
		System.out.println("instance roll is  "+rollno);
		System.out.println("instance name is  "+name);
	}
	
	public static void main(String[] args) {

		Student3 s = new Student3(100,"vishal");
		s.display();
	}

}
