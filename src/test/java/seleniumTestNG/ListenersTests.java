package seleniumTestNG;

import base.BaseTest;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.TestListenerDemo.class)

public class ListenersTests extends BaseTest {

	@Test(priority = 1, enabled = true)
	public void loginTest() {
		loginPage.setUserName("Admin");
		loginPage.setPassword("admin123");
		loginPage.clickLoginButton();
	}
	
	@Test(retryAnalyzer = listeners.RetryListenerDemo.class, priority = 2)
	public void getDashboardHeadingTest( ) {
		dashboardPage.clickDashboardTab();
		dashboardPage.getDashboardHeading();
		//Forces the test to fail thus triggers the retryAnalyzer
		Assert.assertEquals(dashboardPage.getDashboardHeading(), "Dshbrd");
	}
	
}
