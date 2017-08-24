package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageLibrary.SignIn;
import TestBase.TestBase;

public class Tc_0001Login extends TestBase {
SignIn signin;



/*@BeforeClass
public void Setup() throws IOException {
	 init();
	 signin=new SignIn(driver);
}*/
@Test

public void FirstTest(){
	System.out.println("First  tEst");
}

@Test

public void FirstTest1(){
	System.out.println("First  tEstcae1");
}

@Test

public void FirstTest2(){
	System.out.println("First  tEst case2");
}
 
/*public void Test1() throws InterruptedException {
	 
	 driver.get(prop.getProperty("url"));
	 Thread.sleep(2000);
	 signin.SignInbutton();
	 signin.enterAllreadtcreatedEmailToLogin("aman3423452@gmail.com");
	 signin.enterAllreadtcreatedPwdToLogin("aman123");
	 signin.clickOnSignInbutton();
	 signin.signoutButton();
	 signin.enterEmailAddressTocreateAccount("1234aman@gmail.com");
	 signin.CrteateAnAccountButton();
	 //Thread.sleep(5000);
	// signin.signoutButton();
}

public void VerifyUserLoginCredentialWithValidData() throws InterruptedException {
	 String ExpectedData="My wishlists";
	 driver.get(prop.getProperty("url"));
	 Thread.sleep(5000);
	 signin.SignInbutton();;
	 signin.enterAllreadtcreatedEmailToLogin("aman3423452@gmail.com");
	 signin.enterAllreadtcreatedPwdToLogin("aman123");
	 signin.clickOnSignInbutton();
	boolean isSuccess= signin.verifyWishListText();
	if(isSuccess)
	Assert.assertEquals( isSuccess,true);
	else {
		Assert.assertEquals(isSuccess, false);
	}
	 signin.signoutButton();
}

public void VerifyUserLoginCredentialWithInValidData() throws InterruptedException {
	driver.get(Or.getProperty("url"));
	 Thread.sleep(5000);
	 signin.SignInbutton();;
	 signin.enterAllreadtcreatedEmailToLogin("aman3423452@gmail.com");
	 signin.enterAllreadtcreatedPwdToLogin("aman12");
	 signin.clickOnSignInbutton();
	 boolean bool= signin.verifyWishListText();
	 assertEquals(true,  bool);

	 signin.signoutButton();
}*/
}
