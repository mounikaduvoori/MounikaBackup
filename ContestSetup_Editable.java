package com.qa.ui;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import atu.testng.reports.ATUReports;

import com.qa.common.ReadfromProperties;
import com.qa.keyword.Keywords;

public class ContestSetup_Editable extends Keywords {
	ReadfromProperties prop = new ReadfromProperties();

	public ContestSetup_Editable(WebDriver driver) {
		super(driver);
	}
	
	//Click on setup under contest module
	public void click_Setup() throws Exception {
		stepName = "Click_Setup";
		click(By.linkText(prop.contestSetup_Editable("contest_setup_linkText")));		
	}
	
	// Getting the title of page
	public void Title()throws Exception{
		stepName="Page Title";
		getWindowtitle();	
	}
	
	//
	public void click_AddContest() throws Exception {
		stepName = "Click_AddContest";
		click(By.linkText(prop.contestSetup_Editable("contest_setup_addContest_linkText")));		
	}
	
	//Verifying the contest setup page and buttons
	public void verify_contestSetupPageAndBtns()throws Exception
	{
		
		stepName="Verify contest setup page and buttons";
		System.out.println("Contest Setup Page validation");
		findElement(By.linkText(prop.contestSetup_Editable("contest_setup_addContest_logo_linkText")));
		findElement(By.cssSelector(prop.contestSetup_Editable("contest_setup_newsLetters_css")));
		findElement(By.cssSelector(prop.contestSetup_Editable("contest_setup_fbshare_css")));
		findElement(By.cssSelector(prop.contestSetup_Editable("contest_setup_t_Heading_css")));
		findElement(By.cssSelector(prop.contestSetup_Editable("contest_setup_Teaser_css")));
		findElement(By.cssSelector(prop.contestSetup_Editable("contest_setup_Participated_css")));
		findElement(By.cssSelector(prop.contestSetup_Editable("contest_setup_Rules_css")));
		findElement(By.tagName(prop.contestSetup_Editable("contest_setup_ckeditor_tag")));
		findElement(By.cssSelector(prop.contestSetup_Editable("contest_setup_save_css")));		
	}
	public boolean isContestSetupPageAndBtns() throws Exception {
		isElementPresent(By.linkText(prop.contestSetup_Editable("contest_setup_addContest_logo_linkText")));
		isElementPresent(By.cssSelector(prop.contestSetup_Editable("contest_setup_newsLetters_css")));
		isElementPresent(By.cssSelector(prop.contestSetup_Editable("contest_setup_fbshare_css")));
		isElementPresent(By.cssSelector(prop.contestSetup_Editable("contest_setup_t_Heading_css")));
		isElementPresent(By.cssSelector(prop.contestSetup_Editable("contest_setup_Teaser_css")));
		isElementPresent(By.cssSelector(prop.contestSetup_Editable("contest_setup_Participated_css")));
		isElementPresent(By.cssSelector(prop.contestSetup_Editable("contest_setup_Rules_css")));
		isElementPresent(By.tagName(prop.contestSetup_Editable("contest_setup_ckeditor_tag")));
		isElementPresent(By.cssSelector(prop.contestSetup_Editable("contest_setup_save_css")));	
		return true;
	}
	
	// Type Contest name
    public void type_Contestname(String contestName) throws Exception {
			stepName = "Type_Contestname";			
			type(By.cssSelector(prop.contestSetup_Editable("contest_addContest_contestName_css")),contestName);
		}
    
    //Select contest type as Editable
    public void select_ContestType(String contestType) throws Exception {
		stepName = "Type_ContestType";	
		Select value = new Select(driver.findElement(By.name("ContestType")));
		value.selectByVisibleText("Editable");
	}
    
    //Remove the autofilled startDate.
    public void clear_StartDate() throws Exception {
		stepName = "clear start date";			
		driver.findElement(By.cssSelector(prop.contestSetup_Editable("contest_addContest_startDate_css"))).clear();
	}
    
    // Enter start Date
    /*public void enter_StartDate() throws Exception {
	stepName = "clear start date";			
	driver.findElement(By.cssSelector(prop.contestSetup_Editable("contest_setup_startDate_css")));
    }*/
    
    //Start date
    public void sdate(String startDate) throws Exception{
 	   
    	type(By.cssSelector(prop.contestSetup_Editable("contest_addContest_startDate_css")),	startdate());
    }
    
    //End date
   public void edate(String endDate)throws Exception{
	   stepName = "Enter End Date";
	   type(By.cssSelector(prop.contestSetup_Editable("contest_addContest_endDate_css")),enddate());
	   
   }

      
   //Enter end date
   /* public void enter_EndDate(String endDate) throws Exception {
		stepName = "Enter End Date";			
		type(By.cssSelector(prop.contestSetup_Editable("contest_setup_endDate_css")),endDate);
	}
    */
   
