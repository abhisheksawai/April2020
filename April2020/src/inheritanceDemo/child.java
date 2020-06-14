package inheritanceDemo;

public class child extends parent {
	
	//child is sub class or child class
	
	public void c1()
	{
		System.out.println("edu");
	}
	
	public static void main(String[] args) {
		
		child c = new child();
		c.c1();
		c.flat();
		//c.flat();
		
		//parent p = new parent();
		//p.flat();
		
	}

}
