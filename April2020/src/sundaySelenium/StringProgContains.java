package sundaySelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class StringProgContains {
	
	public static void main(String[] args) throws Exception {
		
		String check = "wrong";
		String sentence = "we are learning";
		
		System.out.println(sentence.contains(check));
		
		
	}

}