    //Verify never ends
    public void verify_neverEnds() throws Exception {
		stepName = "verify neverEnds and end date";			
		click(By.cssSelector(prop.contestSetup_Editable("contest_addContest_endTime_neverEnds_css"))); 	
	}
    
    //Verify enddate
    public boolean verify_enddate() throws Exception{
    	stepName="verify the end date was disabled or not";
    	boolean actual=driver.findElement(By.cssSelector("contest_addContest_endDate_css")).isEnabled();
		return actual;
    	
    }
    
    
    
    //Multiple entries
    public void multipleEntries_hourly() throws Exception {
    stepName = "Multiple Entries_Hourly";
	click(By.cssSelector(prop.contestSetup_Editable("contest_addContest_multipleentries_hourly_css")));
	ATUReports.add(stepName,"Check Hourly","Hourly checkbox should be checked"," checked", true);
	}
    
    
    
    
    //Enter text at Heading
    public void contest_Heading(String headingText) throws Exception {
		stepName = "Enter text at Heading";
		//SwitchToFrame(findElement(By.tagName(prop.contestSetup_Editable("contest_setup_ckeditor_tag"))));
		type(By.cssSelector(prop.contestSetup_Editable("contest_setup_ckeditor_body_css")),headingText);
		//driver.switchTo().defaultContent();
	}
    
    //Save the contest without entering start Date
    public void save_contest() throws Exception {
		stepName = "Save contest";
		click(By.cssSelector(prop.contestSetup_Editable("contest_addContest_save_css")));
    }
   
   //Verify the error message as " The following error(s) occurred Start Date must be entered."
    public boolean verify_SDErrrMsg() throws Exception{
    		 String actual_msg=driver.findElement(By.cssSelector("div.left40:nth-of-type(2)")).getText();
		    	System.out.println(actual_msg);
		    	Assert.assertEquals("The following error(s) occurred" + "\n" + "Start Date must be entered.", actual_msg);
				return true;
    }
    
  //Verify the error message as " The following error(s) occurred End Date must be entered."
    public boolean verify_EDErrrMsg() throws Exception{
    		 String actual_msg=driver.findElement(By.cssSelector("div.left40:nth-of-type(2)")).getText();
		    	System.out.println(actual_msg);
		    	Assert.assertEquals("The following error(s) occurred" + "\n" + "End Date must be entered.", actual_msg);
				return true;
    }
  //Verify the error message as " The following error(s) occurred contest name must be entered."
    public boolean verify_CNErrrMsg() throws Exception{
    		 String actual_msg=driver.findElement(By.cssSelector("div.left40:nth-of-type(2)")).getText();
		    	System.out.println(actual_msg);
		    	Assert.assertEquals("The following error(s) occurred" + "\n" + "The Contest Name must be entered.", actual_msg);
				return true;
    }
  //Verify the error message as " The following error(s) occurred The Contest Name must be entered. Start Date must be entered.End Date must be entered."
    public boolean verify_Errmsg_BlankData() throws Exception{
    		 String actual_msg=driver.findElement(By.cssSelector("div.left40:nth-of-type(2)")).getText();
		     System.out.println(actual_msg);
		     Assert.assertEquals("The following error(s) occurred" + "\n" + "The Contest Name must be entered." 
		    	                                                      + "\n" + "Start Date must be entered." 
		    			                                              + "\n" + "End Date must be entered.", actual_msg);
              return true;
   }
  /*//Verify the error message as " The following error(s) occurred An Editable Contest can only have an Allow Multiple Entries setting of 'Once'."
    public boolean verify_pageWizardpage() throws Exception{
		     Assert.assertEquals("The following error(s) occurred" + "\n" + "An Editable Contest can only have an Allow Multiple Entries setting of 'Once'.");
			return true;
    }*/
    
