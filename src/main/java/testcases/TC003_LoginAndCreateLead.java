package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_LoginAndCreateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC003_LoginAndCreateLead";
		testDescription="login and Create Leads in LeafTaps Application";
		testNodes="Leads";
		category="Smoke";
		authors="Sowndharya";
		browserName="chrome";
		dataSheetName="TC003";
	}
	@Test(dataProvider="fetchData", invocationCount = 2)
	public void loginAndCreateLeads(String uName,String pwd,String vName,String companyName, String firstName, String lastName, String localFirstName, String localLastName, String personalTitle, String sourceId, 
			String profTitle, String revenue, String industryEnumId, String ownershipEnumId, String sicCode, String description, String importantNote, String countryCode, String areaCode, String phoneExtension, 
			String departmentName, String currency, String noOfEmployees, String tickerSymbol, String askForMe, String webURL, String generalToName, String address1, String address2, String city, String country,
			String state, String postalCode, String extensionPO, String campaignId, String phoneNumber, String emailID) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.verifyLoggedName(vName)
		.clickCRMSFA()
		.clickLeadsMenu()
		.clickCreateLead()
		.typeCompanyName(companyName)
		.typeFirstName(firstName)
		.typeLastName(lastName)
		.typeLocalFirstName(localFirstName)
		.typeLocalLastName(localLastName)
		.typePersonalTitle(personalTitle)
		.selectDataSourceID(sourceId)
		.typeGeneralProfTitle(profTitle)
		.typeAnnualRevenue(revenue)
		.selectIndustryEnumID(industryEnumId)
		.selectOwnershipEnumID(ownershipEnumId)
		.typeSIcCode(sicCode)
		.typeDescription(description)
		.typeImportantNote(importantNote)
		.typePhoneNumberCode(countryCode)
		.typePhoneAreaCode(areaCode)
		.typePhoneExtension(phoneExtension)
		.typeDepartmentName(departmentName)
		.selectCurrency(currency)
		.typeTotalEmployees(noOfEmployees)
		.typeTicketSymbol(tickerSymbol)
		.typePhoneAskForMe(askForMe)
		.typeWebURL(webURL)
		.typeGeneralToName(generalToName)
		.typeAddress1(address1)
		.typeAddress2(address2)
		.typeCity(city)
		.selectCountry(country)
		.selectState(state)
		.typePostalCode(postalCode)
		.typePostalCodeExtension(extensionPO)
		.selectMarketingCampaignID(campaignId)
		.typePhoneNumber(phoneNumber)
		.typeEmail(emailID)
		.clickcreateLeadButton()
		.verifyFirstName(firstName);
	}

}
