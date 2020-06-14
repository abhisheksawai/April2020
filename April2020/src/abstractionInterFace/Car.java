package abstractionInterFace;

public class Car implements Engine , Tyre{
	
	public void carmethod()
	{
		System.out.println("car method");
	}

	public void countTyre() {
		System.out.println("car - count tyre");
	}
	
	public void engineCapcity() {
		System.out.println("car - engineCapcity");
	}

	public void colorTyre() {
		System.out.println("car - colorTyre");
	}
	
	public void same() {
		System.out.println("same");
	}

	public static void main(String[] args) {
		 Car c = new Car();
		 c.engineCapcity();
		 c.engineColor();
		 
		 c.colorTyre();
		 c.countTyre();
		 
		 c.same();
		 
		 c.carmethod(); //self method
		 
		 
		 //Car c1 = new Engine();
		 //Car c3 = new Tyre();
		// Engine e4 = new  Engine();
		 Engine e5 = new  Car();
		 
		 
		 e5.engineCapcity();
		 e5.engineColor();
		 e5.same();
	//	 Engine e6 = new  Tyre();
	
		 Tyre t2 = new Car();
		 t2.colorTyre();
		 t2.countTyre();
		 t2.same();
		 
		 //Tyre t3 = new Engine();
		 
	}

	public void engineColor() {
		System.out.println("engine color");
	}
	
}