    public void verifypagesource() throws Exception
    {
    	String Source = driver.getPageSource( );
    	Source.contains("Dat-e-Base - Tester - Admin - Main Menu"); 
    	//assertTrue(Source.contains("Dat-e-Base - Tester - Admin - Main Menu"));
    	
    }
	//Verify the link and menu buttons 
    public void verify_contestLinkAndBtns()throws Exception
	{
		
		stepName="Verify contest link and buttons";
		System.out.println("Contest link and buttons validation");
		findElement(By.linkText(prop.contestSetup_Editable("contest_addContest_save_AddQuestion_linkText")));
		findElement(By.linkText(prop.contestSetup_Editable("contest_addContest_save_pages_linkText")));
		findElement(By.linkText(prop.contestSetup_Editable("contest_addContest_save_pageWizard_linkText")));
		findElement(By.linkText(prop.contestSetup_Editable("contest_addContest_save_ConfirmationEmail_linkText")));
		findElement(By.linkText(prop.contestSetup_Editable("contest_addContest_save_BacktoContests_linkText")));
		findElement(By.linkText(prop.contestSetup_Editable("contest_addContest_save_Filters_linkText")));
		findElement(By.cssSelector(prop.contestSetup_Editable("contest_addContest_save_surveyLink_css")));
		
	}
	public boolean isContestLinkAndBtns() throws Exception {
		isElementPresent(By.linkText(prop.contestSetup_Editable("contest_addContest_save_AddQuestion_linkText")));
		isElementPresent(By.linkText(prop.contestSetup_Editable("contest_addContest_save_pages_linkText")));
		isElementPresent(By.linkText(prop.contestSetup_Editable("contest_addContest_save_pageWizard_linkText")));
		isElementPresent(By.linkText(prop.contestSetup_Editable("contest_addContest_save_ConfirmationEmail_linkText")));
		isElementPresent(By.linkText(prop.contestSetup_Editable("contest_addContest_save_BacktoContests_linkText")));
		isElementPresent(By.linkText(prop.contestSetup_Editable("contest_addContest_save_Filters_linkText")));
		isElementPresent(By.cssSelector(prop.contestSetup_Editable("contest_addContest_save_surveyLink_css")));
		return true;
	}
	
	
	//saifhuihaf
	
	public void imageverify()
	 {
	  
	   WebElement ImageFile =driver.findElement(By.xpath(".//*[@id='r64']//img)[64]"));
	          
	          Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile);
	          if (!ImagePresent)
	          {
	               System.out.println("Image not displayed.");
	          }
	          else
	          {
	              System.out.println("Image displayed.");
	          }
	   }
	
	
	
	
	//Click pageWizard Button
	public void click_pageWizard() throws Exception {
		stepName = "Clcik on page wizard";
		click(By.linkText(prop.contestSetup_Editable("contest_addContest_save_pageWizard_linkText")));
    }
	
	
    
    //Double click on image
	/*public void doubleClick() throws Exception {
		stepName="Double click";
		String parentHandle = driver.getWindowHandle(); // get the current window handle
		
		Actions action = new Actions(driver);
		WebElement element=driver.findElement(By.cssSelector("#c1-bannerimg"));

		//Double click
		action.doubleClick(element).perform();
		
		for (String winHandle : driver.getWindowHandles()) {
		    driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
		}
		
        WebElement subElement =driver.findElement(By.xpath("//*[@id='r1_label'][@linkText='130x41(2).jpg']"));
	   
       
      // action.moveToElement(subElement);
 
        action.doubleClick(subElement).perform();
	
	
	    driver.close(); // close newly opened window when done with it
	    driver.switchTo().window(parentHandle); // switch back to the original window  
	    }  
*/	
	public boolean isPageWizardOpened() throws Exception
	{
		isElementPresent(By.id(prop.contestSetup_Editable("contest_addcontest_pagewizard_page_PW_page_id")));
		return true;
	}
	public void bannerimage() throws Exception
	{
		doubleclick(By.cssSelector(prop.contestSetup_Editable("contest_setup_save_pageWizard_image_css")));
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
		          SwitchToFrame(findElement(By.tagName(prop.contestSetup_Editable("contest_addcontest_ckeditor_tag"))));
		          Thread.sleep(3000);
		          doubleclick(By.cssSelector(prop.contestSetup_Editable("contest_addcontest_pagewizard_snowmuchfun_css")));
		        Thread.sleep(3000);
		        doubleclick(By.cssSelector(prop.contestSetup_Editable("contest_addcontest_pagewizard_snowmuchfun_css")));
		         driver.switchTo().window(parentWindow); //cntrl to parent presslaff_contest_addcontest_pagewizard_snowmuchfun_xpath
		          }
		       }
		//driver.switchTo().window(By.id(prop.AddContest("presslaff_contest_addcontest_pagewizard_ckfinder_id");
		
	}
	
	public void addContestHeading() throws Exception
	{
		doubleclick(By.cssSelector(prop.contestSetup_Editable("contest_addcontest_pagewizard_Heading_css")));
	}
	
	public boolean isPW_UploadBanner() throws Exception{
		isElementPresent(By.xpath(prop.contestSetup_Editable("contest_addcontest_pagewizard_image_xpath")));
		return true;
	}
	public String getsourceOfBanner_ContestPage() throws Exception{
		WebElement img = driver.findElement(By.id(prop.contestSetup_Editable("contest_addcontest_pagewizard_c1_bannerimg_id")));
		String src_contestpage = img.getAttribute("src");
		return src_contestpage;
		//System.out.println(src);
	}
	
	
	
}
