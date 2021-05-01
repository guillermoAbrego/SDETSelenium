package seleniumTestNG;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BaseTest;

@Listeners(listeners.TestListenerDemo.class)

public class SearchUserTests extends BaseTest{
	
	public void login() {
		loginPage.setUserName("Admin");
		loginPage.setPassword("admin123");
		loginPage.clickLoginButton();
	}
	
	@Test()
	public void searchUser() {
		login();
		dashboardPage.clickPIMTab();
		pimPage.searchUser("Linda Anderson");
		int result = pimPage.countSearchResult();
		Assert.assertEquals(result, 1);
	}

}
