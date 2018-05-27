package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


import wdMethods.ProjectMethods;

public class MergeLeadsPage extends ProjectMethods {

	public MergeLeadsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "(//img[@alt = 'Lookup'])[1]")
	private WebElement eleFromLeadSearch;

	public MergeLeadsPage clickFromLeadSearch() {
		click(eleFromLeadSearch);
		return this;
	}
	
	public FindLeadsPage switchFocusToFromLeadsWindow() {
		switchToWindow(1);
		return new FindLeadsPage();
	}
	
	public MergeLeadsPage switchFocusBackToMainWindow() {
		switchToWindow(0);
		return this;
	}
	
	@FindBy(how = How.XPATH, using = "(//img[@alt = 'Lookup'])[2]")
	private WebElement eleToLeadSearch;

	public MergeLeadsPage clickToLeadSearch() {
		click(eleToLeadSearch);
		return this;
	}
	
	@FindBy(how = How.LINK_TEXT, using = "Merge")
	WebElement eleMergeButton;
	
	public MergeLeadsPage clickMergeButton() {
		clickWithNoSnap(eleMergeButton);
		return this;
	}
	
	public ViewLeadPage switchFocusToAlert() {
		driver.switchTo().alert().accept();
		return new ViewLeadPage();
	}
	
	
	
	
}
