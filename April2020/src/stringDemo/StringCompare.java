package stringDemo;

public class StringCompare {
	
	public static void main(String[] args) {
		
		String s1 = "vishy";
		String s2 = "vishy";
		String s3 = new String("vishy");
		String s4 = "Saurabh";
		
		System.out.println(s1.equals(s2)); //t
		System.out.println(s1.equals(s3)); //t
		System.out.println(s1.equals(s4)); //f
		System.out.println(s2.equals(s3)); //t
		System.out.println("----");
		System.out.println(s1==(s2)); //t
		System.out.println(s1==(s3)); //f checking mem location SCP or heap[new]
		System.out.println(s1==(s4)); //f
		System.out.println(s2==(s3)); //f
		
		
		
		
		
	}

}
