package aggregation;

public class Circle {
	
	Operation op; // aggregation

	public void checksquare()
	{
		op = new Operation();
		int getsquare;
		getsquare=op.square(5);
		System.out.println(getsquare);
	}
	public static void main(String[] args) {
		
		Circle  c = new Circle();
		c.checksquare();
		
		
		
	}
}
