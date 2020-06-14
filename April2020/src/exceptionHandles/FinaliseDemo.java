package exceptionHandles;

public class FinaliseDemo {
	
	public void finalize()
	{
		System.out.println("when we write gc this method will get call automatic");
	}
	
	public static void main(String[] args) {
		
		FinaliseDemo fd1 = new FinaliseDemo();
		FinaliseDemo fd2 = new FinaliseDemo();
		fd1=null;
		fd2=null;
		
		System.gc();
		//system.g
	}

}
