package pages;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods {

	public FindLeadsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//span[@class = 'x-tab-strip-text ']")
	private WebElement eleNameAndIdSection;

	public FindLeadsPage clickNameAndIdSection() {
		click(eleNameAndIdSection);
		return this;
	}

	@FindBy(how = How.XPATH, using = "//input[@name ='id']")
	private WebElement eleTypeLeadId;

	public FindLeadsPage typeTypeLeadId(String data) {
		type(eleTypeLeadId, data);
		return this;
	}
	
	@FindBy(how = How.XPATH, using = "(//input[@name = 'firstName'])[3]")
	private WebElement eleFirstName;

	public FindLeadsPage typeFirstName(String data) {
		type(eleFirstName, data);
		return this;
	}
	
	@FindBy(how = How.XPATH, using = "//input[@name = 'firstName']")
	private WebElement eleFirstNameForMerge;

	public FindLeadsPage typeFirstNameForMerge(String data) {
		type(eleFirstNameForMerge, data);
		return this;
	}
	
	@FindBy(how = How.XPATH, using = "(//input[@name = 'lastName'])[3]")
	private WebElement eleLastName;

	public FindLeadsPage typeTypeLastName(String data) {
		type(eleLastName, data);
		return this;
	}
	
	@FindBy(how = How.XPATH, using = "//input[@name = 'lastName']")
	private WebElement eleLastNameForMerge;

	public FindLeadsPage typeLastNameForMerge(String data) {
		type(eleLastNameForMerge, data);
		return this;
	}
	
	@FindBy(how = How.XPATH, using = "(//input[@name = 'companyName'])[2]")
	private WebElement eleCompanyName;

	public FindLeadsPage typeCompanyName(String data) {
		type(eleCompanyName, data);
		return this;
	}
	
	@FindBy(how = How.XPATH, using = "//input[@name = 'companyName']")
	private WebElement eleCompanyNameForMerge;

	public FindLeadsPage typeCompanyNameForMerge(String data) {
		type(eleCompanyNameForMerge, data);
		return this;
	}

	@FindBy(how = How.XPATH, using = "(//span[@class = 'x-tab-strip-text '])[2]")
	private WebElement elePhoneSection;

	public FindLeadsPage clickPhoneSection() {
		click(elePhoneSection);
		return this;

	}

	@FindBy(how = How.XPATH, using = "//input[@name = 'phoneNumber']")
	private WebElement eleTypePhoneNumber;

	public FindLeadsPage typePhoneNumber(String data) {
		type(eleTypePhoneNumber, data);
		return this;
	}
	
	@FindBy(how = How.XPATH, using = "(//span[@class = 'x-tab-strip-text '])[3]")
	private WebElement eleEmailSection;

	public FindLeadsPage clickEmailSection() {
		click(eleEmailSection);
		return this;

	}

	@FindBy(how = How.XPATH, using = "//input[@name = 'emailAddress']")
	private WebElement eleTypeEmailAddress;

	public FindLeadsPage typeEmailAddress(String data) {
		type(eleTypeEmailAddress, data);
		return this;
	}

	@FindBy(how = How.XPATH, using = "//button[text() = 'Find Leads']")
	private WebElement eleFindLeadsButton;

	public FindLeadsPage clickFindLeadsButton() {
		click(eleFindLeadsButton);
		return this;

	}

	@FindBy(how = How.XPATH, using = "(//table[@class = 'x-grid3-row-table'])[1]//a")
	private WebElement eleFirstLead;

	public FindLeadsPage clickFirstLead() {
		clickWithNoSnap(eleFirstLead);
		return this;
	}
	
	@FindBy(how = How.XPATH, using = "(//table[@class = 'x-grid3-row-table'])[1]//a")
	private WebElement eleFirstLeadForMerge;

	public MergeLeadsPage clickFirstLeadForMerge() {
		clickWithNoSnap(eleFirstLeadForMerge);
		return new MergeLeadsPage();
	}
	
	@FindBy(how = How.XPATH, using = "(//table[@class = 'x-grid3-row-table'])[2]//a")
	private WebElement eleSecondLeadForMerge;

	public MergeLeadsPage clickSecondLeadForMerge() {
		clickWithNoSnap(eleSecondLeadForMerge);
		return new MergeLeadsPage();
	}
	
	@FindBy(how = How.XPATH, using = "(//table[@class = 'x-grid3-row-table'])[1]//a")
	private WebElement eleCaptureLeadIdText;

	public String getFirstLeadText() {
		return getText(eleCaptureLeadIdText);
	}
	
	public FindLeadsPage verifyPageTitle(String title) {
		verifyTitle(title);
		return this;
	}
	
	@FindBy(how = How.ID, using = "viewLead_firstName_sp")
	private WebElement eleCaptureFirstNameText;

	public String getFirstNameText() {
		return getText(eleCaptureFirstNameText);
	}


	@FindBy(how = How.LINK_TEXT, using = "Edit")
	WebElement eleEditLeadButton;

	public FindLeadsPage clickEditLeadButton() {
		click(eleEditLeadButton);
		return this;
	}
	
	@FindBy(how = How.LINK_TEXT, using = "Delete")
	WebElement eleDeleteLeadButton;

	public MyLeadsPage clickDeleteLeadButton() {
		click(eleDeleteLeadButton);
		return  new MyLeadsPage();
	}
	
	@FindBy(how = How.LINK_TEXT, using = "Duplicate Lead")
	WebElement eleDuplicateLeadButton;

	public FindLeadsPage clickDuplicateLeadButton() {
		click(eleDuplicateLeadButton);
		return  this;
	}
	
	@FindBy(how = How.CLASS_NAME, using = "smallSubmit")
	private WebElement elecreateLeadButton;

	public FindLeadsPage clickcreateLeadButton() {
		click(elecreateLeadButton);
		return this;

	}
	
	@FindBy(how = How.ID, using = "updateLeadForm_companyName")
	WebElement eleUpdateCompanyName;
	
	public FindLeadsPage editCompanyName(String data) {
		type(eleUpdateCompanyName, data);
		return this;
	}
	
	@FindBy(how = How.ID, using = "updateLeadForm_firstName")
	WebElement eleUpdateFirstName;
	
	public FindLeadsPage editFirstName(String data) {
		type(eleUpdateFirstName, data);
		return this;
	}
	
	@FindBy(how = How.ID, using = "updateLeadForm_lastName")
	WebElement eleUpdateLastName;
	
	public FindLeadsPage editLastName(String data) {
		type(eleUpdateLastName, data);
		return this;
	}
	
	@FindBy(how = How.XPATH, using = "//input[@value = 'Update']")
	WebElement eleClickUpdate;
	
	public FindLeadsPage clickUpdateButton() {
		click(eleClickUpdate);
		return this;
	}
	
	@FindBy(how = How.ID, using = "viewLead_companyName_sp")
	WebElement eleVerifyCompanyName;
	
	public FindLeadsPage verifyCompanyName(String data) {
		verifyPartialText(eleVerifyCompanyName, data);
		return this;
	}
	
	@FindBy(how = How.ID, using = "viewLead_lastName_sp")
	WebElement eleVerifyLastName;
	
	public FindLeadsPage verifyLastName(String data) {
		verifyExactText(eleVerifyLastName, data);
		return this;
	}
	
	@FindBy(how = How.ID, using = "viewLead_firstName_sp")
	WebElement eleVerifyFirstName;
	
	public FindLeadsPage verifyFirstName(String data) {
		verifyExactText(eleVerifyFirstName, data);
		return this;
	}
	
	@FindBy(how = How.XPATH, using = "//div[text() = 'No records to display']")
	WebElement eleVerifyNoRecordText;
	
	public FindLeadsPage verifyNoRecordText(String data) {
		verifyExactText(eleVerifyNoRecordText, data);
		return this;
	}
}
