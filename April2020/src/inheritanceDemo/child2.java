package inheritanceDemo;

import conditionsDemo.parentfromCon;

public class child2 extends parentfromCon {
	
	public void c1()
	{
		System.out.println("edu");
	}
	
	public static void main(String[] args) {
		
		child2 c = new child2();
		c.c1();
		c.parentfromc();
		//c.flat();
		
		//parent p = new parent();
		//p.flat();
		
	}

}
