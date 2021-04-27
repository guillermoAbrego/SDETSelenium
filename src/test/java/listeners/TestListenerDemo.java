package listeners;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;

import base.BaseTest;

public class TestListenerDemo implements ITestListener{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub	
	}

	public void onTestSuccess(ITestResult result) {
		Object currentClass = result.getInstance();
		WebDriver driver = ((BaseTest) currentClass).getDriver();
		System.out.println("***Success " + result.getName() + " test has passed"); 
		System.out.println("Driver debug: " + driver); 
		Shutterbug.shootPage(driver, Capture.FULL,true).save("test-output/screenshots/");	
	}
	
	public void onTestFailure(ITestResult result) {
		Object currentClass = result.getInstance();
		WebDriver driver = ((BaseTest) currentClass).getDriver();
		System.out.println("***Error " + result.getName() + " test has failed");
		System.out.println("Driver debug: " + driver); 
		Shutterbug.shootPage(driver, Capture.FULL,true).save("test-output/screenshots/");
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub	
	}

}
