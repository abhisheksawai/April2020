package statickeyword;

public class StaticMethod {

	public void normalmethod()
	{
		System.out.println("normalmethod");
	}

	public static  void method()
	{
		System.out.println("method");
	}
	
	public static void main(String[] args) {
		
		StaticMethod sm = new StaticMethod();
		sm.normalmethod();
	//	normalmethod();
		//sm.method();
		method();
		
	}
	
}
