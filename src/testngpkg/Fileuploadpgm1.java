package testngpkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploadpgm1 {
	ChromeDriver Driver;
	String baseurl="https://www.ilovepdf.com/word_to_pdf";
	@BeforeTest
	public void setUp() {
		Driver=new ChromeDriver();
		Driver.get(baseurl);
	}
	@Test
	public void fileuploadmethd() throws Exception {
		Driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();//button click
		fileupload("file:///C:/Users/User/Documents/work.docx");
	}
	private void fileupload(String p) throws AWTException {
		StringSelection strSelection = new StringSelection(p);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);
	    Robot robot =new Robot();
	    
	    robot.delay(3000);
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    robot.delay(2000);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	    
	}
}
