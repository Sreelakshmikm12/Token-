package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	ChromeDriver driver;
	String baseurl="file:///C:/Users/User/Desktop/Luminar/alert.html";
@Before
	public void setUp() {
		driver=new ChromeDriver();
		driver.get(baseurl);

}
@Test
public void dropdown()
{
WebElement day=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
Select ob =new Select (day);
ob.selectByValue("04");
}

}
