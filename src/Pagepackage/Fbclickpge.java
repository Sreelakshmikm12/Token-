package Pagepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbclickpge {
	WebDriver driver;
	By fbclickpge=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	By fbsignup=By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div[2]/div/div/span/a");
	
	public Fbclickpge(WebDriver driver) {
		this.driver=driver;
}
	public void click() {
		driver.findElement(fbclickpge).click();
	}

	public void signup() {
		driver.findElement(fbsignup).click();

}
}