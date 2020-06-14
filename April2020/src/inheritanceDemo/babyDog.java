package inheritanceDemo;

public class babyDog extends Dog{
	
	public void name()
	{
		System.out.println("babay dog name is garry");
	}

	public static void main(String[] args) {
		
		babyDog bd = new babyDog();
		bd.eat(); // animal
		bd.bark(); // from dog
		bd.name(); // from baaby dog
		
		// multilevel - thnk on this for 1 min and we will discus more
		
		Dog 	b2 = new babyDog();
		b2.bark();
		b2.eat();
		//b2.name();
		
		Animal 	b3 = new babyDog();
		b3.eat();
		
		//babyDog b4 = new Dog(); 
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
