package conditionsDemo;

public class SwitchDemoVinit {
	
	public static void main(String[] args) {
		
		int i=2;
		
		switch(i)
		{
			case 1:
			{
				System.out.println("case 1");break;
			}
			case 2:
			{
				System.out.println("case 2");
				break;
			}
			case 3:
			{
				System.out.println("case 3");break;
			}
			case 4:
			{
				System.out.println("case 4");break;
			}
			default:
				System.out.println("default case will executed");
		}
		
		System.out.println("after swrich");
	}
	
	

}
