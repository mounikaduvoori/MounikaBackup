package com.qa.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.common.ReadfromProperties;
import com.qa.keyword.Keywords;


public class EmailCampaignValidation extends Keywords {
	
ReadfromProperties prop = new ReadfromProperties();

	
	public EmailCampaignValidation(WebDriver driver) 
	{
		super(driver);
	}
		
	public void click_campaign() throws Exception
	{
		stepName="clickCampaign";
		click(By.linkText(prop.getHomepageProperty("Home_campaign_linktext")));
	}
	public void Title()throws Exception
	{
		stepName="Page Title";
		getWindowtitle();				
	}
	
	public void verify_campaign()throws Exception
	{
		
		stepName="verifycampaign";
		System.out.println("Email Campaign Validation");
		findElement(By.linkText(prop.getcampaignmodproperty("campaign_Addnew_linktext")));
		findElement(By.linkText(prop.getcampaignmodproperty("Campaign_sentmail_linktext")));
		findElement(By.linkText(prop.getcampaignmodproperty("Campaign_Rssemail_linktext")));
		findElement(By.linkText(prop.getcampaignmodproperty("Campaign_fetchemail_linktext")));
			
	}
	public boolean isCampaignPage() throws Exception {
		isElementPresent(By.linkText(prop.getcampaignmodproperty("campaign_Addnew_linktext")));
		isElementPresent(By.linkText(prop.getcampaignmodproperty("Campaign_sentmail_linktext")));
		isElementPresent(By.linkText(prop.getcampaignmodproperty("Campaign_Rssemail_linktext")));
		isElementPresent(By.linkText(prop.getcampaignmodproperty("Campaign_fetchemail_linktext")));
		return true;
	}
	
	
	
}
