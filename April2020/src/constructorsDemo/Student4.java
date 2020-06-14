package constructorsDemo;

public class Student4 {

	int rollno;
	String name;  // instance var
	
	public Student4(int rollno, String name)
	{
		//rollno = i;
		//name = nm;
		
		this.rollno = rollno;
		this.name = name;
	}
	
	public void display()
	{
		System.out.println("instance roll is  "+rollno);
		System.out.println("instance name is  "+name);
	}
	
	public static void main(String[] args) {
		Student4 s = new Student4(100,"vishal");
		s.display();
	}

}
