package com.qa.test.sanity;
import java.awt.AWTException;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import atu.testng.reports.ATUReports;
import atu.testng.reports.ATUReports;
import atu.testng.reports.logging.LogAs;
import atu.testng.selenium.reports.CaptureScreen;
import atu.testng.selenium.reports.CaptureScreen.ScreenshotOf;
import atu.testng.reports.listeners.ATUReportsListener;
import atu.testng.reports.listeners.ConfigurationListener;
import atu.testng.reports.listeners.MethodListener;
import atu.testng.reports.utils.Utils;

import com.qa.common.ATUReporter;
import com.qa.common.ReadfromProperties;
import com.qa.common.poi_Reader_e;
import com.qa.keyword.Keywords;
import com.qa.ui.Addcontest;
import com.qa.ui.HomepageValidation;
import com.qa.ui.LoginPage;
import com.qa.ui.LoginProperty;
import com.qa.ui.Setup;



public class AddContest {
	
	private WebDriver driver = null;
	private LoginPage loginpage = null;
	private LoginProperty property =null;
	private HomepageValidation home=null;
	private Setup setup =null;	
	private Addcontest con=null;
	private ATUReporter atu=null;
	private String p_URL = null;
	String sdate = null,edate = null;
	ReadfromProperties prop = new ReadfromProperties();
	
	
	
	@BeforeMethod
	public void setup()throws Exception
	{
		{
	        System.setProperty("atu.reporter.config", "../Presslaf/properties/atu.properties");

	    }
		System.out.println("Contest Setup Validation");
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
		loginpage=new LoginPage(driver);
		property=new LoginProperty(driver);		
		
		home=new HomepageValidation(driver);
		setup=new Setup(driver);
		con=new Addcontest(driver);
		atu= new ATUReporter(driver);
		//driver.navigate().to(prop.getConfigProperty("presslaff_url"));
		atu.AtuConfig();
		driver.manage().window().maximize();
		String[][] testData = poi_Reader_e.readExcelData(".\\testdata\\resources\\Presslaff_URL.xlsx","P_URL","Valid_URL");	    	 
		String getURL=Arrays.deepToString(testData);
		System.out.println(getURL);
		p_URL=getURL.replaceAll("[\\[\\]]", "");
		System.out.println(p_URL);
		driver.get(p_URL);
		ATUReports.setWebDriver(driver);
	
		
		 ATUReports.indexPageDescription = "PRESSLAFF <br/> <b>Sanity Test Suite</b>";
		}
	
	@DataProvider(name="Login")
	public Object[][] dataProvider_valid() {
		Object[][] testData = poi_Reader_e.readExcelData("..\\Presslaf\\testdata\\resources\\Login1.xls","login","Login_Data");	    	 
		return testData;	 
	}

