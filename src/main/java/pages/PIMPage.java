package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PIMPage extends BasePage{
	
	private By employeeNameField = By.id("empsearch_employee_name_empName");
	private By searchButton = By.id("searchBtn");
	private By results = By.cssSelector("#resultTable tbody > tr");
	private WebDriverWait wait = new WebDriverWait(driver, 20);;

	public PIMPage(WebDriver driver) {
		super(driver);
	}
	
	public void searchUser(String searchKeyword) {
		WebElement nameField = find(employeeNameField);
		wait.until(ExpectedConditions.attributeContains(nameField, "class", "ac_input inputFormatHint"));
		type(searchKeyword, employeeNameField);
		click(searchButton);
	}
	
	public int countSearchResult() {
		int resultsSize = driver.findElements(results).size();
		System.out.println("Debug results size:" + resultsSize);
		return resultsSize;
	}
	

}
