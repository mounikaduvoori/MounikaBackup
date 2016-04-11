package com.qa.ui;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import atu.testng.reports.ATUReports;
import atu.testng.reports.logging.LogAs;
import atu.testng.selenium.reports.CaptureScreen;
import atu.testng.selenium.reports.CaptureScreen.ScreenshotOf;

import com.qa.common.ReadfromProperties;
import com.qa.keyword.Keywords;

public class HomepageValidation extends Keywords{
	
	
	ReadfromProperties prop = new ReadfromProperties();
	
	public HomepageValidation(WebDriver driver) 
	{
		super(driver);
	}
	public void Title()throws Exception
	{
		stepName="Page Title";
		getWindowtitle();				
	}
	
	public void verify_Home() throws Exception
	{
		stepName="verify_Home";
		try{
		getWindowtitle();			
		
		
		findElement(By.linkText(prop.getHomepageProperty("Home_campaign_linktext")));
		findElement(By.linkText(prop.getHomepageProperty("Home_A.C.E_linktext")));
		
		findElement(By.linkText(prop.getHomepageProperty("Home_Setup_linktext")));
		findElement(By.linkText(prop.getHomepageProperty("Home_Statistics_linktext")));
		findElement(By.linkText(prop.getHomepageProperty("Home_EmailRespondents_linktext")));		
		findElement(By.linkText(prop.getHomepageProperty("Home_contestwinners_linktext")));
		
		findElement(By.linkText(prop.getHomepageProperty("Home_importexport_linktext")));
		findElement(By.linkText(prop.getHomepageProperty("Home_RandomWinner_linktext")));		
		findElement(By.linkText(prop.getHomepageProperty("Home_DatabaseStatistics_linktext")));
		findElement(By.linkText(prop.getHomepageProperty("Home_DisplayDatabase_linktext")));
		findElement(By.linkText(prop.getHomepageProperty("Home_InactiveDatabase_linktext")));
		findElement(By.linkText(prop.getHomepageProperty("Home_Reports_linktext")));
		
		findElement(By.linkText(prop.getHomepageProperty("Home_Registration_linktext")));
		findElement(By.linkText(prop.getHomepageProperty("Home_Settings_linktext")));
		findElement(By.linkText(prop.getHomepageProperty("Home_SystemEmails_linktext")));
		findElement(By.linkText(prop.getHomepageProperty("Home_TestGroups_linktext")));
		findElement(By.linkText(prop.getHomepageProperty("Home_FrontPages_linktext")));
		findElement(By.linkText(prop.getHomepageProperty("Home_ImageLibrary_linktext")));
		findElement(By.linkText(prop.getHomepageProperty("Home_Links_linktext")));
		
		findElement(By.linkText(prop.getHomepageProperty("Home_LOGOUT_linktext")));
		findElement(By.linkText(prop.getHomepageProperty("Home_HOME_linktext")));
		findElement(By.linkText(prop.getHomepageProperty("Home_MASTERHOME_linktext")));	
		
			ATUReports.add("Home page Verification","CLick on Tester","Dat-e-Base - Tester - Admin - Main Menu",getWindowtitle(),LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		}
		catch(Exception e)
		{
			ATUReports.add("Home page Verification","CLick on Tester","Dat-e-Base - Tester - Admin - Main Menu",getWindowtitle(),LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));		

		}	
	}
	public boolean isHomePage() throws Exception {
		isElementPresent(By.linkText(prop.getHomepageProperty("Home_campaign_linktext")));
		isElementPresent(By.linkText(prop.getHomepageProperty("Home_A.C.E_linktext")));
		
		isElementPresent(By.linkText(prop.getHomepageProperty("Home_Setup_linktext")));
		isElementPresent(By.linkText(prop.getHomepageProperty("Home_Statistics_linktext")));
		isElementPresent(By.linkText(prop.getHomepageProperty("Home_EmailRespondents_linktext")));		
		isElementPresent(By.linkText(prop.getHomepageProperty("Home_contestwinners_linktext")));
		
		isElementPresent(By.linkText(prop.getHomepageProperty("Home_importexport_linktext")));
		isElementPresent(By.linkText(prop.getHomepageProperty("Home_RandomWinner_linktext")));		
		isElementPresent(By.linkText(prop.getHomepageProperty("Home_DatabaseStatistics_linktext")));
		isElementPresent(By.linkText(prop.getHomepageProperty("Home_DisplayDatabase_linktext")));
		isElementPresent(By.linkText(prop.getHomepageProperty("Home_InactiveDatabase_linktext")));
		isElementPresent(By.linkText(prop.getHomepageProperty("Home_Reports_linktext")));
		
		isElementPresent(By.linkText(prop.getHomepageProperty("Home_Registration_linktext")));
		isElementPresent(By.linkText(prop.getHomepageProperty("Home_Settings_linktext")));
		isElementPresent(By.linkText(prop.getHomepageProperty("Home_SystemEmails_linktext")));
		isElementPresent(By.linkText(prop.getHomepageProperty("Home_TestGroups_linktext")));
		isElementPresent(By.linkText(prop.getHomepageProperty("Home_FrontPages_linktext")));
		isElementPresent(By.linkText(prop.getHomepageProperty("Home_ImageLibrary_linktext")));
		isElementPresent(By.linkText(prop.getHomepageProperty("Home_Links_linktext")));
		
		isElementPresent(By.linkText(prop.getHomepageProperty("Home_LOGOUT_linktext")));
		isElementPresent(By.linkText(prop.getHomepageProperty("Home_HOME_linktext")));
		isElementPresent(By.linkText(prop.getHomepageProperty("Home_MASTERHOME_linktext")));
		return true;
		
	}
	
