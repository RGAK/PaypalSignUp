package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_LoginAndEditLead extends ProjectMethods {

	@BeforeTest
	public void setData() {
		testCaseName="TC004_LoginAndEditLead";
		testDescription="login and Edit Leads in LeafTaps Application";
		testNodes="Leads";
		category="Regression";
		authors="Arun";
		browserName="chrome";
		dataSheetName="TC004";
	}
	@Test(dataProvider="fetchData")
	public void loginAndEditLead(String uName,String pwd, String firstName, String pageTitle, String companyName, String verifyCompanyName) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeadsMenu()
		.clickFindLeads()
		.clickNameAndIdSection()
		.typeFirstName(firstName)
		.clickFindLeadsButton()
		.clickFirstLead()
		.verifyPageTitle(pageTitle)
		.clickEditLeadButton()
		.typeCompanyName(companyName)
		.clickUpdateButton()
		.verifyCompanyName(verifyCompanyName);		
		
	}

}
