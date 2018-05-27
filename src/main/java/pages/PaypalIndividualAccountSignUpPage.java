package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class PaypalIndividualAccountSignUpPage extends ProjectMethods {

	public PaypalIndividualAccountSignUpPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "country")
	WebElement eleCountry;

	public PaypalIndividualAccountSignUpPage verifyCountry(String data) {
		selectDropDownUsingText(eleCountry, data);
		return this;

	}
	
	@FindBy(how = How.ID, using = "email")
	WebElement eleEmail;

	public PaypalIndividualAccountSignUpPage typeEmail(String data) {
		type(eleEmail, data);
		return this;

	}
	
	@FindBy(how = How.ID, using = "password")
	WebElement elePassword;

	public PaypalIndividualAccountSignUpPage typePassword(String data) {
		type(elePassword, data);
		return this;

	}
	
	@FindBy(how = How.ID, using = "confirmPassword")
	WebElement eleConfirmPassword;

	public PaypalIndividualAccountSignUpPage typeConfirmPassword(String data) {
		type(eleConfirmPassword, data);
		return this;

	}

	@FindBy(how = How.ID, using = "_eventId_personal")
	WebElement eleClickContinue;

	public PaypalIndividualAccountSignUpPage clickContinueButton() {
		click(eleClickContinue);
		return this;

	}
}
