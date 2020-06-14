package superKeyword;

public class Maruti extends Car {

		String maruticolor = "Yelow";
		
		public void printcolor()
		{
			System.out.println(maruticolor);
		}
		
		
		public static void main(String[] args) {	
			
			Maruti m = new Maruti();
			m.printcolor();
		
	}

}
