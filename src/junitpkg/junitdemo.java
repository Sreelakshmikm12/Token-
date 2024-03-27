package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class junitdemo {
	
	ChromeDriver driver;
	String baseurl="https://www.facebook.com";
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void titleverification()
	{
		String exp="Facebook";
		String actualtitle=driver.getTitle();
		
	if(actualtitle.equals(exp))
	{
		System.out.println("pass");
	}
	else {
		System.out.println("fail");
	}
	}
	@After
	public void aftertest() {
		driver.quit();
	}

}
