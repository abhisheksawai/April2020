package keywordsDemo;

public class FinalVariableCheck {
	
	final int v =1001;
	

	public static void main(String[] args) {

		final int i =100;
		
		int j=50;
		System.out.println("i is "+i);
		System.out.println("J value is "+j);
		
		j=70;
		System.out.println("changed J value->  "+j);
		
		//i=130;
		System.out.println("change i valueis "+i);
		
	}

}
