package classesAndObjects;

public class Student1InitObject {
	
	int rollno;
	String name;  // instance variable
	
	public void library()
	{
		int bookcount =190; // local to lib method
		System.out.println("total book in lib are "+bookcount);
	}

	public static void main(String[] args) {
		
		//int discount =10;
		
		Student1InitObject s1 = new Student1InitObject();
		s1.rollno = 1;
		s1.name = "Sri";
		
		System.out.println(s1.rollno);
		System.out.println(s1.name);
			
	}

}
