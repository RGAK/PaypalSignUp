package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class PaypalSignUpPage extends ProjectMethods {

	public PaypalSignUpPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "ctaId")
	WebElement eleSignUP;

	public PaypalAccountSelectionPage signUpPayPal() {
		click(eleSignUP);
		return new PaypalAccountSelectionPage();
	}

}
