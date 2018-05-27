package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods {

	public CreateLeadPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "createLeadForm_companyName")
	private WebElement eleCompanyName;

	public CreateLeadPage typeCompanyName(String data) {
		// WebElement eleLogin = locateElement("class","decorativeSubmit");
		type(eleCompanyName, data);
		return this;
	}

	@FindBy(how = How.ID, using = "createLeadForm_firstName")
	private WebElement eleFirstName;

	public CreateLeadPage typeFirstName(String data) {
		type(eleFirstName, data);
		return this;
	}

	@FindBy(how = How.ID, using = "createLeadForm_lastName")
	private WebElement eleLastName;

	public CreateLeadPage typeLastName(String data) {
		type(eleLastName, data);
		return this;
	}

	@FindBy(how = How.ID, using = "createLeadForm_firstNameLocal")
	WebElement eleLocalFirstName;

	public CreateLeadPage typeLocalFirstName(String data) {
		type(eleLocalFirstName, data);
		return this;

	}
	
	@FindBy(how = How.ID, using = "createLeadForm_lastNameLocal")
	WebElement eleLocalLastName;
	
	public CreateLeadPage typeLocalLastName(String data) {
		type(eleLocalLastName, data);
		return this;
	}
	
	@FindBy(how = How.ID, using = "createLeadForm_personalTitle")
	WebElement elePersonalTitle;
	
	public CreateLeadPage typePersonalTitle(String data) {
		type(elePersonalTitle, data);
		return this;
	}
	
	@FindBy(how = How.ID, using = "createLeadForm_dataSourceId")
	WebElement eleDataSourceID;
	
	public CreateLeadPage selectDataSourceID(String value) {
		selectDropDownUsingText(eleDataSourceID, value);
		return this;
	}
	
	@FindBy(how = How.ID, using = "createLeadForm_generalProfTitle")
	WebElement eleGeneralProfTitle;
	
	public CreateLeadPage typeGeneralProfTitle(String data) {
		type(eleGeneralProfTitle, data);
		return this;
	}

	@FindBy(how = How.ID, using = "createLeadForm_annualRevenue")
	WebElement eleAnnualRevenue;
	
	public CreateLeadPage typeAnnualRevenue(String data) {
		type(eleAnnualRevenue, data);
		return this;
	}

	@FindBy(how = How.ID, using = "createLeadForm_industryEnumId")
	WebElement eleIndustryEnumID;
	
	public CreateLeadPage selectIndustryEnumID(String value) {
		selectDropDownUsingText(eleIndustryEnumID, value);
		return this;
	}
	
	@FindBy(how = How.ID, using = "createLeadForm_ownershipEnumId")
	private WebElement eleOwnershipEnumID;

	public CreateLeadPage selectOwnershipEnumID(String value) {
		selectDropDownUsingText(eleOwnershipEnumID, value);
		return this;
	}
	
	@FindBy(how = How.ID, using = "createLeadForm_sicCode")
	private WebElement eleSIcCode;

	public CreateLeadPage typeSIcCode(String data) {
		type(eleSIcCode, data);
		return this;
	}
	
	@FindBy(how = How.ID, using = "createLeadForm_description")
	private WebElement eleDescription;

	public CreateLeadPage typeDescription(String data) {
		type(eleDescription, data);
		return this;
	}
	
	@FindBy(how = How.ID, using = "createLeadForm_importantNote")
	private WebElement eleImportantNote;

	public CreateLeadPage typeImportantNote(String data) {
		type(eleImportantNote, data);
		return this;
	}

	@FindBy(how = How.ID, using = "createLeadForm_primaryPhoneCountryCode")
	private WebElement elePhoneNumberCode;

	public CreateLeadPage typePhoneNumberCode(String data) {
		type(elePhoneNumberCode, data);
		return this;
	}
	
	@FindBy(how = How.ID, using = "createLeadForm_primaryPhoneAreaCode")
	private WebElement elePhoneAreaCode;

	public CreateLeadPage typePhoneAreaCode(String data) {
		type(elePhoneAreaCode, data);
		return this;
	}
	
	@FindBy(how = How.ID, using = "createLeadForm_primaryPhoneExtension")
	private WebElement elePhoneExtension;

	public CreateLeadPage typePhoneExtension(String data) {
		type(elePhoneExtension, data);
		return this;
	}
	
	@FindBy(how = How.ID, using = "createLeadForm_departmentName")
	private WebElement eleDepartmentName;

	public CreateLeadPage typeDepartmentName(String data) {
		type(eleDepartmentName, data);
		return this;
	}
	
	@FindBy(how = How.ID, using = "createLeadForm_currencyUomId")
	private WebElement eleCurrency;

	public CreateLeadPage selectCurrency(String value) {
		selectDropDownUsingText(eleCurrency, value);
		return this;
	}
	
	@FindBy(how = How.ID, using = "createLeadForm_numberEmployees")
	private WebElement eleTotalEmployees;

	public CreateLeadPage typeTotalEmployees(String data) {
		type(eleTotalEmployees, data);
		return this;
	}
	
	@FindBy(how = How.ID, using = "createLeadForm_tickerSymbol")
	private WebElement eleTicketSymbol;

	public CreateLeadPage typeTicketSymbol(String data) {
		type(eleTicketSymbol, data);
		return this;
	}
	
	@FindBy(how = How.ID, using = "createLeadForm_primaryPhoneAskForName")
	private WebElement elePhoneAskForMe;

	public CreateLeadPage typePhoneAskForMe(String data) {
		type(elePhoneAskForMe, data);
		return this;
	}
	
	@FindBy(how = How.ID, using = "createLeadForm_primaryWebUrl")
	private WebElement eleWebURL;

	public CreateLeadPage typeWebURL(String data) {
		type(eleWebURL, data);
		return this;
	}
	
	@FindBy(how = How.ID, using = "createLeadForm_generalToName")
	private WebElement eleGeneralToName;

	public CreateLeadPage typeGeneralToName(String data) {
		type(eleGeneralToName, data);
		return this;
	}
	
	@FindBy(how = How.ID, using = "createLeadForm_generalAddress1")
	private WebElement eleAddress1;

	public CreateLeadPage typeAddress1(String data) {
		type(eleAddress1, data);
		return this;
	}
	
	@FindBy(how = How.ID, using = "createLeadForm_generalAddress2")
	private WebElement eleAddress2;

	public CreateLeadPage typeAddress2(String data) {
		type(eleAddress2, data);
		return this;
	}
	
	@FindBy(how = How.ID, using = "createLeadForm_generalCity")
	private WebElement eleCity;

	public CreateLeadPage typeCity(String data) {
		type(eleCity, data);
		return this;
	}
	
	@FindBy(how = How.ID, using = "createLeadForm_generalCountryGeoId")
	private WebElement eleCountry;

	public CreateLeadPage selectCountry(String value) {
		selectDropDownUsingText(eleCountry, value);
		eleCountry.sendKeys(Keys.TAB);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		}
		return this;
	}
	
	@FindBy(how = How.ID, using = "createLeadForm_generalStateProvinceGeoId")
	private WebElement eleState;

	public CreateLeadPage selectState(String value) {
		selectDropDownUsingText(eleState, value);
		return this;
	}
	
	@FindBy(how = How.ID, using = "createLeadForm_generalPostalCode")
	private WebElement elePostalCode;

	public CreateLeadPage typePostalCode(String data) {
		type(elePostalCode, data);
		return this;
	}
	
	@FindBy(how = How.ID, using = "createLeadForm_generalPostalCodeExt")
	private WebElement elePostalCodeExtension;

	public CreateLeadPage typePostalCodeExtension(String data) {
		type(elePostalCodeExtension, data);
		return this;
	}
	
	@FindBy(how = How.ID, using = "createLeadForm_marketingCampaignId")
	private WebElement eleMarketingCampaignID;

	public CreateLeadPage selectMarketingCampaignID(String value) {
		selectDropDownUsingText(eleMarketingCampaignID, value);
		return this;
	}
	
	@FindBy(how = How.ID, using = "createLeadForm_primaryPhoneNumber")
	private WebElement elePhoneNumber;

	public CreateLeadPage typePhoneNumber(String data) {
		type(elePhoneNumber, data);
		return this;
	}

	@FindBy(how = How.ID, using = "createLeadForm_primaryEmail")
	private WebElement eleEmail;

	public CreateLeadPage typeEmail(String data) {
		type(eleEmail, data);
		return this;
	}
	
	@FindBy(how = How.CLASS_NAME, using = "smallSubmit")
	private WebElement elecreateLeadButton;

	public ViewLeadPage clickcreateLeadButton() {
		click(elecreateLeadButton);
		return new ViewLeadPage();

	}

}
