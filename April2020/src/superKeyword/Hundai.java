package superKeyword;

public class Hundai extends Car{
	
	String colorofCar = "black";
	
	public Hundai(int i) {
		super(60);
		System.out.println(i);
	}

	public void printcolor()
	{
		System.out.println("colorofCar " + colorofCar);
		System.out.println("super.colorofCar-> from parent color is "+super.colorofCar);
		super.drive();  // identify who is the parent here
	}
	
	public void drive()
	{
		//super.drive();
		System.out.println("drive the car Hundai ");
		//super.drive();
	}
	public static void main(String[] args) {
		
		Hundai h = new Hundai(5);
		h.printcolor();
		h.drive();
		
		//System.out.println("super.colorofCar-> from parent color is "+super.colorofCar);
		
	}

	
	
}
