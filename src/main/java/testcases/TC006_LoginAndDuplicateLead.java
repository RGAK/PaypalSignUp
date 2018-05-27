package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import pages.FindLeadsPage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC006_LoginAndDuplicateLead extends ProjectMethods {

	@BeforeTest
	public void setData() {
		testCaseName="TC006_LoginAndDuplicateLead";
		testDescription="login and Duplicate Leads in LeafTaps Application";
		testNodes="Leads";
		category="Sanity";
		authors="Arun";
		browserName="chrome";
		dataSheetName="TC006";
	}
	@Test(dataProvider="fetchData")
	public void loginAndEditLead(String uName,String pwd, String email, String pageTitle) {
		
		FindLeadsPage flp = new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeadsMenu()
		.clickFindLeads()
		.clickEmailSection()
		.typeEmailAddress(email)
		.clickFindLeadsButton()
		.clickFirstLead();
		String firstNameText = flp.getFirstNameText();
		flp.clickDuplicateLeadButton()
		.verifyPageTitle(pageTitle)
		.clickcreateLeadButton()
		.verifyFirstName(firstNameText);
	}

}
