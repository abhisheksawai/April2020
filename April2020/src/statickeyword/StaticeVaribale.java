package statickeyword;

public class StaticeVaribale {

	int no1=10;
	
	public StaticeVaribale()
	{
		//System.out.println("def con");
		no1++;
		System.out.println(no1);
	}
	
	public static void main(String[] args) {
		
		StaticeVaribale sv1 = new StaticeVaribale();
		StaticeVaribale sv2 = new StaticeVaribale();
		StaticeVaribale sv3 = new StaticeVaribale();
		
	}

}
