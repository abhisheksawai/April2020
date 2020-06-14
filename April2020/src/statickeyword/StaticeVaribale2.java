package statickeyword;

public class StaticeVaribale2 {

	static int no1=10;
	
	public StaticeVaribale2()
	{
		no1++;
		System.out.println(no1);
	}
	
	public static void main(String[] args) {
		
		StaticeVaribale2 sv1 = new StaticeVaribale2();
		StaticeVaribale2 sv2 = new StaticeVaribale2();
		StaticeVaribale2 sv3 = new StaticeVaribale2();
		
	}

}
