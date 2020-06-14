package inheritanceDemo;

public class Tiger extends Animal{
	
	public void t1()
	{
		System.out.println("i am tiger");
	}

	
	public static void main(String[] args) {
		Tiger t = new Tiger();
		t.eat();
		t.t1();
	}
}
