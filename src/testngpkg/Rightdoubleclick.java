package testngpkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rightdoubleclick {
	ChromeDriver Driver;
	String baseurl="https://demo.guru99.com/test/simple_context_menu.html";
	@BeforeTest
	public void setUp() {
		Driver=new ChromeDriver();
		Driver.get(baseurl);
	}
	@Test
	public void Rightdoubleclickmthd() {
		WebElement ele=Driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		WebElement edit=Driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]"));
		WebElement click=Driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		Actions act=new Actions(Driver);
		act.contextClick(ele);
		act.click(edit);
		
	act.perform();
	Alert a=Driver.switchTo().alert();
	a.accept();
	act.doubleClick(click);
	act.perform();
	String alerttext=a.getText();
	System.out.println("alerttext:"+alerttext);
	a.accept();
		}
}
	