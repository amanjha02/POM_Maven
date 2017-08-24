package testScript;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCaseReport1 {
	@Test
	public void  ValidateLoginTestcaseWithValidData(){
		System.out.println("Login Test Case Pass");
		Assert.assertEquals(true, true);
	}

	
	@Test
	public void  ValidateLoginTestcaseWithInValidData(){
		System.out.println("Login Test Case fail");
		Assert.assertEquals(false, true);
	}
	@Test()
	public void ValidateLoginTestcaseWithValidandInvalidData(){
		System.out.println("Login Test Case Pass");
		Assert.assertEquals(true, true);
	}
}
