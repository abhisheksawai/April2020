package instanceInitBlock;

public class InstanceBlock {
	
	{ //instance initialiser block
		System.out.println("instance initialiser block"); 
	}
	
	static  // static block
	{
		System.out.println("static block");
	}
	
	public InstanceBlock()  // const
	{
		System.out.println("def cons InstanceBlock");
	}

		public static void main(String[] args) {
		
			InstanceBlock ib = new InstanceBlock();
	}
	
}
