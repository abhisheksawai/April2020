package collectionDemo;

public class Autoboxing {
	
	public static void main(String[] args) {
		
		int a = 50;
		Integer a2 = new Integer(a); // boxing
		System.out.println(a2);
		
		int b = 60;
		Integer b1;
		b1=b;  // autoboxing
		System.out.println(b1);
		
	}

}
