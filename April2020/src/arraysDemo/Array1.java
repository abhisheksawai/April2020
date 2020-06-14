package arraysDemo;

public class Array1 {
	
	public static void main(String[] args) {
		
		int a1; //declaration
		a1=10; // initilisation
		System.out.println(a1);
		System.out.println("----------------");
		int b=20;
		int c=30;
		
	//student s =  new student();
		int a[] = new int[3]; //declaration
		
		a[0]=11;
		a[1]=22;
		a[2]=33;
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		System.out.println("printin usng for looop");
		
		for(int i=0;i<3;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
