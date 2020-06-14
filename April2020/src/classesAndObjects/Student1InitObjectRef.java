package classesAndObjects;

public class Student1InitObjectRef {
	
	int rollno;
	String name;  // instance variable
	
	public void library()
	{
		int bookcount =190; // local to lib method
		System.out.println("total book in lib are "+bookcount);
	}

	public static void main(String[] args) {
		
		//int discount =10;
		
		Student1InitObjectRef s1 = new Student1InitObjectRef();
		s1.rollno = 1;
		s1.name = "Sri";
		
		System.out.println(s1.rollno);
		System.out.println(s1.name);
		
		Student1InitObjectRef s2 = new Student1InitObjectRef();
		System.out.println("printint s2");
		System.out.println(s2.rollno);
		System.out.println(s2.name);
	}

}
