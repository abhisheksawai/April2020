package accessModifierDemo;

public class CheckPrivate {
	
	private void m1() // only within the current class where it is written
	{
		System.out.println("m1 method");
	}
	
	public void m2() // anywhere in the project april2020
	{
		System.out.println("public m2 method ffrom check priavte");
	}
	
	public static void main(String[] args) {
		
		CheckPrivate cp =  new CheckPrivate();
		cp.m1();
				
	}

}
