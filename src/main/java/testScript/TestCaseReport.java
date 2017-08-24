package testScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import TestBase.TestBase;

public class TestCaseReport extends TestBase {
	
	@Test
	public void  passedtestCase(){
		System.out.println("Login Test Case Pass");
		Assert.assertEquals(true, true);
	}

	
	@Test
	public void  FailedtestCase1(){
		System.out.println("Login Test Case fail");
		Assert.assertEquals(false, true);
	}
	@Test()
	public void PassedTestCaseTest(){
		System.out.println("Login Test Case Pass");
		Assert.assertEquals(true, true);
	}
}
