package accessModifierDemo;

public class CheckModifiers {

	public static void main(String[] args) {

		CheckPrivate cp1 = new CheckPrivate();
		
		cp1.m2();
		//cp1.m1();
		CheckDefault cd = new CheckDefault();
		cd.d1();
	}

}