	public void click_Campaign() throws Exception
	{
		stepName="clickCampaign";
		click(By.linkText(prop.getHomepageProperty("Home_campaign_linktext")));
	}
	public void click_Setup() throws Exception
	{
		stepName="clickCampaign";
		click(By.linkText(prop.getHomepageProperty("Home_Setup_linktext")));
	}
	public boolean isSetUpPage() throws Exception {
		
		boolean status = isElementPresent(By.linkText(prop.getHomepageProperty("Home_Setup_linktext")));
		TakeScreenshot(screenshotPath+className+"_"+testName+"_"+stepName);
		return status;
	}
	public void click_Statistics() throws Exception
	{
		stepName="clickCampaign";
		click(By.linkText(prop.getHomepageProperty("Home_Statistics_linktext")));
	}
	public void click_Emailrespondents() throws Exception
	{
		stepName="clickCampaign";
		click(By.linkText(prop.getHomepageProperty("Home_EmailRespondents_linktext")));	
	}
	public void click_selectcontestwinners() throws Exception
	{
		stepName="clickCampaign";
		click(By.linkText(prop.getHomepageProperty("Home_contestwinners_linktext")));
	}
	public void click_ImportExport() throws Exception
	{
		stepName="clickCampaign";
		click(By.linkText(prop.getHomepageProperty("Home_importexport_linktext")));
	}
	public void click_selectrandomwinners() throws Exception
	{
		stepName="clickCampaign";
		click(By.linkText(prop.getHomepageProperty("Home_RandomWinner_linktext")));
	}
	public void click_Databasestatistics() throws Exception
	{
		stepName="clickCampaign";
		click(By.linkText(prop.getHomepageProperty("Home_DatabaseStatistics_linktext")));
	}
	public void click_DisplayDatabase() throws Exception
	{
		stepName="clickCampaign";
		click(By.linkText(prop.getHomepageProperty("Home_DisplayDatabase_linktext")));
	}
	public void click_InactiveDatabase() throws Exception
	{
		stepName="clickCampaign";
		click(By.linkText(prop.getHomepageProperty("Home_InactiveDatabase_linktext")));
	}
	public void click_Reports() throws Exception
	{
		stepName="clickCampaign";
		click(By.linkText(prop.getHomepageProperty("Home_Reports_linktext")));
	}
	public void click_Registration() throws Exception
	{
		stepName="clickCampaign";
		click(By.linkText(prop.getHomepageProperty("Home_Registration_linktext")));
	}
	public void click_Settings() throws Exception
	{
		stepName="clickCampaign";
		click(By.linkText(prop.getHomepageProperty("Home_Settings_linktext")));
	}
	public void click_SystemEmails() throws Exception
	{
		stepName="clickCampaign";
		click(By.linkText(prop.getHomepageProperty("Home_SystemEmails_linktext")));
	}
	public void click_Testgroups() throws Exception
	{
		stepName="clickCampaign";
		click(By.linkText(prop.getHomepageProperty("Home_TestGroups_linktext")));
	}
	public void click_FrontPages() throws Exception
	{
		stepName="clickCampaign";
		click(By.linkText(prop.getHomepageProperty("Home_FrontPages_linktext")));
	}
	public void click_Links() throws Exception
	{
		stepName="clickCampaign";
		click(By.linkText(prop.getHomepageProperty("Home_Links_linktext")));
	}
	public void logout()throws Exception
	{
		click(By.linkText(prop.getHomepageProperty("Home_LOGOUT_linktext")));
	}

}
