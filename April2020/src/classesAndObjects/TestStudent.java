package classesAndObjects;

public class TestStudent {
	
	

	public static void main(String[] args) {
		
		Student s2 = new Student();
		System.out.println(s2.rollno);
		System.out.println(s2.name);
		
		Student s3 = new Student();
		s3.rollno=201;
		s3.name="bhushan";
		System.out.println(s3.rollno);
		System.out.println(s3.name);

	}

}
