package collectionDemo;

public class Typecasting {

	public static void main(String[] args) {

		int x = 'a';
		Integer b = 10;
		System.out.println("value of b is "+b);
		System.out.println(x);  //implicit
		
		double d = 10;
		int i1 = (int) d;
		System.out.println("int i1 = (int) d;-->");
		System.out.println(i1);
		
	}

}
