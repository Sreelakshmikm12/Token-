package testngpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazoncart {
	ChromeDriver driver;
	String baseurl="https://www.amazon.in";
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void AmazonMobile()
	{
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobile phones",Keys.ENTER);
		String exp="Amazon.in:mobiles";
		String actual=driver.getTitle();
		if(exp.equals(actual))
		{
		System.out.println("pass");
		}
	else
	{
		System.out.println("fail");
	}
		String parentWindow = driver.getWindowHandle();//currentwindow
		System.out.println("Parent Window Title"+driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[1]/div/div[2]/div/span/a/div/img")).click();
		
		Set<String>allWindowHandles = driver.getWindowHandles();
		for(String handle : allWindowHandles) {
			
			if(!handle.equalsIgnoreCase(parentWindow))
			{
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
				driver.close();
			}
			driver.switchTo().window(parentWindow);
	}
}

}



