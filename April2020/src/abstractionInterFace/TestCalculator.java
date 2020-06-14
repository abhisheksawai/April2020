package abstractionInterFace;

public class TestCalculator extends Calculator {

	
	void add() {
		
			System.out.println("addition function");
	}
	
	public static void main(String[] args) {
		
		TestCalculator tc = new TestCalculator();
		tc.add();
		tc.sub();
		
		//Calculator c = new Calculator(); // this is abstract class
		
	}
	

}
