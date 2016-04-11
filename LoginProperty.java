package com.qa.ui;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import atu.testng.reports.ATUReports;

import com.qa.keyword.Keywords;
import com.qa.common.ReadfromProperties;

public class LoginProperty extends Keywords {
	
ReadfromProperties prop = new ReadfromProperties();
	
	public LoginProperty(WebDriver driver)
	
	{
		super(driver);
	}
	public void Title()throws Exception
	{
		stepName="Page Title";
		getWindowtitle();				
	}
	
	public void verify_property()throws Exception
	{
		stepName="verify_property_page";
		findElement(By.linkText(prop.LoginProperty("property_select_Tester_linktext")));
		findElement(By.linkText(prop.LoginProperty("property_select_Tester2_linktext")));
		findElement(By.linkText(prop.LoginProperty("property_select_Testparent_linktext")));
		findElement(By.id(prop.LoginProperty("property_select_Logout_id")));
		
	}
	public void clickTester()throws Exception
	{
		stepName="select property";
		click(By.linkText(prop.LoginProperty("property_select_Tester_linktext")));
	}
	public boolean isclickTester() throws Exception {
		
		boolean status = isElementPresent(By.linkText(prop.LoginProperty("property_select_Tester_linktext")));
		TakeScreenshot(screenshotPath+className+"_"+testName+"_"+stepName);
		return status;
		
	}
	public void clickTester2()throws Exception
	{
		stepName="select property";
		click(By.linkText(prop.LoginProperty("property_select_Tester2_linktext")));
	}
	public void clickTestParent()throws Exception
	{
		stepName="select property";
		click(By.linkText(prop.LoginProperty("property_select_Testparent_linktext")));
	}
	
}
