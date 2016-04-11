package com.qa.ui;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.common.ReadfromProperties;
import com.qa.keyword.Keywords;

public class Settings extends Keywords{
	

	ReadfromProperties prop = new ReadfromProperties();
	
	
	public Settings(WebDriver driver)
	{
		super(driver);
	}

	public void settings()throws Exception
	{
		stepName="click_settings";
		click(By.linkText(prop.getHomepageProperty("Home_Settings_linktext")));
	}
	public void Title()throws Exception
	{
		stepName="Page Title";
		getWindowtitle();				
	}
	public void verify_Settings()throws Exception
	{
		findElement(By.linkText(prop.Settings("settings_fieldsettings_linktext")));
		findElement(By.name(prop.Settings("settings_attachmentTexyt_name")));
		findElement(By.name(prop.Settings("settings_header_name")));
		findElement(By.name(prop.Settings("settings_footer_name")));
		findElement(By.name(prop.Settings("settings_broadcastHeader_name")));
		findElement(By.name(prop.Settings("settings_broadcastFooter_name")));
		findElement(By.cssSelector(prop.Settings("settings_friendlyfrm_emailname_css")));
		findElement(By.cssSelector(prop.Settings("settings_frm_email_css")));
		findElement(By.cssSelector(prop.Settings("settings_configuration_frdfrm_css")));
		findElement(By.cssSelector(prop.Settings("settings_configuration_frmemail_css")));
		findElement(By.cssSelector(prop.Settings("settings_save_css")));
	}
	public boolean isSettingPage() throws Exception {
		isElementPresent(By.linkText(prop.Settings("settings_fieldsettings_linktext")));
		isElementPresent(By.name(prop.Settings("settings_attachmentTexyt_name")));
		isElementPresent(By.name(prop.Settings("settings_header_name")));
		isElementPresent(By.name(prop.Settings("settings_footer_name")));
		isElementPresent(By.name(prop.Settings("settings_broadcastHeader_name")));
		isElementPresent(By.name(prop.Settings("settings_broadcastFooter_name")));
		isElementPresent(By.cssSelector(prop.Settings("settings_friendlyfrm_emailname_css")));
		isElementPresent(By.cssSelector(prop.Settings("settings_frm_email_css")));
		isElementPresent(By.cssSelector(prop.Settings("settings_configuration_frdfrm_css")));
		isElementPresent(By.cssSelector(prop.Settings("settings_configuration_frmemail_css")));
		isElementPresent(By.cssSelector(prop.Settings("settings_save_css")));
		return true;
	}
}
