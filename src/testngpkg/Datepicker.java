package testngpkg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepicker {
WebDriver driver;
String baseurl="https://www.goibibo.com/";
@BeforeTest
public void setup() {
	driver = new ChromeDriver();
}
@BeforeMethod
public void urlooper() {
	driver.get(baseurl);
	driver.manage().window().maximize();
}
@Test
public void test() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.navigate().refresh();
	driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[3]/div/p[1]")).click();
	while(true) {
		WebElement month = driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[3]/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/div"));
		String monthtext=month.getText();
		System.out.println(monthtext);
	if(monthtext.equals("march2024")) {
		break;
		
	}
	else
	{
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[3]/div[2]/div[2]/div/div/div[1]/span[2]"));
	}
	}
	List<WebElement> li=(List<WebElement>) driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[3]/div[2]/div"));
	for(WebElement ele :li) {
		String date= ele.getText();
		if(date.equals("16"))
			{
			ele.click();
			}
			}
}
}
