package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstscript {

	public static void main(String[] args) {

		
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	
	String s="Google";
	String st=driver.getTitle();
	if(st.equals(s)) {
		System.out.println("Pass");
		
	}
	else {
		System.out.println("Fail");
	}
	driver.quit();
	
	}

}
