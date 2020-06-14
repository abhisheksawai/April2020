package webElementCommands;

public class ReturnTypeProg {

	public void m1() // no need to return anything
	{
		System.out.println("void return type");
	}
	
	public int number(int num1)  // need to return int
	{
		System.out.println("int return type and number is "+num1);
		int add;
		add = num1+num1;
		return add;
	}
	
	public static void main(String[] args) {

		ReturnTypeProg rt = new  ReturnTypeProg();
		rt.m1();
		int addition = rt.number(45);		
		System.out.println("addition is "+addition);
	}

}
