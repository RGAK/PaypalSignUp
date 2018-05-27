package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods {

	public ViewLeadPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "viewLead_firstName_sp")
	private WebElement eleViewfirstName;

	public MyLeadsPage verifyFirstName(String data) {
		verifyExactText(eleViewfirstName, data);
		return new MyLeadsPage();
	}
	
}
