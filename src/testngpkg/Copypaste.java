package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Copypaste {
ChromeDriver Driver;
String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
@BeforeTest
public void setUp() {
	Driver=new ChromeDriver();
	Driver.get(baseurl);
}
@Test
public void copypastemethd()
{
	WebElement fullname=Driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
	WebElement reddiff=Driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
	Actions act=new Actions(Driver);
	act.sendKeys("abc");
	act.keyDown(fullname,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
	act.keyDown(fullname,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
	act.keyDown(reddiff,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
	act.perform();
}
}
