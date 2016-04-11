package com.qa.ui;
import com.qa.common.ReadfromProperties;
import com.qa.keyword.Keywords;

import static org.testng.Assert.fail;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Addcontest extends Keywords{
	
	ReadfromProperties prop = new ReadfromProperties();
	public Addcontest (WebDriver driver) 
	{
		super(driver);
	}

	public void Title()throws Exception
	{
		stepName="Page Title";
		getWindowtitle();				
	}
	public void clickAutomation()throws Exception
	{
		stepName="select property";
		click(By.linkText(prop.AddContest("property_select_Automation_linktext")));
	}
	
	public boolean isVerifySetUpPage() throws Exception
	{
		isElementPresent(By.linkText(prop.AddContest("presslaff_contest_addcontest_header_linktext")));
		isElementPresent(By.linkText(prop.AddContest("presslaff_contest_oldcontest_header_linktext")));
		isElementPresent(By.id(prop.AddContest("presslaff_contest_addcontest_local_id")));
		isElementPresent(By.id(prop.AddContest("presslaff_contest_addcontest_IdeaSparker_id")));
		isElementPresent(By.id(prop.AddContest("presslaff_contest_addcontest_Enterprise_id")));
		isElementPresent(By.id(prop.AddContest("presslaff_contest_addcontest_All_id")));
		return true;
		
	}
	public void VerifyAddcontest()throws Exception
	{
		findElement(By.id(prop.AddContest("presslaff_contest_addcontest_contestname_id")));
		findElement(By.id(prop.AddContest("presslaff_contest_addcontest_contesttype_id")));
		findElement(By.id(prop.AddContest("presslaff_contest_addcontest_startdate_id")));
		findElement(By.id(prop.AddContest("presslaff_contest_addcontest_starttimehour_id")));
		findElement(By.id(prop.AddContest("presslaff_contest_addcontest_enddate_id")));
		findElement(By.id(prop.AddContest("presslaff_contest_addcontest_endtimehour_id")));
		findElement(By.name(prop.AddContest("presslaff_contest_addcontest_multipleentries_name")));
		findElement(By.cssSelector(prop.AddContest("presslaff_contest_addcontest_multipleentries_once_css")));
		findElement(By.cssSelector(prop.AddContest("presslaff_contest_addcontest_multipleentries_hourly_css")));
		findElement(By.cssSelector(prop.AddContest("presslaff_contest_addcontest_multipleentries_Daily_css")));
		findElement(By.cssSelector(prop.AddContest("presslaff_contest_addcontest_multipleentries_weekly_css")));
		findElement(By.id(prop.AddContest("presslaff_contest_addcontest_fbshare_id")));
		findElement(By.id(prop.AddContest("presslaff_contest_addcontest_save_id")));
		findElement(By.id(prop.AddContest("presslaff_contest_addcontest_Heading_id")));
		findElement(By.id(prop.AddContest("presslaff_contest_addcontest_Teaser_id")));
		findElement(By.id(prop.AddContest("presslaff_contest_addcontest_Participated_id")));
		findElement(By.id(prop.AddContest("presslaff_contest_addcontest_Rules_id")));
		//findElement(By.id(prop.AddContest("presslaff_contest_addcontest_multipleentries_once_css")));
		
	}
	public boolean isVerifyAddContest_labels() throws Exception
	{
		isElementPresent(By.id(prop.AddContest("presslaff_contest_addcontest_contestname_id")));
		isElementPresent(By.id(prop.AddContest("presslaff_contest_addcontest_contesttype_id")));
		isElementPresent(By.id(prop.AddContest("presslaff_contest_addcontest_startdate_id")));
		isElementPresent(By.id(prop.AddContest("presslaff_contest_addcontest_starttimehour_id")));
		isElementPresent(By.id(prop.AddContest("presslaff_contest_addcontest_enddate_id")));
		isElementPresent(By.id(prop.AddContest("presslaff_contest_addcontest_endtimehour_id")));
		isElementPresent(By.name(prop.AddContest("presslaff_contest_addcontest_multipleentries_name")));
		isElementPresent(By.cssSelector(prop.AddContest("presslaff_contest_addcontest_multipleentries_once_css")));
		isElementPresent(By.cssSelector(prop.AddContest("presslaff_contest_addcontest_multipleentries_hourly_xpath")));
		isElementPresent(By.cssSelector(prop.AddContest("presslaff_contest_addcontest_multipleentries_Daily_xpath")));
		isElementPresent(By.cssSelector(prop.AddContest("presslaff_contest_addcontest_multipleentries_weekly_xpath")));
		isElementPresent(By.id(prop.AddContest("presslaff_contest_addcontest_selectnewletter_id")));
		isElementPresent(By.id(prop.AddContest("presslaff_contest_addcontest_fbshare_id")));
		isElementPresent(By.id(prop.AddContest("presslaff_contest_addcontest_save_id")));
		isElementPresent(By.id(prop.AddContest("presslaff_contest_addcontest_Heading_id")));
		isElementPresent(By.id(prop.AddContest("presslaff_contest_addcontest_Teaser_id")));
		isElementPresent(By.id(prop.AddContest("presslaff_contest_addcontest_Participated_id")));
		isElementPresent(By.id(prop.AddContest("presslaff_contest_addcontest_Rules_id")));
		return true;
	}
	
	public boolean isMultipleonceselected() throws Exception
	{
		isSelected(By.cssSelector(prop.AddContest("presslaff_contest_addcontest_multipleentries_once_css")));
				return true;
	}
	

	public boolean isVerifyAddContest_headers() throws Exception
	{
		isElementPresent(By.linkText(prop.AddContest("presslaff_contest_addcontest_pages_linktext")));
		isElementPresent(By.linkText(prop.AddContest("presslaff_contest_addcontest_pagewizard_linktext")));
		isElementPresent(By.linkText(prop.AddContest("presslaff_contest_addcontest_confirmationEmail_linktext")));
		isElementPresent(By.linkText(prop.AddContest("presslaff_contest_addcontest_backtocontests__linktext")));
		return true;
		
	}
	public boolean  isContestTypeDisabled() throws Exception
	{
		
		WebElement contesttype= driver.findElement(By.id(prop.AddContest("presslaff_contest_addcontest_contesttype_id")));
        if(contesttype.isEnabled())
        {
        System.out.println("the button is enabled");
        return false;
        }
        else
        {
            System.out.println("the button is disabled");
            return true;
        }
	}
	
	public boolean isAddQuestionDisplayed() throws Exception
	{
		isverifyElementAbsent(By.linkText(prop.AddContest("presslaff_contest_addcontest_addquestion_linktext")));
		return true;
	}
	public boolean isSurveylinkDisplayed() throws Exception
	{
		isverifyElementAbsent(By.cssSelector(prop.AddContest("presslaff_contest_addcontest_surveylink_css")));
		return true;
	}
	
	public void contestname(String cname)throws Exception
	{
		type(By.id(prop.AddContest("presslaff_contest_addcontest_contestname_id")),cname);
	}
	
	public void contesttype(String ctype)throws Exception
	{
		selectBy(By.id(prop.AddContest("presslaff_contest_addcontest_contesttype_id")),ctype);
	}
	
	public void startdate(String sdate)throws Exception
	{
		clear(By.id(prop.AddContest("presslaff_contest_addcontest_startdate_id")));
		type(By.id(prop.AddContest("presslaff_contest_addcontest_startdate_id")),startdate());
		
	}
	public void enddate(String edate)throws Exception
	{
		type(By.id(prop.AddContest("presslaff_contest_addcontest_enddate_id")),enddate());
	}
	public void starttime(String stime)throws Exception
	{
		selectBy(By.name(prop.AddContest("presslaff_contest_addcontest_starttime_id")),stime);
	}
	public void endtime(String etime)throws Exception
	{
		selectBy(By.name(prop.AddContest("presslaff_contest_addcontest_endtime_id")),etime);
	}
	public void once()throws Exception
	{
		click(By.cssSelector(prop.AddContest("presslaff_contest_addcontest_multipleentries_once_css")));
	}
	public void hourly()throws Exception
	{
		click(By.xpath(prop.AddContest("presslaff_contest_addcontest_multipleentries_hourly_xpath")));
	}
	public void daily()throws Exception
	{
		click(By.xpath(prop.AddContest("presslaff_contest_addcontest_multipleentries_Daily_xpath")));
	}
	public void weekly()throws Exception
	{
		click(By.xpath(prop.AddContest("presslaff_contest_addcontest_multipleentries_weekly_xpath")));
	}
	public void pageWizard() throws Exception
	{
		click(By.linkText(prop.AddContest("presslaff_contest_addcontest_pagewizard_linktext")));
	}
	public void backToContest() throws Exception{
		click(By.linkText(prop.AddContest("presslaff_contest_addcontest_backtocontest__linktext")));
	}
	public void click_Survey_Link() throws Exception{
		click(By.cssSelector(prop.AddContest("presslaff_contest_addcontest_surveylink_css")));
	}
	
	public boolean isPageWizardOpened() throws Exception
	{
		isElementPresent(By.id(prop.AddContest("presslaff_contest_addcontest_pagewizard_page_PW_page_id")));
		return true;
	}
	public void bannerimage() throws Exception
	{
		doubleclick(By.id(prop.AddContest("presslaff_contest_addcontest_pagewizard_c1_bannerimg_id")));
	}
	public void uploadBanner() throws Exception
	
	{
		String parentWindow = driver.getWindowHandle();
		Set<String> handles =  driver.getWindowHandles();
		   for(String windowHandle  : handles)
		       {
		       if(!windowHandle.equals(parentWindow))
		          {
		          driver.switchTo().window(windowHandle);
		       //Perform your operation here for new window-->
		          Thread.sleep(3000);
		          driver.manage().window().maximize();
		          SwitchToFrame(findElement(By.tagName(prop.AddContest("presslaff_contest_addcontest_ckeditor_tag"))));
		          Thread.sleep(3000);
		          doubleclick(By.cssSelector(prop.AddContest("presslaff_contest_addcontest_pagewizard_snowmuchfun_css")));
		        Thread.sleep(3000);
		        doubleclick(By.cssSelector(prop.AddContest("presslaff_contest_addcontest_pagewizard_snowmuchfun_css")));
		         driver.switchTo().window(parentWindow); //cntrl to parent presslaff_contest_addcontest_pagewizard_snowmuchfun_xpath
		          }
		       }
		//driver.switchTo().window(By.id(prop.AddContest("presslaff_contest_addcontest_pagewizard_ckfinder_id");
		
	}
	
	public void addContestHeading() throws Exception
	{
		doubleclick(By.cssSelector(prop.AddContest("presslaff_contest_addcontest_pagewizard_Heading_css")));
	}
	
	public boolean isPW_UploadBanner() throws Exception{
		isElementPresent(By.xpath(prop.AddContest("presslaff_contest_addcontest_pagewizard_image_xpath")));
		return true;
	}
	public String getsourceOfBanner_ContestPage() throws Exception{
		WebElement img = driver.findElement(By.id(prop.AddContest("presslaff_contest_addcontest_pagewizard_c1_bannerimg_id")));
		String src_contestpage = img.getAttribute("src");
		return src_contestpage;
		//System.out.println(src);
	}
	public void save()throws Exception
	{
		click(By.id(prop.AddContest("presslaff_contest_addcontest_save_id")));
	}
	public void contest_ckeditor(String cheader)throws Exception
	{
		SwitchToFrame(findElement(By.tagName(prop.AddContest("presslaff_contest_addcontest_ckeditor_tag"))));
		type(By.cssSelector(prop.AddContest("presslaff_contest_addcontest_body_css")),cheader);
		driver.switchTo().defaultContent();
	}
	public void ckfinder_save()throws Exception{
		click(By.id(prop.AddContest("presslaff_contest_addcontest_pagewizard_ckfiner_save_id")));
	}
	public void oneclick_wizard(String cheader) throws Exception{
		//String contest_WizardName1="One Click Contest";
		String contest_WizardName2 = findElement(By.cssSelector(prop.AddContest("presslaff_contest_addcontest_pagewizard_contest_heading_css"))).getText();
		if (cheader.equalsIgnoreCase(contest_WizardName2)){
			System.out.println(contest_WizardName2);
		}
	}
	public boolean isPW_loginpage() throws Exception{
		isElementPresent(By.xpath(prop.AddContest("presslaff_contest_addcontest_pagewizard_pagename_login_xpath")));
		return true;
	}
	public void select_PW_login_page() throws Exception{
		//findElement(By.cssSelector(prop.AddContest("presslaff_contest_addcontest_pagewizard_contest_heading_css"))).se
		selectBy(By.cssSelector(prop.AddContest("presslaff_contest_addcontest_pagewizard_pagename_css")),"Login Page");	
	}
	public void select_PW_confirmation_page() throws Exception{
		//findElement(By.cssSelector(prop.AddContest("presslaff_contest_addcontest_pagewizard_contest_heading_css"))).se
		selectBy(By.cssSelector(prop.AddContest("presslaff_contest_addcontest_pagewizard_pagename_css")),"Confirmation Page");	
	}
	
	public String getsourceOfBanner_LoginPage() throws Exception{
		WebElement img = driver.findElement(By.id(prop.AddContest("presslaff_contest_addcontest_pagewizard_c1_bannerimg_id")));
		String src_loginpage = img.getAttribute("src");
		return src_loginpage;
		
	}
	public void verifyBannerOfLoginPage() throws Exception{
		if(getsourceOfBanner_ContestPage().equalsIgnoreCase(getsourceOfBanner_LoginPage())){
			System.out.println("LoginPage has banner of Contest Page");
		}
		else fail ("Element not equal");
	}
	public void contestHeading_loginPage() throws Exception{
		doubleclick(By.cssSelector(prop.AddContest("presslaff_contest_addcontest_pagewizard_contest_heading_css")));
	}
	public void contest_PW_loginpage_ckeditor(String cheader1)throws Exception
	{
		SwitchToFrame(findElement(By.tagName(prop.AddContest("presslaff_contest_addcontest_ckeditor_tag"))));
		findElement(By.cssSelector(prop.AddContest("presslaff_contest_addcontest_body_css"))).clear();
		type(By.cssSelector(prop.AddContest("presslaff_contest_addcontest_body_css")),cheader1);
		driver.switchTo().defaultContent();
	}
	public void verifyPW_Login_Contest_Header(String cheader1) throws Exception {
		String pw_LoginPageHeader = findElement(By.cssSelector(prop.AddContest("presslaff_contest_addcontest_pagewizard_login_header_name_css"))).getText();
		//System.out.println(pw_LoginPageHeader);
		if(pw_LoginPageHeader.equalsIgnoreCase(cheader1)){
			System.out.println("PageWIzard Login Page Header Entered");		
	} else  fail("Element not Equal");
	}
	
	public String getsourceOfBanner_ConfirmationPage() throws Exception{
		WebElement img = driver.findElement(By.id(prop.AddContest("presslaff_contest_addcontest_pagewizard_c1_bannerimg_id")));
		String src_confirmationpage = img.getAttribute("src");
		return src_confirmationpage;
		
	}
	public void verifyBannerOfConfirmationPage() throws Exception{
		if(getsourceOfBanner_ContestPage().equalsIgnoreCase(getsourceOfBanner_ConfirmationPage())){
			System.out.println("ConfirmationPage has banner of Contest Page");
		}
		else fail ("Element not equal");
	}
	
	public void contestHeading_confirmationPage() throws Exception{
		doubleclick(By.cssSelector(prop.AddContest("presslaff_contest_addcontest_pagewizard_contest_heading_css")));
	}
	public void contest_PW_confirmation_ckeditor(String cheader2)throws Exception
	{
		SwitchToFrame(findElement(By.tagName(prop.AddContest("presslaff_contest_addcontest_ckeditor_tag"))));
		findElement(By.cssSelector(prop.AddContest("presslaff_contest_addcontest_body_css"))).clear();
		type(By.cssSelector(prop.AddContest("presslaff_contest_addcontest_body_css")),cheader2);
		driver.switchTo().defaultContent();
	}
	public void verifyPW_Confirmation_Contest_Header(String cheader2) throws Exception {
		String pw_ConfirmationPageHeader = findElement(By.cssSelector(prop.AddContest("presslaff_contest_addcontest_pagewizard_login_header_name_css"))).getText();
		//System.out.println(pw_LoginPageHeader);
		if(pw_ConfirmationPageHeader.equalsIgnoreCase(cheader2)){
			System.out.println("PageWIzard Confirmation Page Header Entered");		
	} else  fail("Element not Equal");
	}
	
	public void openSureveyLink() throws Exception{
		linkInNewWIndow(By.cssSelector(prop.AddContest("presslaff_contest_addcontest_surveylink_css")));
	}

	public boolean frontPage_login(String cheader1) throws Exception{
		String parentWindow = driver.getWindowHandle();
		Set<String> handles =  driver.getWindowHandles();
		   for(String windowHandle  : handles)
		       {
		       if(!windowHandle.equals(parentWindow))
		          {
		          driver.switchTo().window(windowHandle);
		       //Perform your operation here for new window-->
		          Thread.sleep(3000);
		          driver.manage().window().maximize();
		          isElementPresent(By.xpath(prop.AddContest("presslaff_contest_addcontest_frontpage_login_xpath")));
		        
		         
		        // driver.switchTo().window(parentWindow);
		          }
		       }
		return true;
		
	}
	
	public void fillEmailid(String getmail) throws Exception{
		String getmail1=getTimeStamp()+"@gmail.com";
		type(By.cssSelector(prop.AddContest("presslaff_contest_addcontest_frontpage_login_email_css")),getmail1);
	}
	public void front_LoginSubmit() throws Exception{
		click(By.cssSelector(prop.AddContest("presslaff_contest_addcontest_frontpage_login_enter_css")));
		
	}
	

	public void front_RegistrationHeader(String cheader) throws Exception {
		String front_reg_Header = findElement(By.cssSelector(prop.AddContest("presslaff_contest_addcontest_frontpage_registration_header_css"))).getText();
		if(front_reg_Header.equalsIgnoreCase(cheader)){
			System.out.println("Front page - Regidtration page dispalyed");		
	} else  fail("Element not Equal");
	}
	
	public void front_Registration_type_firstname() throws Exception {
		type(By.name(prop.AddContest("presslaff_contest_addcontest_frontpage_registration_firstname_name")),getTimeStamp());
	}
	public void front_Registration_type_lastname() throws Exception {
		type(By.name(prop.AddContest("presslaff_contest_addcontest_frontpage_registration_lastname_name")),getTimeStamp());
	}
	public void front_Registration_Select_Gender() throws Exception{
		//findElement(By.cssSelector(prop.AddContest("presslaff_contest_addcontest_pagewizard_contest_heading_css"))).se
		selectBy(By.cssSelector(prop.AddContest("presslaff_contest_addcontest_frontpage_registration_gender_css")),"Male");	
	}
	public void front_Registration_Select_DOB() throws Exception{
		selectBy(By.name(prop.AddContest("presslaff_contest_addcontest_frontpage_registration_DOBMonth_name")),"Jan");
		selectBy(By.name(prop.AddContest("presslaff_contest_addcontest_frontpage_registration_DOBDay_name")),"7");
		selectBy(By.name(prop.AddContest("presslaff_contest_addcontest_frontpage_registration_DOBYear_name")),"1989");
		
	}
	public void front_Registration_Select_optin() throws Exception{
		selectBy(By.id(prop.AddContest("presslaff_contest_addcontest_frontpage_registration_localoptin_id")),"Yes");
	}
	
	public void front_RegSubmit() throws Exception{
		click(By.name(prop.AddContest("presslaff_contest_addcontest_frontpage_registration_submit_name")));
		
	}
	public void front_ConfirmationHeader(String cheader2) throws Exception {
		String parentWindow = driver.getWindowHandle();
		Set<String> handles =  driver.getWindowHandles();
		   for(String windowHandle  : handles)
		       {
		       if(!windowHandle.equals(parentWindow))
		          {
		    	   //windowHandle is data e base page here
		    	   //parent is confirmation front pahe here
		       //Perform your operation here for new window-->
		          Thread.sleep(3000);
		
		          String front_confirmation_Header = findElement(By.cssSelector(prop.AddContest("presslaff_contest_addcontest_frontpage_registration_header_css"))).getText();
		  		if(front_confirmation_Header.equalsIgnoreCase(cheader2)){
		  			System.out.println("Front page - confirmation page dispalyed");		
		  	} else  fail("Element not Equal");
		  		 driver.switchTo().window(windowHandle);
		  	}
		       }
	}
		     

	
public void click_OneClickContest() throws Exception{
	click(By.linkText(prop.AddContest("presslaff_contest_contestname_linkText")));
	
}


public  Alert alert() throws Exception {
	stepName = "Handling alert";
	try
    {
            Alert alert = driver.switchTo().alert();
            // if present consume the alert
            alert.accept();

            return alert;
    }
    catch (NoAlertPresentException ex)
    {
        // Alert not present
    	return null;
    }

}


	public void delete()throws Exception
	{
		click(By.id(prop.AddContest("presslaff_contest_addcontest_delete_id")));
	}

	 
}


