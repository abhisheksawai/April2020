package keywordsDemo;

public class checkFinal2 extends FinalMethodCheck {
	
	public final void finalmethod()
	{
		System.out.println("final method");
	}
	
	public static void main(String[] args) {
		
		checkFinal2 cf = new checkFinal2();
		cf.finalmethod();
	}

}
