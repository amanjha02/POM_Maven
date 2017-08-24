package TestBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

//import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.ExtentTest;

public class TestBase {
	
	
	
	public   WebDriver driver;
	public File file;
	public FileInputStream fis;
	public Properties prop;
	public static ExtentReports extent;
	public ExtentTest test;
	static {

		Calendar calender = Calendar.getInstance();
		SimpleDateFormat dateformat = new SimpleDateFormat("dd_MM_YYYY_hh_mm_ss");
		/*extent = new ExtentReports(System.getProperty("user.dir") + "src/main/java/Report/test"
				+ dateformat.format(calender.getTime()) + ".html", false);*/
		
		extent = new ExtentReports("H:\\NewWorkspace\\POM_Maven\\src\\main\\java\\Report\\test"
				+ dateformat.format(calender.getTime()) + ".html", false);
	}
	
	public void init() throws IOException {
		loadPropertiesFile();
		getBrowserType(prop.getProperty("browser"));
	}
	public void loadPropertiesFile() throws IOException {
		file=new File(System.getProperty("user.dir")+"//src//main//java//Config//config.properties");
		fis=new FileInputStream(file);
		prop=new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("url"));
		
		
	}
	
	public WebDriver  getBrowserType(String browserType) {
		if(browserType.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			return driver;
		}else if(browserType.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"/Drivers/IEDriverServer.exe" );
			driver=new InternetExplorerDriver();
			driver.manage().window().maximize();
			return driver;
		}else if(browserType.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Drivers/chromedriver.exe" );
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			return driver;
		}
		
		return null;
	}
	public void getresult(ITestResult result) throws IOException{
		if(result.getStatus()==ITestResult.SUCCESS){
			test.log(LogStatus.PASS, result.getName()+"Test case is passed");
		}else if(result.getStatus()==ITestResult.SKIP){
			test.log(LogStatus.PASS, result.getName()+"Test case is skiped and skip reason is:-"+result.getThrowable());
		}
		else if (result.getStatus()==ITestResult.FAILURE) {
			test.log(LogStatus.FAIL, result.getName()+"Test case is Failed"+result.getThrowable());
			//String screen=cptureScreenshot("");
			//test.log(LogStatus.FAIL,test.addScreenCapture(screen));
			
		}else if (result.getStatus()==ITestResult.STARTED) {
			test.log(LogStatus.INFO, result.getName()+"Test case is started");
			
		}
	}
	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException{
		getresult(result);
	}
	@BeforeMethod
	public void beforeMethod(Method result){
		test=extent.startTest(result.getName());
		test.log(LogStatus.INFO, result.getName()+"Test Stareted");
	}
	@AfterClass(alwaysRun=true)
	public void endTest(){
		driver.quit();
		extent.endTest(test);
		extent.flush();
		
	}
	@BeforeClass
	public void open(){
		 driver=new FirefoxDriver();
	}
	
	/*public static void main(String[] args) throws IOException {
		TestBase t=new TestBase();
	
		t.getBrowserType("chrome");
		t.loadPropertiesFile();
	}*/
}
