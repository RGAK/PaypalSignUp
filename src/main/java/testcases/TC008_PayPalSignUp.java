package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;


import pages.PaypalSignUpPage;
import wdMethods.ProjectMethods;

public class TC008_PayPalSignUp extends ProjectMethods {

	@BeforeTest
	public void setData() {
		testCaseName="TC008_PayPalSignUp";
		testDescription="Sign Into PayPal Application";
		testNodes="SignUp";
		category="Sanity";
		authors="Sowndharya";
		browserName="chrome";
		dataSheetName="TC008";
	}
	@Test(dataProvider="fetchData")
	public void PaypalSignUp(String countryName, String email, String password, String confirmPassword) {

		new PaypalSignUpPage()
		.signUpPayPal()
		.verifyAndClickForShoppersOption()
		.clickNextButton()
		.verifyCountry(countryName)
		.typeEmail(email)
		.typePassword(password)
		.typeConfirmPassword(confirmPassword)
		.clickContinueButton();

	}

}
