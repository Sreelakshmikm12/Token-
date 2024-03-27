package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Draganddrop {
	ChromeDriver Driver;
	String baseurl="https://demo.guru99.com/test/drag_drop.html";
	@BeforeTest
	public void setUp() {
		Driver=new ChromeDriver();
		Driver.get(baseurl);
	}
	@Test
	public void dragdropmthd() {
		WebElement amount1=Driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement bank=Driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement account=Driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		WebElement amount=Driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		
		
		WebElement sales=Driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		WebElement amnt=Driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement acnt=Driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
		WebElement acnt1=Driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
		Actions act=new Actions(Driver);
		act.dragAndDrop(bank,account);
		act.dragAndDrop(amount1,amount);
		act.dragAndDrop(sales,acnt);
		act.dragAndDrop(amnt,acnt1);
		act.perform();
		boolean le=Driver.findElement(By.xpath("//*[@id=\"equal\"]/a")).isDisplayed();
		if(le) {
			System.out.println("perfect is displayed");
		}
		else {
			System.out.println("perfect is not displayed");
		}
	}
}
