package com.qa.ui;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import atu.testng.reports.ATUReports;
import atu.testng.reports.logging.LogAs;
import atu.testng.selenium.reports.CaptureScreen;
import atu.testng.selenium.reports.CaptureScreen.ScreenshotOf;

import com.qa.keyword.Keywords;
import com.qa.common.ReadfromProperties;
import com.qa.common.poi_Reader_e;

public class LoginPage extends Keywords {

	ReadfromProperties prop = new ReadfromProperties();
	String[][] testData = poi_Reader_e.readExcelData(
			".\\testdata\\resources\\Presslaff_URL.xlsx", "P_URL",
			"Valid_URL");
	String getURL = Arrays.deepToString(testData);
	
	public LoginPage(WebDriver driver)
	
	{
		super(driver);
	}
	public void loginTitle()throws Exception
	{
		stepName="Page Title";
		getWindowtitle();			
		try{
		ATUReports.add("Login Page Validation", getURL,  "Dat-e-Base - Admin Login Page", getWindowtitle() , LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
	}
	catch(Exception e)
	{
		ATUReports.add("Login Page Validation", getURL, "Dat-e-Base - Admin Login Page", getWindowtitle() , LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));			
	
	}
	}
	public void hasText(String text) throws Exception
	{
		stepName = "hasText";
		waitForTextPresent(By.linkText(prop.getloginpageProperty("login_presslaffurl_linktext")), text);
	}
	
	public void verifyUN()throws Exception
	{
		stepName="verify_Username_presence";
		findElement(By.cssSelector(prop.getloginpageProperty("login_username_css")));
		
	}
	public void verifypwd()throws Exception
	{
		stepName="verify_Username_presence";
		findElement(By.cssSelector(prop.getloginpageProperty("login_password_css")));
	}

	public void verifylogin()throws Exception
	{
		stepName="verify_Username_presence";
		findElement(By.cssSelector(prop.getloginpageProperty("login_submit_css")));
	}
	public void typeUsernmae(String username) throws Exception{
		stepName = "typeUsernmae";
		type(By.cssSelector(prop.getloginpageProperty("login_username_css")),username);
		
	}

	public void typePassword(String password) throws Exception{
		stepName = "typePassword";
		type(By.cssSelector(prop.getloginpageProperty("login_password_css")),password);
		
	}
		
	public void clickLogin() throws Exception
	{		
		stepName = "clickLogin";
		click(By.cssSelector(prop.getloginpageProperty("login_submit_css")));
	}
		
	public void login(String username, String password) throws Exception
	{
		typeUsernmae(username);
		typePassword(password);
		clickLogin();
	}
	public boolean isLoginPage() throws Exception {
		
		boolean status = isElementPresent(By.cssSelector(prop.getloginpageProperty("login_username_css")));
		TakeScreenshot(screenshotPath+className+"_"+testName+"_"+stepName);
		return status;
	}
	}

