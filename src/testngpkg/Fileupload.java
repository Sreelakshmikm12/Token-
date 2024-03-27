package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupload {
	ChromeDriver Driver;
	String baseurl="https://demo.guru99.com/test/upload/";
	@BeforeTest
	public void setUp() {
		Driver=new ChromeDriver();
		Driver.get(baseurl);
	}
	@Test
	public void fileuploadmethd() {
	Driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("file:///C:/Users/User/Documents/B2B%20Network.pdf");
}}