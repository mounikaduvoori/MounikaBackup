package com.qa.ui;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import atu.testng.reports.ATUReports;
import atu.testng.reports.logging.LogAs;
import atu.testng.selenium.reports.CaptureScreen;
import atu.testng.selenium.reports.CaptureScreen.ScreenshotOf;

import com.qa.common.ReadfromProperties;
import com.qa.keyword.Keywords;

public class EmailCampaign_rgn extends Keywords {

	public static WebElement option = null;
	ReadfromProperties prop = new ReadfromProperties();

	public EmailCampaign_rgn(WebDriver driver) {
		super(driver);
	}

	// Click on Campaigns module
	public void click_Addnew() throws Exception {
		stepName = "Click Addnew";
		click(By.linkText(prop.getcampaignmodproperty("campaign_Addnew_linktext")));
		Boolean b = isResponsiveDesignTemplate();
		String actual = String.valueOf(b);
		try{
			ATUReports.add("Add new Page", "Click Add new",  "Dat-e-Base - Tester - Admin - E-mail Broadcast", actual, LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		}
		catch(Exception e)
		{
			ATUReports.add("Add new Page", "Click Add new",  "Dat-e-Base - Tester - Admin - E-mail Broadcast", actual , LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		}
	}

	// Getting the title of page
	public void title() throws Exception {
		stepName = "Page Title";
		getWindowtitle();
	}

	// Enter session name

	public void type_sessionname(String sesname) throws Exception {
		stepName = "Type_sessionname";
		type(By.id(prop.EmailCampaign_Rgn("campaigns_Addnew_sessionname_id")),sesname);
	}

	// Enter subject
	public void type_subject(String sub) throws Exception {
		stepName = "Type_subject";	
		type(By.id(prop.EmailCampaign_Rgn("campaigns_Addnew_subject_id")), sub);
	}

	// FriendlyFrom will automatically filled with data.if we want, we can edit this with our details
	public void type_friendlyfrm(String frdfrm) throws Exception {
		stepName = "Type_friendlyfrom";	
		type(By.id(prop.EmailCampaign_Rgn("campaigns_Addnew_fwd2friend_name")),frdfrm);
	}

	// Forward To Friend will automatically filled with data.if we want, we canedit this with our id
	@SuppressWarnings("deprecation")
	public void click_AddforwordToFriend() throws Exception {
		stepName = "Add Forward to friend";
		click(By.name(prop.EmailCampaign_Rgn("campaigns_Addnew_fwd2friend_name")));
		ATUReports.add(stepName,"Check Add FTF","FTF should be checked","FTF is checked", true);
	}

	// Select responsive design template
	public void choose_ResponsiveDesignTemplate() throws Exception {
		stepName = "Choose Responsive Design Template";
		click(By.xpath(prop.EmailCampaign_Rgn("campaigns_Addnew_template_A1_xpath")));
		getWindowtitle();
		try{
			ATUReports.add("Choose Responsive Design Template", "Click A1 Template","Dat-e-Base - Tester - Admin - Edit Email Master Template",getWindowtitle(), LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		}
		catch(Exception e)
		{
			ATUReports.add("Choose Responsive Design Template", "Click A1 Template","Dat-e-Base - Tester - Admin - Edit Email Master Template",getWindowtitle(), LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		}
	}

	// Verify that the template belongs to Responsive design template or not
	public boolean isResponsiveDesignTemplate() throws Exception {
	    stepName = "A1ResponsiveDesignTemplate";
		boolean status = isElementPresent(By.xpath(prop.EmailCampaign_Rgn("campaigns_Addnew_template_A1_xpath")));
		return status;
	}

	// Verifying content blocks
	public boolean verify_contentblocks() throws Exception {
		stepName = "verifying content blocks";
		
		isElementPresent(By.xpath(prop
				.EmailCampaign_Rgn("campaigns_Addnew_content1_xpath")));
		isElementPresent(By.xpath(prop
				.EmailCampaign_Rgn("campaigns_Addnew_content2_xpath")));
		isElementPresent(By.xpath(prop
				.EmailCampaign_Rgn("campaigns_Addnew_content3_xpath")));
		isElementPresent(By.xpath(prop
				.EmailCampaign_Rgn("campaigns_Addnew_content4_xpath")));
		isElementPresent(By.xpath(prop
				.EmailCampaign_Rgn("campaigns_Addnew_content5_xpath")));
		isElementPresent(By.xpath(prop
				.EmailCampaign_Rgn("campaigns_Addnew_content6_xpath")));
		return true;
	}

	// Select A1 Template and contents
    public void write_content1(String cont1, String cont2, String cont3,
			String cont4, String cont5, String cont6) throws Exception {
    	String cont = null;
    	
 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);		
		WebElement selectElement = driver.findElement(By.xpath(prop
				.EmailCampaign_Rgn("campaigns_Addnew_selectcontent_xpath")));
		Select select = new Select(selectElement);
		Thread.sleep(3000l);
		List<WebElement> listOfContents = select.getOptions();
		System.out.println("size" + listOfContents.size());
		int i;
		for (i = 1; i < listOfContents.size(); i++) {
			
			Thread.sleep(3000l);
			try{
			driver.findElements(By.xpath(prop.EmailCampaign_Rgn("campaigns_Addnew_selectcontent_dropdown_xpath"))).get(i).click();
			switch (i) {
			case 1:
				stepName = "Content1 block";
				ckeditor(cont1);
				save_ckcontent();
				driver.switchTo().activeElement();
				String actual1 = driver.findElement(By.xpath(prop.EmailCampaign_Rgn("campaigns_Addnew_contentblock1_xpath"))).getText();
				
				ATUReports.add("Content" + i + "Validation", "Selecting content" + i,  "Content"+i +"data should be saved", actual1 , LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				
			
				break;
			case 2:
				stepName = "Content2 block";
				ckeditor(cont2);
				save_ckcontent();
				driver.switchTo().activeElement();
			
                String actual2 = driver.findElement(By.xpath(prop.EmailCampaign_Rgn("campaigns_Addnew_contentblock2_xpath"))).getText();
				
				ATUReports.add("Content" + i + "Validation", "Selecting content" + i,  "Content"+i +"data should be saved", actual2 , LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				
				break;
			case 3:
				stepName = "Content3 block";
				ckeditor(cont3);
				save_ckcontent();
				driver.switchTo().activeElement();
				
                String actual3 = driver.findElement(By.xpath(prop.EmailCampaign_Rgn("campaigns_Addnew_contentblock3_xpath"))).getText();
				
				ATUReports.add("Content" + i + "Validation", "Selecting content" + i,  "Content"+i +"data should be saved", actual3 , LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				
				break;
			case 4:
				stepName = "Content4 block";
				ckeditor(cont4);
				save_ckcontent();
				driver.switchTo().activeElement();
				
                String actual4 = driver.findElement(By.xpath(prop.EmailCampaign_Rgn("campaigns_Addnew_contentblock4_xpath"))).getText();
				
				ATUReports.add("Content" + i + "Validation", "Selecting content" + i,  "Content"+i +"data should be saved", actual4 , LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				
				break;
			case 5:
				stepName = "Content5 block";
				ckeditor(cont5);
				save_ckcontent();
				driver.switchTo().activeElement();
				
                String actual5 = driver.findElement(By.xpath(prop.EmailCampaign_Rgn("campaigns_Addnew_contentblock5_xpath"))).getText();
				
				ATUReports.add("Content" + i + "Validation", "Selecting content" + i,  "Content"+i +"data should be saved", actual5 , LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				
				break;
			case 6:
				stepName = "Content6 block";
				ckeditor(cont6);
				save_ckcontent();
				driver.switchTo().activeElement();
				
                String actual6 = driver.findElement(By.xpath(prop.EmailCampaign_Rgn("campaigns_Addnew_contentblock6_xpath"))).getText();
				
				ATUReports.add("Content" + i + "Validation", "Selecting content" + i,  "Content"+i +"data should be saved", actual6 , LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				
				break;

			}	
			}
			
			/*//String actual = driver.findElement(By.xpath(prop.EmailCampaign_Rgn("campaigns_Addnew_contentblock_xpath"))).getText();
		
			
			ATUReports.add("Content" + i + "Validation", "Selecting content" + i,  "Content"+i +"data should be saved", actual , LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			}*/
		
			catch(Exception e)
			{
				String actual = driver.findElement(By.xpath(prop.EmailCampaign_Rgn("campaigns_Addnew_contentblock1_xpath"))).getText();
				
				ATUReports.add("Content" + i + "Validation", "Selecting content" + i,  "Content"+i +"data should be saved", actual , LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			}
		}
		}
	

	// Select contents from dropdown list
	public void select_content(String name) throws Exception {
		//stepName ="Select content  dropdownlist and writing content messages";
		
		findElement(By.xpath(prop
				.EmailCampaign_Rgn("campaigns_Addnew_selectcontent_xpath")));
		selectByVisibleText(By.cssSelector(prop
				.EmailCampaign_Rgn("campaigns_Addnew_selectcontent_css")), name);
		
	}

	// Open editor to customize contents
	public void ckeditor(String content) throws Exception {
		stepName = "ck editor";
		
		driver.switchTo().frame(0);
		type(By.tagName(prop.EmailCampaign_Rgn("campaign_ckeditor_content_tag")),content);
		driver.switchTo().defaultContent();
		//Inputreport("Select content  dropdownlist and writing content messages",content,"Content");
	}

	// Save the content and return to page
	public void save_ckcontent() throws Exception {
		stepName = "Save and Return the content messages";
		
		click(By.id(prop.EmailCampaign_Rgn("Campaign_ckeditor_saveandreturn_id")));
		//reportclick(stepName);
	}

	// To Click on save option after filling all the fields and contents
	public void click_save() throws Exception {
		//stepName = "Save all the fields and contents";
		
		click(By.xpath(prop.EmailCampaign_Rgn("campaigns_Addnew_selectcontent_save_id")));
		//reportclick(stepName);
		
	}

	// To click on filters
	public void click_filters() throws Exception {
		stepName = "Filters";
		click(By.xpath(prop.EmailCampaign_Rgn("campaigns_Addnew_Filters_xpath")));
		
		getWindowtitle();			
		try{
		   ATUReports.add("Filters Page", "Click on Filters",  "Dat-e-Base - Tester - Admin - Email Broadcast - Filters", getWindowtitle() , LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
	    }
	    catch(Exception e){
		   ATUReports.add("Filters Page", "Click on Filters", "Dat-e-Base - Tester - Admin - Email Broadcast - Filters", getWindowtitle() , LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));			
	    }
		
	}

	// To click on email address and enter valid address
	public void enter_EmailAddress(String email) throws Exception {
		stepName = "Typing email address";
		
		type(By.xpath(prop.EmailCampaign_Rgn("campaigns_Addnew_Filters_EmailAddress_xpath")),email);
	
	}

	// Save email address
	public void save_emailAddress() throws Exception {
		stepName = "Saving email address";
		
		click(By.cssSelector(prop.EmailCampaign_Rgn("campaigns_Addnew_Filters_save_css")));
		//reportclick(stepName);
		
	}

	// To click on Back To Email
	public void backToEmail() throws Exception {
		stepName = "Back to email";
		click(By.linkText(prop.EmailCampaign_Rgn("campaigsn_Addnew_Filters_BackToEmail_linktext")));
		
		getWindowtitle();			
		try{
		   ATUReports.add("Back To Email  Page", "Click on Back to email","Dat-e-Base - Tester - Admin - Edit Email Master Template", getWindowtitle() , LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
	    }
	    catch(Exception e){
		   ATUReports.add("Back To Email  Page",  "Click on Back to email","Dat-e-Base - Tester - Admin - Edit Email Master Template", getWindowtitle() , LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));			
		}
	
	}

	// Verify that the send count should be 1
	public boolean verify_SendCount() throws Exception {
		stepName = "Verifying Send count";
		
		isElementPresent(By.xpath(prop.EmailCampaign_Rgn("campaigns_Addnew_Sendcount_xpath")));
		return true;
		
	}

	// To click on send date
	public void click_sendDate() throws Exception {
		stepName = "Send date";
		
		click(By.xpath(prop.EmailCampaign_Rgn("campaigns_Addnew_SendDate_xpath")));
	}

	// To enable sendNow check box
	public void enable_sendNow() throws Exception {
		stepName = "Enable send now check box";
		
		click(By.cssSelector(prop.EmailCampaign_Rgn("campaigns_Addnew_SendDate_SendNow_css")));
	}

	// To click on save button
	public void save_sendNow() throws Exception {
		stepName = "Save/Send the email address";
		
		click(By.cssSelector(prop.EmailCampaign_Rgn("campaigns_Addnew_SendDate_SendNow_save_css")));
	}

	// To click on ok in popup message
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

		/*
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();*/
	}

	// To click on Sent Email
	public void sent_email() throws Exception {
		stepName = "Sent email";
		click(By.linkText(prop.EmailCampaign_Rgn("campaigns_Sentemail_linktext")));
		
		getWindowtitle();			
		try{
		   ATUReports.add("Sent Email Page","Click on sent email", "Dat-e-Base - Tester - Admin - Old E-mail Broadcast", getWindowtitle() , LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
	    }
	    catch(Exception e){
		   ATUReports.add("Sent Email Page","Click on sent email", "Dat-e-Base - Tester - Admin - Old E-mail Broadcast", getWindowtitle() , LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
        }
	}

	// Verify session name
	/*public boolean verify_SessionName() throws Exception {
		stepName = "Verify Sessionname";
		
		isElementPresent(By.xpath(prop.EmailCampaign_Rgn("campaigns_Sentemail_sessionName_xpath")));
		return true;
	}*/

	// Verify sent count
	public boolean verify_SC() throws Exception {
		stepName = "Verify Sent Count";
		
		isElementPresent(By.xpath(prop.EmailCampaign_Rgn("campaigns_Sentemail_sendCount_xpath")));
		return true;
	}

	// To Reanimate the session
	public void reAnimate() throws Exception {
		stepName = "ReAnimate the session name";
		click(By.xpath(prop.EmailCampaign_Rgn("campaings_Sentemail_Reanimate_xpath")));
		
		getWindowtitle();			
		try{
		   ATUReports.add("Reanimating email","Click on Reanimate","Dat-e-Base - Tester - Admin - Edit Email Master Template", getWindowtitle() , LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
	    }
	   catch(Exception e){
		   ATUReports.add("Reanimating email", "Click on Reanimate","Dat-e-Base - Tester - Admin - Edit Email Master Template", getWindowtitle() , LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));	
	    }
	}

	// To rename the session name
	public void Rename_sessionname(String sesname1) throws Exception {
		stepName = "Reenter_sessionname";
		
		driver.findElement(
		By.name(prop.EmailCampaign_Rgn("campaigns_Addnew_sessionname_name"))).clear();
		type(By.name(prop.EmailCampaign_Rgn("campaigns_Addnew_sessionname_name")),sesname1);
		
	}

	// To save the changes
	public void save_RenamedSession() throws Exception {
		stepName = "Save Reentered sessionname";
		
		click(By.xpath(prop.EmailCampaign_Rgn("campaigns_Addnew_sessionname_save_xpath")));
		
	}

	// To go to campaigns
	public void click_campaigns() throws Exception {
		stepName = "Click Campaigns";
		
		click(By.linkText(prop.getHomepageProperty("Home_campaign_linktext")));
		
	}

	// verify reentered session name
	public boolean verify_Reentered_SN() throws Exception {
	
		isElementPresent(By.linkText(prop
				.EmailCampaign_Rgn("campaigns_Sentemail_sessionName_linktext")));
		return true;
	}

	public void click_new_sessionname() throws Exception {
		stepName = "Select Reentered session name in campaigns list";
		
		click(By.linkText(prop
				.EmailCampaign_Rgn("campaigns_Sentemail_sessionName_linktext")));
		
	}

	// To delete a session
	public void delete_session() throws Exception {
		stepName = "Delete session";
		
		click(By.cssSelector(prop
				.EmailCampaign_Rgn("campaigns_Addnew_Delete_css")));
		
	}

	// Click on "yes" to conform delete a session
	public void click_yes() throws Exception {
		stepName = "Confirm deleting with Yes";
		
		click(By.linkText(prop
				.EmailCampaign_Rgn("campaigns_Addnew_Delete_yes_linktext")));
		
	}

	// Verifying that the session was deleted or not
	public void delete_conformMsg() throws Exception {
		stepName = "Verify session was deleted or not";
		click(By.linkText(prop.EmailCampaign_Rgn("campaigns_Addnew_Delete_yes_linktext")));
		ATUReports.add(stepName,"Click on Yes","session should be deleted","AUT has been deleted.", true);
		
	}

	// verify the deleted session name in campaigns
	public boolean verify_Deleted_email() throws Exception {
		stepName = "verifying deleted session name in campaigns";
	
		isElementPresent(By.xpath(prop.EmailCampaign_Rgn("campaigns_xpath")));
		return true;
	}
 
	//logout
	public void logoutTitle()throws Exception
	{
		stepName="Log out";
		getWindowtitle();			
		try{
		ATUReports.add("Logout Page Validation","Click on logout",  "Dat-e-Base - Admin Log Off Page", getWindowtitle() , LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
	}
	catch(Exception e)
	{
		ATUReports.add("Logout Page Validation", "Click on logout", "Dat-e-Base - Admin Log Off Page", getWindowtitle() , LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));			
	
	}
	}	
	// To logout from tester property
	public void logout() throws Exception {
		stepDescription = "Logout from Dat-e-Base";
		
		click(By.linkText(prop.getHomepageProperty("Home_LOGOUT_linktext")));
		
	}
	
	
	/*@SuppressWarnings("deprecation")
	public void Inputreport(String Step,String input ,String Expected,String actual){
		
		ATUReports.add(Step, input, Expected,actual, true);
	}
	
	@SuppressWarnings("deprecation")
	public void reportclick(String report) throws InterruptedException{
		ATUReports.add(report, true);
		}*/

}
