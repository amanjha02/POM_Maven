package testScript;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ExcelReader.Excel_Reader;
import PageLibrary.SignIn;
import TestBase.TestBase;

public class TestCaseLogin_001_DataProvider extends TestBase {
	SignIn signin;
	
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
	@Test
	public void ThirdTest(){
		System.out.println("third test case");
	}
	
	/*@BeforeClass
	public void ssetUp() throws IOException{
		init();
	}
	
	public Object[][] getdata(String ExcelName,String Testcase){
		
	Excel_Reader reader=new Excel_Reader(System.getProperty("user.dir")+"\\TestData\\"+ExcelName+"\\.xlsx");
	int rowNum=reader.rowCount(Testcase);
	int colNum=reader.getcolumnCount(Testcase);
	
	Object getSampledata[][]=new Object[rowNum-1][colNum-1];
	for (int i = 1; i < rowNum; i++) {
		for (int j = 0; j <= colNum; j++) {
			getSampledata[i-1][j]=reader.getCellData(Testcase, j, i);
			
		}
	}
	return getSampledata;
		
	}
	@DataProvider
	public Object[][] getDataforLogin(){
		Object data[][]=getdata("DataEngine","Shhet1");
		return data;
	}
*/
}
