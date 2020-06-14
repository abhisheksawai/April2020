package arraysDemo;

public class TestEmp {

	public static void main(String[] args) {

		Emp e1 = new Emp(101, "Abhijeet");
		Emp e2 = new Emp(102, "Anushree");
		Emp e3 = new Emp(103, "karthik");
		//int a[] = new int[3]; //declaration
		Emp e[] = new Emp[3];
//		a[0]=11;
//		a[1]=22;
//		a[2]=33;
		
		e[0] = e1;
		e[1] = e2;
		e[2] = e3;
		
		for(int i=0; i <e.length ; i++)
		{
			//System.out.println(e[i]);
			System.out.println(e[i].empName);
			System.out.println(e[i].empno);
		}
		
		for( Emp d: e)
		{
			System.out.println(d.empName);
			System.out.println(d.empno);
			
		}
		
		for( Emp d: e)
		{
			System.out.println(d);
			
		}
	}
}
