package testScript;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCaseReport2 {
	@Test
	public void  validateEcomercesite(){
		System.out.println("Login Test Case Pass");
		Assert.assertEquals(true, true);
	}

	
	@Test
	public void  validateEcomercesiteFail(){
		System.out.println("Login Test Case fail");
		Assert.assertEquals(false, true);
	}
	@Test()
	public void validateEcomercesitePass(){
		System.out.println("Login Test Case Pass");
		Assert.assertEquals(true, true);
	}
}
