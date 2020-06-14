package encapsulationDemo;

public class TestEmp {

	
	public static void main(String[] args) {
		
		Employee e = new Employee();
	//	System.out.println(e.name);
		e.setName("Abhishek");
	//	System.out.println(e.name);
		System.out.println(e.getName());
	
		String getname;
		getname = e.getName();
		System.out.println("getname printin"+getname);
	
	}
}
