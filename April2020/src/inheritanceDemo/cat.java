package inheritanceDemo;

public class cat extends Animal {
	
	public void c1()
	{
		System.out.println("c1");
	}

	public static void main(String[] args) {
		cat c = new cat();
		c.eat();
		c.c1();
		
		
		
	}
	
}
