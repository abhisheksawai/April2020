package polymorphismDemo;

public class Child extends Parent{
	
	public void marriage()
	{
		System.out.println("love marriage");
	}


	public static void main(String[] args) {

		Child c = new Child();
		c.property();
		c.marriage();
		
	}

}
