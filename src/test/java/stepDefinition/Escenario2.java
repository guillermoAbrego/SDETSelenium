package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Escenario2 {
	
	WebDriver driver;
	
	@Given("^On home page of application$")
	
	public void on_home_page_of_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.id("logInPanelHeading")).isDisplayed();
	}

	@When("^I enter credentials$")
	public void i_enter_credentials() throws Throwable {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	    driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^I should be successfully logged in$")
	public void i_should_be_successfully_logged_in() throws Throwable {
		driver.findElement(By.xpath("//*[contains(text(), 'Dashboard')]")).isDisplayed();
	}

	@When("^I click on Admin link$")
	public void i_click_on_Admin_link() throws Throwable {
		driver.findElement(By.xpath("//*[contains(text(), 'Admin')]")).click();
	}

	@Then("^Click on Job$")
	public void click_on_Job() throws Throwable {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.id("menu_admin_Job"))).build().perform();
	}

	@Then("^Validate text in Job title$")
	public void validate_text_in_Job_title() throws Throwable {
		String actualText = driver.findElement(By.id("menu_admin_viewJobTitleList")).getText();
		Assert.assertEquals(actualText, "Job Titles");
	}
}
