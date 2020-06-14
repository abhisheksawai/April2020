package classesAndObjects;

public class passingpara2Method {
	
	public void addition(int no1)
	{
		System.out.println("no1 is print here "+no1);
	}
	
	public static void main(String[] args) {
		
		passingpara2Method p = new passingpara2Method();
		p.addition(40);
		
		System.out.println("back to main , remaining code");
	}

}
