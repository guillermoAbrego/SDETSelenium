package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage extends BasePage {

	private By dashboardHeading = By.xpath("//h1[contains(text(), 'Dashboard')]");
	private By dashboardTab = By.cssSelector("#menu_dashboard_index");

	public DashboardPage(WebDriver driver) {
		super(driver);
	}

	public void clickDashboardTab() {
		find(dashboardTab).click();
	}
	
	public String getDashboardHeading() {
		System.out.println("Dashboard heading is: " + getElementText(dashboardHeading));
		return getElementText(dashboardHeading);
	}

}
