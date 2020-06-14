package polymorphismDemo;

public class Calculator2 {
	
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
	
	// will that code work here public int addition(int no1, int no3)
	public int addition(int no1, int no3)
	{
		System.out.println();
		return null;
	}

	public void addition(int no1, String no2) //2 
	{
		System.out.println(no1+no2);
	}

	public static void main(String[] args) {
		
		Calculator2 c = new Calculator2();
		c.addition();
		c.addition(10);
		c.addition(25, "karthick");
	}

}
