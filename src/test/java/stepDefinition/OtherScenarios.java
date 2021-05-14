package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OtherScenarios {
	
	WebDriver driver;
	
	@Given("^I am in orangeHRP$")
	public void i_am_in_orangehrp() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.id("logInPanelHeading")).isDisplayed();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.xpath("//*[contains(text(), 'Dashboard')]")).isDisplayed();
	}
	
	@When("^Click on Admin tab$")
	public void click_on_Admin_tab() throws Throwable {
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
	}

	@Then("^I see System Users page heading$")
	public void i_see_System_Users_page_heading() throws Throwable {
	    driver.findElement(By.xpath("//*[contains(text(), 'System Users')]")).isDisplayed();
	}

	@When("^Click on PIM tab$")
	public void click_on_PIM_tab() throws Throwable {
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
	}

	@Then("^I see Employee Information page heading$")
	public void i_see_Employee_Information_page_heading() throws Throwable {
		driver.findElement(By.xpath("//h1[contains(text(), 'Employee Information')]")).isDisplayed();
	}

	@When("^Click on Leave tab$")
	public void click_on_Leave_tab() throws Throwable {
		driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
	}

	@Then("^I see Leave List page heading$")
	public void i_see_Leave_List_page_heading() throws Throwable {
		driver.findElement(By.xpath("//h1[contains(text(), 'Leave List')]")).isDisplayed();
	}

	@When("^Click on Time tab$")
	public void click_on_Time_tab() throws Throwable {
		driver.findElement(By.id("menu_time_viewTimeModule")).click();
	}

	@Then("^I see Select Employee page heading$")
	public void i_see_Select_Employee_page_heading() throws Throwable {
		driver.findElement(By.xpath("//h1[contains(text(), 'Select Employee')]")).isDisplayed();
	}
}
