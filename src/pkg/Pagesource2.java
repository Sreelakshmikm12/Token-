package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesource2 {

	public static void main(String[] args) {
		String s="https://www.firefox.com";
		Firefoxdriver=new FirefoxDriver();
		driver.get(s);
		String st=driver.getPageSource();
		if(st.contains("Google")) {
			System.out.println("Gmail text is present");
		}
		else
		{
			System.out.println("Gmail is not present");
		}
		driver.quit();

	}

}
