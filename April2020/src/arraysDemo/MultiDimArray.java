package arraysDemo;

public class MultiDimArray {
	
	public static void main(String[] args) {
		int a[][] = {{1,2,3}, {45,6,7},{54,65,78}};
		int b[][] = new int[3][3];
		
		b[0][0]=11;
		b[0][1]=22;
		b[0][2]=33;
		b[1][0]=451;
		b[1][1]=65;
		b[1][2]=75;
		b[2][0]=545;
		b[2][1]=655;
		b[2][2]=785;
		
		for(int r =0 ; r < 3;r ++)		{
			for(int c =0 ; c <3 ;c++)
			{
				System.out.println(b[r][c]);
			}
		}
		System.out.println("----------");
		
		for(int r =0 ; r < 3;r ++)		{
			for(int c =0 ; c <3 ;c++)
			{
				System.out.println(a[r][c]);
			}
		}
		
		
	}

}
