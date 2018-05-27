package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class PaypalAccountSelectionPage extends ProjectMethods {
	
	public PaypalAccountSelectionPage() {
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "radio-personal")
	WebElement eleForShoppers;

	public PaypalAccountSelectionPage verifyAndClickForShoppersOption() {
		boolean radioButtonSelected = verifySelected(eleForShoppers);
		if(!radioButtonSelected)
			click(eleForShoppers);
		return this;
	}
	
	@FindBy(how = How.LINK_TEXT, using = "Next")
	WebElement eleNextButton;
	
	public PaypalIndividualAccountSignUpPage clickNextButton() {
		click(eleNextButton);
		return new PaypalIndividualAccountSignUpPage();
	}

}
