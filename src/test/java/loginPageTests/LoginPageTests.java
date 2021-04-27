package loginPageTests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LoginPageTests {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		//css Locators
		By txtUsername = By.cssSelector("#txtUsername");
		By txtPassword = By.cssSelector("#txtPassword");
		By btnLogin = By.cssSelector("#btnLogin");
		By mainImage = By.cssSelector("#divLogo > img");
		By adminTab = By.id("menu_admin_viewAdminModule");
		By userManagementTab = By.id("menu_admin_UserManagement");
		By jobTab = By.id("menu_admin_Job");
		By organizationTab = By.id("menu_admin_Organization");
		By qualificationsTab = By.id("menu_admin_Qualifications");
	
		//xpath locators
		By txtUsernameX = By.xpath("//*[@id='txtUsername']");
		By txtPasswordX = By.xpath("//*[@id='txtPassword']");
		By btnLoginX = By.xpath("//*[@id='btnLogin']");
		By mainImageX = By.xpath("//*[@id='divLogo']/img");
		
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		System.out.println("Page title: " + driver.getTitle());
		
		//Logging in
		driver.findElement(txtUsername).sendKeys("Admin");
		driver.findElement(txtPassword).sendKeys("admin123");
		driver.findElement(btnLogin).click();
		
		//Clicking on 'Admin' tab
		driver.findElement(adminTab).click();
		
		//Extracting tabs text
		ArrayList<String> adminOptions = new ArrayList<String>();
		adminOptions.add(driver.findElement(userManagementTab).getText());
		adminOptions.add(driver.findElement(jobTab).getText());
		adminOptions.add(driver.findElement(organizationTab).getText());
		adminOptions.add(driver.findElement(qualificationsTab).getText());
		
		List<String> a = Arrays.asList("User Management" ,"Job", "Organization", "Qualifications");
		
		//Validating tabs
		Assert.assertEquals(adminOptions, a);
		String msg = (adminOptions.equals(a)) ? "Admin options match" : "Admin options do NOT match";
		System.out.println(msg);
		
		driver.close();

	}

}
