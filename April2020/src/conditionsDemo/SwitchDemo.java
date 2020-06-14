package conditionsDemo;

public class SwitchDemo {
	
	public static void main(String[] args) {
		
		int i=2;
		
		switch(i)
		{
			case 1:
			{
				System.out.println("case 1");
			}
			case 2:
			{
				System.out.println("case 2");
			}
			case 3:
			{
				System.out.println("case 3");
			}
			case 4:
			{
				System.out.println("case 4");
			}
			default:
				System.out.println("default case will executed");
		}
		
		System.out.println("after swrich");
	}
	
	

}