	@SuppressWarnings("deprecation")
	@Test(dataProvider="Login",description="Validating ContestSetup")
	public void presslaff_ContestSetup(String username, String password,String cname,String ctype,String cheader,String cheader1,String cheader2) throws Exception{
		
		
		
		Keywords.testName = "loginData";
		try {
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			String LoginTitle=loginpage.getWindowtitle();
			ATUReports.add("Opening Login page ", "open Presslaff URL ","Should land in Login Page",LoginTitle, true);
				
				loginpage.typeUsernmae(username);	//Enter username			
				loginpage.typePassword(password);	//Enter Password
				loginpage.clickLogin();	//Click on Login
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				String Mas_home_Title=property.getWindowtitle();
				ATUReports.add("Login to Master Home Navigation", "click Login","Should Land in Master Home Page",Mas_home_Title, true);
				
				property.clickTester();	//CLick on property Tester
				//con.clickAutomation(); // select Automation Property
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				String homeTitle=home.getWindowtitle();
				ATUReports.add("Master Home to Home Page Navigation", "select property","Should Land in Home Page",homeTitle, true);
				
				home.click_Setup(); //Click on set up button at left menu
				//driver.findElement(By.linkText("One Click Ck Type")).click();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				String setupTitle=setup.getWindowtitle();
				ATUReports.add("Home Page to Contest setup Page Navigation", "Click Setup","Should Land in Contest Setup Page",setupTitle, true);
				Assert.assertTrue(con.isVerifySetUpPage()); // Verify the set up page has opened
				System.out.println("Verifies label on Set up - Assert");
				setup.addcontest();		//Add a new contest
				String conTitle=con.getWindowtitle();
				ATUReports.add("Contest Setup to Add Question Page Navigation", "Click Add Question","Should Land in Add Question Page",conTitle, true);
				Assert.assertTrue(con.isVerifyAddContest_labels()); // verify labels on Add contest page
				System.out.println("Verifies Add contest page elements- Assert");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				ATUReports.add("Contest Page Validation", "Validation the Elements","Elements should Display","Elements Displayed", true);
				con.contestname(cname); // Enter the contest name
				con.contesttype(ctype); // Select the contest type
				//con.startdate(sdate);	
				con.once();
				//con.weekly();	//
				con.enddate(edate);  // Enter end date of contest
				// // adds header 
				Assert.assertTrue(con.isMultipleonceselected());
				System.out.println("Verifies Multiple Once selected- Assert");
				con.save();	
				Thread.sleep(300);
				Assert.assertTrue(con.isVerifyAddContest_headers());
				System.out.println("Verifies Add contest header- Assert");
				Assert.assertTrue(con.isAddQuestionDisplayed());
				System.out.println("Verifies Add Question not dispalyed- Assert");
				Assert.assertFalse(con.isContestTypeDisabled());
				System.out.println("Verifies ContestTypeDisabled- Assert");
				Assert.assertTrue(con.isMultipleonceselected());
				System.out.println("Verifies Multiple Once selected- Assert");
				Assert.assertTrue(con.isSurveylinkDisplayed());
				System.out.println("Verifies Survey link Displayed- Assert");
				// GO to the Page WIzard page
				con.pageWizard();
				Assert.assertTrue(con.isPageWizardOpened());
				con.bannerimage();
				//Upload banner for wizard contest
				con.uploadBanner();
				Assert.assertTrue(con.isPW_UploadBanner());
				System.out.println("Page Wizard uploads with image- Assert");
				Thread.sleep(3000);
				con.getsourceOfBanner_ContestPage();
				con.addContestHeading();
				//Add contest header
				con.contest_ckeditor(cheader);
				con.ckfinder_save();
				// Verify the contest Header
				con.oneclick_wizard(cheader);
				con.select_PW_login_page();
				Assert.assertTrue(con.isPW_loginpage());
				System.out.println("Page Wizard Login Page opened- Assert");
				con.getsourceOfBanner_LoginPage();
				con.verifyBannerOfLoginPage();
				con.contestHeading_loginPage();
				//String cheader1 = null;
				con.contest_PW_loginpage_ckeditor(cheader1);
				con.ckfinder_save();
				con.verifyPW_Login_Contest_Header(cheader1);
				con.select_PW_confirmation_page();
				con.verifyBannerOfConfirmationPage();
				con.contestHeading_confirmationPage();
				con.contest_PW_confirmation_ckeditor(cheader2);
				con.ckfinder_save();
				con.verifyPW_Confirmation_Contest_Header(cheader2);
				Thread.sleep(3000);
				con.backToContest();
				con.openSureveyLink();
				con.frontPage_login(cheader1);
				String getmail = null;
				con.fillEmailid(getmail);
				con.front_LoginSubmit();
				con.front_RegistrationHeader(cheader);
				con.front_Registration_type_firstname();
				con.front_Registration_type_lastname();
				con.front_Registration_Select_Gender();
				con.front_Registration_Select_DOB();
				con.front_Registration_Select_optin();
				con.front_RegSubmit();
				con.front_ConfirmationHeader(cheader2);
				//con.navigateback();
				home.click_Setup();
				con.click_OneClickContest();
				System.out.println("One click Contest exists");
				con.delete();
				con.alert();
				home.logout();
				atu.setAuthorInfoForReports();
						
		} catch (Exception e) {
			e.printStackTrace();
			throw(e);
		}	
		
		
		
	}
	/*@Test
    public void testNewLogs() throws AWTException, IOException
    {

           ATUReports.add("INfo Step", LogAs.INFO, new CaptureScreen(
                        ScreenshotOf.BROWSER_PAGE));
           ATUReports.add("Pass Step", LogAs.PASSED, new CaptureScreen(
                        ScreenshotOf.DESKTOP));
           WebElement element = driver
                        .findElement(By.xpath("/html/body/div/h1/a"));
           ATUReports.add("Warning Step", LogAs.WARNING,
                        new CaptureScreen(element));
           ATUReports.add("Fail step", LogAs.FAILED, new CaptureScreen(
                        ScreenshotOf.DESKTOP));
    }*/
	@AfterMethod
	public void aftermethod() throws Exception{
		
		driver.close();
		driver.quit();
	
}
 
	

}
