package Testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pagepackage.Fbclickpge;
import Pagepackage.Fbloginpage;

public class Fbclicktest {
	WebDriver driver;
	@BeforeTest
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}
	@Test
	public void clicktest() {
		Fbclickpge ob=new Fbclickpge(driver);
		ob.click();
		ob.signup();
}
}
