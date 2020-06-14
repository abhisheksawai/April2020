package polymorphismDemo;

public class returnType {
	
	public void msg()
	{
		System.out.println("only message");
	}
	
	public int add()
	{
		int no1=10;
		int no2=20;
		int sum;
		sum=no1+no2; // 30 is the calculation
		return sum;
	}
	
	
	public static void main(String[] args) {
		
		returnType r = new returnType();
		r.msg();
		
		int getsum;
		
		getsum = r.add();
		System.out.println(getsum);
		
		
	}

}
