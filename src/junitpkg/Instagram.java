package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
ChromeDriver driver;
String baseurl="https://www.instagram.com";

@Before
public void setUp() {
	driver=new ChromeDriver();
	driver.get(baseurl);
}
	@Test
	public void iglogin()
	{
		driver.findElement(By.xpath("//form[@id='loginForm']/div/div[1]/div/label/input")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("fsd");
		driver.findElement(By.xpath("//form[@id='loginForm']/div/div[3]")).submit();


	}
}
