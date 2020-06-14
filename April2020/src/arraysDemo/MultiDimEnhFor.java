package arraysDemo;

public class MultiDimEnhFor {
	
	public static void main(String[] args) {
		int a[][] = {{1,2,3}, {45,6,7},{54,65,78}};
		int b[][] = new int[3][4];
		
		b[0][0]=11;
		b[0][1]=22;
		b[0][2]=33;
		b[0][3]=34;
		
		b[1][0]=451;
		b[1][1]=65;
		b[1][2]=75;
		b[2][0]=545;
		b[2][1]=655;
		b[2][2]=785;
		
		System.out.println("b array ka lenght is "+b.length);
		
		for( int[] b1 : b)
		{
			System.out.println(b1);
		}
		
	}

}
