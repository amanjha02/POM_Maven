package PageLibrary;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class createAnAccount {

	WebDriver driver;

	static Logger log = Logger.getLogger(createAnAccount.class.getName());

	By mrRadioButton = By.xpath(".//*[@id='id_gender1']");
	By mrsRadioButton = By.xpath(".//*[@id='id_gender2']");
	By createAnAccount = By.xpath(".//*[@id='noSlide']/h1");
	By presonalInfo = By.xpath(".//*[@id='account-creation_form']/div[1]/h3");
	By firstName = By.xpath(".//*[@id='customer_firstname']");
	By lastName = By.xpath(".//*[@id='customer_lastname']");
	By password = By.xpath(".//*[@id='passwd']");
	By emailId = By.xpath(".//*[@id='email']");
	By days = By.xpath(".//*[@id='days']");
	By months = By.xpath(".//*[@id='months']");
	By years = By.xpath(".//*[@id='years']");
	By optionForSignup = By.xpath(".//*[@id='newsletter']");
	By optionForRecievespecialoffer = By.xpath(".//*[@id='optin']");

	By AddrFirstname = By.xpath(".//*[@id='firstname']");
	By addLastName = By.xpath(".//*[@id='lastname']");
	By addcompanyName = By.xpath(".//*[@id='company']");
	By address1 = By.xpath(".//*[@id='address1']");
	By address2 = By.xpath(".//*[@id='address2']");
	By city = By.xpath(".//*[@id='city']");
	By addresspostalcode = By.xpath(".//*[@id='postcode']");
	By additionalInformation=By.xpath(".//*[@id='other']");
	By homePhone = By.xpath(".//*[@id='phone']");
	By mobilePhone = By.xpath(".//*[@id='phone_mobile']");
	By assignAddressforFutureRef = By.xpath(".//*[@id='alias']");
	By registerButton = By.xpath(".//*[@id='submitAccount']");

	public void selectMrRadioButton() {
		log.info("Selecting Mr Radio button");
		driver.findElement(mrRadioButton).click();
	}

	public void selectMrsRadioButton() {
		log.info("Selecting Mrs Radio button");
		driver.findElement(mrsRadioButton).click();
	
	}

	public boolean verifyCreateMyAccountlabel() {
		log.info("verifying CreateAnAccount label");
		try {
			//createAnAccount.isDisplayed();
			driver.findElement(createAnAccount).isDisplayed();
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public boolean presonalInfoLabel() {
		log.info("verifying Presonal info labe label");
		try {
			driver.findElement(presonalInfo).isDisplayed();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void enterFirstname(String firstName) {
		log.info("enter first name");
		driver.findElement(this.firstName).sendKeys(firstName);

	}

	public void enterLastName(String lastName) {
		log.info("Enter last name");
		driver.findElement(this.lastName).sendKeys(lastName);
	}

	public void enterEmailAddress(String emailId) {
		log.info("Enter email address");
		driver.findElement(this.emailId).sendKeys(emailId);
	}

	public void enterPassword(String password) {
		log.info("Enter  Password");
		driver.findElement(this.password).sendKeys(password);
	}

	public void selectDay(String day) {
		// .//*[@id='days']/option[9]
		String day1 = ".//*[@id='days']/option[";
		String day2 = "]";
		log.info("clicking on day Dropdown");

		driver.findElement(By.xpath(day1 + day + day2)).click();

	}

	public void selectMonthInMonthDropdown(String month) {
		log.info("clicking on month dropdown");
		List<WebElement> monthsvariable = driver.findElements(By.xpath(".//*[@id='months']/option"));
		for (WebElement months : monthsvariable) {
			if (months.getText().contains(month)) {
				log.info("month is selecting and click on that");
				months.click();
			}
		}
	}

	public void selectYears(String year) {
		log.info("Selecting Year from year dropdown");
		List<WebElement> yearsvaraible = driver.findElements(By.xpath(".//*[@id='years']/option"));
		for (WebElement years : yearsvaraible) {
			if (years.getText().contains(year)) {
				log.info("selcting the years");
				years.click();
			}
		}
	}

	public void checkOptionForSignup() {
		log.info("checking option for option for chechbox");
		driver.findElement(optionForSignup).click();
	}

	public void checkrRecieveSpecialOffer() {
		log.info("Checking Receive for special offer checkbox");
		driver.findElement(optionForRecievespecialoffer).click();
	}

	public void enterAddressFirstname(String firstname) {
		log.info("Entering Address first Name");
		driver.findElement(AddrFirstname).sendKeys(firstname);
	}
	
	public void enterAddresslastName(String lastname) {
		log.info("Entering Address last Name");
		driver.findElement(addLastName).sendKeys(lastname);
	}
	
	public void entercompanyName(String companyName) {
		log.info("Entering company Name");
		driver.findElement(addcompanyName).sendKeys(companyName);
	}
	
	public void enterAdderess1(String Address1){
		log.info("Entering address1 ");
		driver.findElement(address1).sendKeys(Address1);
	}
	
	public void enterAdderess2(String Address2){
		log.info("Entering address2 ");
		driver.findElement(address2).sendKeys(Address2);
	}
	
	public void enterCity(String city){
		log.info("Entering city Address");
		driver.findElement(this.city).sendKeys(city);
	}
	
	public void enterState(String State){
		log.info("enteing state");
	List<WebElement> statesvairable=driver.findElements(By.xpath(".//*[@id='id_state']/option"));
	for(WebElement states:statesvairable){
		if(states.getText().contains(State)){
			log.info("state is selecting");
			states.click();
		}
	}
		
	}

	public void enterPostalCode(String Postalcode){
		log.info("Entering postal code");
		driver.findElement(addresspostalcode).sendKeys(Postalcode);
	}
	 public void enterAdditionalInformation(String additionalInformation){
		 log.info("entering Addtional Information");
			driver.findElement(this.additionalInformation).sendKeys(additionalInformation);
		 
	 }
	 public void enterHomephoneNumber(String Homephone){
		 log.info("Enter the HomePhone Number");
			driver.findElement(homePhone).sendKeys(Homephone);
	 }
	 
	 public void enterMobilephoneNumber(String MobilePhone){
		 log.info("Enter the MobilePhone Number");
			driver.findElement(mobilePhone).sendKeys(MobilePhone);
	 }
	 
	 public void enterAddressForAlias(String addressForAlias){
		 log.info("Entering alias Address");
			driver.findElement(assignAddressforFutureRef).sendKeys(addressForAlias);
		 
	 }
	 public void clickOnRegisterButton(){
		 log.info("Clicking on register Button");
			driver.findElement(registerButton).click();
	 }

}
