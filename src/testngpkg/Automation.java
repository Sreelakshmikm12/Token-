package testngpkg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Automation {
	ChromeDriver driver;
	String baseurl="https://automationexercise.com/login";
	@BeforeTest
	public void setUp() {
	driver=new ChromeDriver();
	driver.get(baseurl);
	}
	@Test
	public void geturl() throws IOException
	{
	driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")).sendKeys("Sreelakshmi KM");
	driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys("sreechinnuzz801@gmail.com")	;
	driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
	
	driver.findElement(By.xpath("//*[@id=\"id_gender2\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Sree@123");
	WebElement day=driver.findElement(By.xpath("//*[@id=\"days\"]"));
	Select ob =new Select (day);
	ob.selectByValue("10");
	
	WebElement month=driver.findElement(By.xpath("//*[@id=\"months\"]"));
	Select mon =new Select (month);
	mon.selectByVisibleText("October");
	
	WebElement year=driver.findElement(By.xpath("//*[@id=\"years\"]"));
	Select yr =new Select (year);
	yr.selectByValue("2000");

	driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("Sreelakshmi ");
	driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("KM ");
	driver.findElement(By.xpath("//*[@id=\"company\"]")).sendKeys("Luminar Technolab ");
	driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("Sreevilasam Mannar p.o ");
	driver.findElement(By.xpath("//*[@id=\"address2\"]")).sendKeys("Indivaram Mannar p.o ");
	
	driver.findElement(By.xpath("//*[@id=\"country\"]")).sendKeys("India");

	driver.findElement(By.xpath("//*[@id=\"state\"]")).sendKeys("Kerala");
	driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Alappuzha");
	driver.findElement(By.xpath("//*[@id=\"zipcode\"]")).sendKeys("689622");
	driver.findElement(By.xpath("//*[@id=\"mobile_number\"]")).sendKeys("8976543210");
	driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/form/button")).click();




	


	
	
	
	}}	