package accessModifierDemo;

public class CheckDefault {
	
	void d1()  //only within the package
	{
		System.out.println("d1 ");
	}

	public void d2() // anywhere in the project april2020
	{
		System.out.println("CheckDefault d2 public");
	}
	
	
}
