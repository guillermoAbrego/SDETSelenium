package seleniumTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SeleniumPlusTestNgTests {

	WebDriver driver;
	WebDriverWait wait;
	
	By txtUsername = By.cssSelector("#txtUsername");
	By txtPassword = By.cssSelector("#txtPassword");
	By btnLogin = By.cssSelector("#btnLogin");
	By adminTab = By.cssSelector("#menu_admin_viewAdminModule");
	By pimTab = By.cssSelector("#menu_pim_viewPimModule");
	By leaveTab = By.cssSelector("#menu_leave_viewLeaveModule");
	By dashboardTab = By.cssSelector("#menu_dashboard_index");
	By directoryTab = By.cssSelector("#menu_directory_viewDirectory");
	By maintenanceTab = By.cssSelector("#menu_maintenance_purgeEmployee");
	
	@BeforeSuite
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 10);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}
	
	@Test(priority = 1)
	public void login() {
		driver.findElement(txtUsername).sendKeys("Admin");
		driver.findElement(txtPassword).sendKeys("admin123");
		driver.findElement(btnLogin).click();
	}
	
	@Test(dataProvider = "optionsProvider", priority = 2)
	public void printPageTitle(String option, By locator) {
		driver.findElement(locator).click();
		System.out.println("Page title for " + option + "tab: " + driver.getTitle());
	}
	
	@DataProvider(name = "optionsProvider")
	public Object[][] provider() {
		return new Object[][] {
			{"Admin", adminTab}, 
			{"PIM", pimTab},
			{"Leave", leaveTab},
			{"Dashboard", dashboardTab},
			{"Directory", directoryTab},
			{"Maintenance", maintenanceTab}
			};
	}
	
	public void minimizeWindow() {
		driver.manage().window().setPosition(new Point(-2000, 0));
	}
	
	@AfterSuite
	public void tear() {
		minimizeWindow();
		driver.close();
	}
}
