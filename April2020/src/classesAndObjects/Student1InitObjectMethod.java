package classesAndObjects;

public class Student1InitObjectMethod {
	int rollno;
	String name;  
	public static void main(String[] args) {
		Student1InitObjectMethod s1 = new Student1InitObjectMethod();
		Student1InitObjectMethod s2 = new Student1InitObjectMethod();
		s2.addRecords(3,"Priti");  
		System.out.println("printin s2 data");
		System.out.println("printing with object name that is s2.");
		System.out.println(s2.rollno);  //0
		System.out.println(s2.name);  // null
		Student1InitObjectMethod s3 = new Student1InitObjectMethod();
		System.out.println(s3.rollno);  //0
		System.out.println(s3.name);  // null
	}
public void addRecords(int i, String string) {
		System.out.println("roll number is "+i);
		System.out.println("Name is "+string);
		rollno = i;
		name = string;
	}
}
