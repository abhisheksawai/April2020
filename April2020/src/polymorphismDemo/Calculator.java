package polymorphismDemo;

public class Calculator {
	
	public void addition() // no 
	{
		System.out.println("addition method");
	}
	
	public void addition(int a) // 1 
	{
		System.out.println(a+a);
	}
	
	public void addition(int no1, int no2) //2 
	{
		System.out.println(no1+no2);
	}

	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		c.addition();
		c.addition(10);
		c.addition(25, 24);

	}

}
