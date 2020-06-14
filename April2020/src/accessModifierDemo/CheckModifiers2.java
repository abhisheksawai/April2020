package accessModifierDemo;

public class CheckModifiers2 extends CheckPrivate {

	public static void main(String[] args) {

		CheckPrivate cp1 = new CheckPrivate();
		
		cp1.m2();
		cp1.m1();
		
	}

}
