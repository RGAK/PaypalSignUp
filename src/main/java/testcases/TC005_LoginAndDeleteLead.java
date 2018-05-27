package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import pages.FindLeadsPage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_LoginAndDeleteLead extends ProjectMethods {

	@BeforeTest
	public void setData() {
		testCaseName="TC005_LoginAndDeleteLead";
		testDescription="login and Delete Leads in LeafTaps Application";
		testNodes="Leads";
		category="Regression";
		authors="Arun";
		browserName="chrome";
		dataSheetName="TC005";
	}
	
	@Test(dataProvider="fetchData")
	public void loginAndDeleteLead(String uName, String pwd, String phNumber, String errmsg) {
		
		FindLeadsPage flp = new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeadsMenu()
		.clickFindLeads()
		.clickPhoneSection()
		.typePhoneNumber(phNumber)
		.clickFindLeadsButton();
		String firstLeadText = flp.getFirstLeadText();
		flp.clickFirstLead()
		.clickDeleteLeadButton()
		.clickFindLeads()
		.clickNameAndIdSection();
		flp.typeTypeLeadId(firstLeadText)
		.clickFindLeadsButton()
		.verifyNoRecordText(errmsg);
	}
}
