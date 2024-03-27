package testngpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windowhandler {
ChromeDriver driver;
String baseurl="https://demo.guru99.com/popup.php";
@BeforeTest
public void setup() {
	driver=new ChromeDriver();
	driver.get(baseurl);
}
@Test
public void test() {
	String parentWindow = driver.getWindowHandle();//currentwindow
	System.out.println("Parent Window Title"+driver.getTitle());
	driver.findElement(By.xpath("/html/body/p/a")).click();
	
	Set<String>allWindowHandles = driver.getWindowHandles();
	for(String handle : allWindowHandles) {
		
		if(!handle.equalsIgnoreCase(parentWindow))
		{
			driver.switchTo().window(handle);
			driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("sreelakshmi@gmail.com");
			driver.close();
		}
		driver.switchTo().window(parentWindow);
	}
}
}
