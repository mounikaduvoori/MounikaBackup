package com.qa.ui;
import com.qa.common.ReadfromProperties;
import com.qa.keyword.Keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Setup extends Keywords {
	ReadfromProperties prop = new ReadfromProperties();
	public Setup (WebDriver driver) 
	{
		super(driver);
	}
	/*-------------------------contest setup------------------------------*/
	public void verifysetup() throws Exception
	{
		findElement(By.linkText(prop.ContestSetup("presslaff_contest_addcontest_linktext")));
		findElement(By.linkText(prop.ContestSetup("presslaff_contest_oldcontest_linklext")));
		findElement(By.cssSelector(prop.ContestSetup("presslaff_contest_save_css")));
	}
	public boolean isSetUpDeatialPage() throws Exception {
		isElementPresent(By.linkText(prop.ContestSetup("presslaff_contest_addcontest_linktext")));
		isElementPresent(By.linkText(prop.ContestSetup("presslaff_contest_oldcontest_linklext")));
		isElementPresent(By.cssSelector(prop.ContestSetup("presslaff_contest_save_css")));
		return true;
	}
	public void Title()throws Exception
	{
		stepName="Page Title";
		getWindowtitle();				
	}
	public void addcontest() throws Exception
	{
		stepName="addcontest";
		click(By.linkText(prop.ContestSetup("presslaff_contest_addcontest_linktext")));
		
	}
	public void oldcontests() throws Exception
	{
		stepName="oldcontest";
		click(By.linkText(prop.ContestSetup("presslaff_contest_oldcontest_linklext")));
		
	}
	public void save() throws Exception
	{
		stepName="save";
		click(By.cssSelector(prop.ContestSetup("presslaff_contest_save_css")));
		
	}
	
}



