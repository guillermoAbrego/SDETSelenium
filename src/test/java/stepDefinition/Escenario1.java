package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Escenario1 {
	
	WebDriver driver;
	
	@Given("^I am in orangeHRP Application$")
	public void i_am_in_orangeHRP_Application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.id("logInPanelHeading")).isDisplayed();
	}

	@When("^Login to Application$")
	public void login_to_Application() throws Throwable {
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	    driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^Dashboard page is available$")
	public void dashboard_page_is_available() throws Throwable {
	    driver.findElement(By.xpath("//*[contains(text(), 'Dashboard')]")).isDisplayed();
	}

	@And("^Click on Admin menu$")
	public void click_on_Admin_menu() throws Throwable {
		driver.findElement(By.xpath("//*[contains(text(), 'Admin')]")).click();
		Thread.sleep(2000);
	}

}
