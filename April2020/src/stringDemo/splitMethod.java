package stringDemo;

public class splitMethod {
	
	public static void main(String[] args) {
		
		String s1 = "we are learning selenium";

		String word[] = s1.split(" ");  //string array
		
		for( String w1: word)
		{
			System.out.println(w1);
		}
		
		// you can play wtih single word from given string
		
	}

}
