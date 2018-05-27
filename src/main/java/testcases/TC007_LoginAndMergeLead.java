package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import pages.FindLeadsPage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC007_LoginAndMergeLead extends ProjectMethods {

	@BeforeTest
	public void setData() {
		testCaseName = "TC007_LoginAndMergeLead";
		testDescription = "login and Merge Leads in LeafTaps Application";
		testNodes = "Leads";
		category = "Regression";
		authors = "Arun";
		browserName = "chrome";
		dataSheetName = "TC007";
	}

	@Test(dataProvider="fetchData")
	public void loginAndMergeLead(String uName,String pwd, String firstName, String phoneNumber, String verifyFirstName, String errMsg) {

		FindLeadsPage flp = new LoginPage()
				.enterUserName(uName)
				.enterPassword(pwd)
				.clickLogIn()
				.clickCRMSFA()
				.clickLeadsMenu()
				.clickMergeLeads()
				.clickFromLeadSearch()
				.switchFocusToFromLeadsWindow()
				.typeFirstNameForMerge(firstName)
				.clickFindLeadsButton();
		String firstLeadText = flp.getFirstLeadText();
		flp.clickFirstLeadForMerge()
		.switchFocusBackToMainWindow()
		.clickToLeadSearch()
		.switchFocusToFromLeadsWindow()
		.clickPhoneSection()
		.typePhoneNumber(phoneNumber)
		.clickFindLeadsButton()
		.clickSecondLeadForMerge()
		.switchFocusBackToMainWindow()
		.clickMergeButton()
		.switchFocusToAlert()
		.verifyFirstName(verifyFirstName)
		.clickFindLeads()
		.typeTypeLeadId(firstLeadText)
		.clickFindLeadsButton()
		.verifyNoRecordText(errMsg);

	}

}
