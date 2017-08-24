package PageLibrary;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIn {
	static Logger log=Logger.getLogger(SignIn.class.getName());
	WebDriver driver;
	

	By SigninButton= By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a");
	By creatAccEmailAddr=By.xpath(".//*[@id='email_create']");
	By AlrdyEmailAcc=By.xpath(".//*[@id='email']");
	By AlrdyPassAc=By.xpath(".//*[@id='passwd']");
	By SigninAccButton=By.xpath(".//*[@id='SubmitLogin']");
	By CrateAnAccountButton=By.id("SubmitCreate");
	By SignOutBuuton=By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[2]/a");
	By WishList=By.xpath(".//*[@id='center_column']/div/div[2]/ul/li/a/span");

	/*WebElement SigninButton= driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a"));
	WebElement creatAccEmailAddr=driver.findElement(By.xpath(".//*[@id='email_create']"));
	WebElement AlrdyEmailAcc=driver.findElement(By.xpath(".//*[@id='email"));
	WebElement AlrdyPassAc=driver.findElement(By.xpath(".//*[@id='passwd']"));
	WebElement SigninAccButton=driver.findElement(By.xpath(".//*[@id='SubmitLogin']"));*/
	
	

	/*public SignIn(WebDriver driver){
		this.driver=driver;
	}*/
	
	public SignIn(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	/**
	 * This method is use for clck the signIn Button
	 */
	public void SignInbutton(){
		log.info("clicking in signing link");
	driver.findElement(SigninButton).click();
	}
	
	/**
	 * This method is use to pass email address to create account
	 * @param emailAddress
	 */
	public void enterEmailAddressTocreateAccount(String emailAddress){
		log.info("Enter emailAddress to create Account");
		//creatAccEmailAddr.sendKeys(emailAddress);
		driver.findElement(creatAccEmailAddr).sendKeys(emailAddress);
	}
	public void enterAllreadtcreatedEmailToLogin(String emailAddress){
		log.info("Entering emailaddress to signIn in Application");
	//	AlrdyEmailAcc.sendKeys(emailAddress);
		driver.findElement(AlrdyEmailAcc).sendKeys(emailAddress);
	}
			
	public void enterAllreadtcreatedPwdToLogin(String Password){
		log.info("Entering Password to signIn in Application");
	//AlrdyPassAc.sendKeys(Password);
	
	driver.findElement(AlrdyPassAc).sendKeys(Password);
	}
	
	public void clickOnSignInbutton(){
		log.info("Clicking on submit Button");
		//SigninAccButton.click();
		driver.findElement(SigninAccButton).click();
	}

	public void CrteateAnAccountButton() {
		log.info("clicking on Account button ");
		driver.findElement(CrateAnAccountButton).click();
	}
	public void signoutButton() {
		log.info("clicking on SinOut Button ");
		driver.findElement(SignOutBuuton).click();
	}
	public  boolean verifyWishListText() {
		try {
			driver.findElement(WishList).isDisplayed();
			return true;
		}catch(Exception e) {
			return false;
		}
	}
}

	
	/*WebElement SigninButton= driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a"));
	WebElement creatAccEmailAddr=driver.findElement(By.xpath(".//*[@id='email_create']"));
	WebElement AlrdyEmailAcc=driver.findElement(By.xpath(".//*[@id='email"));
	WebElement AlrdyPassAc=driver.findElement(By.xpath(".//*[@id='passwd']"));
	WebElement SigninAccButton=driver.findElement(By.xpath(".//*[@id='SubmitLogin']"));
	
	

	public SignIn(WebDriver driver){
		this.driver=driver;
	}
	
	public SignIn(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	*//**
	 * This method is use for clck the signIn Button
	 *//*
	public void SignInbutton(){
		log.info("clicking in signing link");
		SigninButton.click();
	}
	
	*//**
	 * This metthod is use to pass email address to create account
	 * @param emailAddress
	 *//*
	public void enterEmailAddressTocreateAccount(String emailAddress){
		log.info("Enter emailAddress to create Account");
		creatAccEmailAddr.sendKeys(emailAddress);
	}
	public void enterAllreadtcreatedEmailToLogin(String emailAddress){
		log.info("Enter emailaddress to signIn in Application");
		AlrdyEmailAcc.sendKeys(emailAddress);
	}
			
	public void enterAllreadtcreatedPwdToLogin(String Password){
		log.info("Enter Password to signIn in Application");
	AlrdyPassAc.sendKeys(Password);
	}
	
	public void clickOnSignInbutton(){
		log.info("Click on submit Button");
		SigninAccButton.click();
	}
*/

