package base;

import pages.DashboardPage;
import pages.LoginPage;
import pages.PIMPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseTest {
	
	private WebDriver driver;
	private final String url = "https://opensource-demo.orangehrmlive.com/";
	protected LoginPage loginPage;
	protected DashboardPage dashboardPage;
	protected PIMPage pimPage;
	
	public WebDriver getDriver() {
		return driver;
	}
	
	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		loginPage = new LoginPage(driver);
		dashboardPage = new DashboardPage(driver);
		pimPage = new PIMPage(driver);
	}
	
	@AfterClass
	public void tear() {
		driver.close();
	}
}
