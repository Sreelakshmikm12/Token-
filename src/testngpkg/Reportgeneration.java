package testngpkg;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reportgeneration {
	ExtentHtmlReporter reporter;
	ExtentReports extent;
	ExtentTest test;
	ChromeDriver driver;
	String baseurl="https://www.facebook.com";
@BeforeTest
public void beforetest() {
	reporter=new ExtentHtmlReporter("./Report/myreport1.html");
	reporter.config().setDocumentTitle("Automationreport");
	reporter.config().setReportName("functional test");
	reporter.config().setTheme(Theme.DARK);
	extent=new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("hostname","localhost");
	extent.setSystemInfo("os","window10");
	extent.setSystemInfo("testname","abc");
	extent.setSystemInfo("Browser name","chrome");
	
}
@Test
public void fbtitleverification() {
	test=extent.createTest("fbtitleverification");
	String exp="facebook";
	String act=driver.getTitle();
	Assert.assertEquals(act,exp);
	
}
@AfterTest
public void teardown() {
	extent.flush();
}
@AfterMethod
public void browserclose(ITestResult result) throws IOException
{
	if(result.getStatus()==ITestResult.FAILURE)
	{
	test.log(Status.FAIL, "test is failed"+result.getName());
	test.log(Status.FAIL, "test is failed"+result.getThrowable());
}
    else if(result.getStatus()==ITestResult.SKIP)
	{
		test.log(Status.SKIP,"test case is skipped is"+result.getName());
	}
	else if(result.getStatus()==ITestResult.SUCCESS) {
		test.log(Status.PASS,"test case is passed is"+result.getName());

	
}

}}


