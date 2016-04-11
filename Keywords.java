package com.qa.keyword;

/*import static org.monte.media.FormatKeys.EncodingKey;
import static org.monte.media.FormatKeys.FrameRateKey;
import static org.monte.media.FormatKeys.KeyFrameIntervalKey;
import static org.monte.media.FormatKeys.MIME_AVI;
import static org.monte.media.FormatKeys.MediaTypeKey;
import static org.monte.media.FormatKeys.MimeTypeKey;
import static org.monte.media.VideoFormatKeys.CompressorNameKey;
import static org.monte.media.VideoFormatKeys.DepthKey;
import static org.monte.media.VideoFormatKeys.ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE;
import static org.monte.media.VideoFormatKeys.QualityKey;*/
import static org.testng.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
//import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriverBackedSelenium;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import atu.testng.reports.ATUReports;
import atu.testng.reports.logging.LogAs;
import atu.testng.selenium.reports.CaptureScreen;
import atu.testng.selenium.reports.CaptureScreen.ScreenshotOf;

public class Keywords {

	public static String testName;
	public static String stepName;
	public static String stepDescription;
	public static String inputvalue;
	public static String Expected;
	public static String Actual;
	public static String screenshotPath;
	public static String className;
	

	public WebDriver driver;
/*	private static Logger logs = Logger.getLogger("keywords.class");*/
	
	
	public Keywords(WebDriver driver)
	{
		this.driver = driver;
	}

	public String date1() 
	{ // Universal Timing format GMT
		Date d = new Date();
		String date=d.toString().replaceAll(" ", "_");
		date=date.replaceAll(":", "_");
		date=date.replaceAll("\\+", "_");
		//System.out.println(date1);
		return date;
	}

	public static String date2() { // local Time Format
		String myformat = "dd_MM_yyyy_HH_mm_ss";
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(myformat);
		String date = sdf.format(cal.getTime());
		//System.out.println(date2);
		return date;
	}
    
	
	static int IncSS = 1;
	
	public void TakeScreenshot(String Filename) throws Exception	{
		//System.out.println("Screenshot path:"+screenshotPath);
		//System.out.println("testName:"+testName);
		//System.out.println("stepName:"+stepName);
		
		
		System.out.println("inside screenshots"+screenshotPath+className+"_"+testName+"_"+stepName);
		
		try{
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String timestamp = getTimeStamp();
			System.out.println("takeScreenshot in screenshot method"+timestamp);
			
					
			File imgFile= new File(screenshotPath+className+"_"+testName+"_"+stepName+"_"+timestamp+".png");
			FileUtils.copyFile(scrFile, imgFile);
			Reporter.log("<a href=\""+screenshotPath+className+"_"+testName+"_"+stepName+"_"+timestamp+".png"+"\">"+stepName+"</a>");
			
		//	FileUtils.copyFile(scrFile, new File(screenshotPath+className+"_"+testName+"_"+stepName+"_"+timestamp+".png"));
			
		/**-- needed	String path = imgFile.getAbsolutePath();
			System.out.println("absolute path:"+path);
			String path1 = path.replace("\\.","");
			
			System.out.println("path1: after replacement"+path1);
			
			Reporter.log("<a href=\""+path1+"\">"+stepName+"</a>"); */
			//Reporter.log("<a href=\""+".\\Preslaf"+screenshotPath+className+"_"+testName+"_"+stepName+"_"+timestamp+".png"+"\"> Clickhere </a>");
		}catch (Exception e)
		{   System.out.println(" Cannot Take Screen shot "+e);
			
		/*logs.debug("Cannot Take Screen shot ");*/
		}
		IncSS++;
	}

	public String startdate()
	{
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");	 

		 //get current date time with Date()
		 Date sdate = new Date();	 

		 // Now format the date
		 String st_date1= dateFormat.format(sdate);
		return  st_date1; 
	}

	public String enddate()
	{
			String myformat = "MM/dd/yyyy";
			Calendar cal = Calendar.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat(myformat);
			cal.add(Calendar.DATE, 10);;
			String edate = sdf.format(cal.getTime());
			//System.out.println(date2);
			return edate; 
	}
	public void linkInNewWIndow(By object) throws Exception{
		Actions action = new Actions(driver);
		WebElement link =driver.findElement(object);
		
		//newTab.keyDown(Keys.SHIFT).contextClick(link).keyUp(Keys.SHIFT).build().perform();
		action.contextClick(link).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
		Thread.sleep(5000);
	}
		
	public  String getMainWindowHandle(WebDriver driver) {
		return driver.getWindowHandle();
	}
	public  String getCurrentWindowTitle() {
		String windowTitle = driver.getTitle();
		return windowTitle;
	}
	
	public boolean isSelected(By object) throws Exception {
		try {
	        driver.findElement(object).isSelected();
	        System.out.println("Element is selected");
	        return true;
	    } 

	   catch (Exception e) {
	        System.out.println("Element is not selected");
	        return false;
	    }
		
	}
	

public void doubleclick(By object) throws Exception
{
	try{
		Actions action = new Actions(driver);
		WebElement element=driver.findElement(object);

		//Double click
		action.doubleClick(element).perform();
	}catch (Exception e) {}
}



	
	public void switchToWindow() throws Exception{
		
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
			          }
			       }
	}
	
	private String getTimeStamp() {
		
		DateFormat dateFormat = new SimpleDateFormat("MM_dd_yy_HH_mm_ss");
		Calendar cal = Calendar.getInstance();
		String dateformat = dateFormat.format(cal.getTime());
		System.out.println("inside time stamp method:"+dateFormat.format(cal.getTime()));
		System.out.println("inside time stamp method:"+dateFormat);
		return dateformat;
	}

	public boolean daterange(String testdate, String startdate, String enddate)throws Exception{
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		Date testDate = df.parse(testdate);
		Date startDate = df.parse(startdate);
		Date endDate = df.parse(enddate);
		return testDate.getTime()>=startDate.getTime() && testDate.getTime()<=endDate.getTime();
	}

	public void click(By object) throws Exception {
		/*logs.debug("Executing___"+testName+"___"+stepName);*/
		try{
			driver.findElement(object).click();
			Thread.sleep(1000);	
			//TakeScreenshot(testName+"_StepName_"+stepName+date1());
			/*ATUReports.add(stepDescription,inputvalue,Expected,Actual,LogAs.PASSED, new CaptureScreen(
	                ScreenshotOf.BROWSER_PAGE));*/
			/*String exp=object.toString();
			ATUReports.add("click on Element","Click","click on"+exp,"clicked at"+exp,LogAs.PASSED, new CaptureScreen(ScreenshotOf.DESKTOP));*/
			//TakeScreenshot("TestName-"+testName+"_StepName-"+stepName+date1());
		}catch(Exception e) {
			/*String exp=object.toString();
			ATUReports.add("click on Element","Click","click on"+exp,"Element Not Fount", LogAs.FAILED, new CaptureScreen(
                    ScreenshotOf.DESKTOP));*/
			TakeScreenshot("ERROR_TestName_"+testName+"_StepName_"+stepName+date1());
			//	System.out.println("Element is not found");
		/*	logs.error("Element is not found");*/
		}
	}
	public void clear(By object)throws Exception{
		try
		{
			driver.findElement(object).clear();
			Thread.sleep(1000);
			
		}
		catch(Exception e)
		{
			
			TakeScreenshot("ERROR_TestName_"+testName+"_StepName_"+stepName+date1());
		}
	}
	public  WebElement clickelement(By object, WebElement element) throws Exception {
		/*logs.debug("Executing___"+testName+"___"+stepName);*/
		try{
			driver.findElement(object).click();
			Thread.sleep(1000);			
			//TakeScreenshot("TestName-"+testName+"_StepName-"+stepName+date1());
		}catch(Exception e) {
			
			TakeScreenshot("ERROR_TestName_"+testName+"_StepName_"+stepName+date1());
			//	System.out.println("Element is not found");
			/*logs.error("Element is not found");*/
		}
		return null;
	}
	


	public void click(WebElement element) {
		/*logs.debug("Executing___"+testName+"___"+stepName);*/
		try
		{
			element.click();
			/*String exp=element.toString();
			ATUReports.add("click on Element","Click","click on"+exp,"clicked at"+exp,LogAs.PASSED, new CaptureScreen(ScreenshotOf.DESKTOP));
			System.out.println("element.getText(): "+element.getText());*/
			//pass
		}catch(Exception e)
		{
			String exp=element.toString();
			ATUReports.add("click on Element","Click","click on"+exp,"Element Not Fount", LogAs.FAILED, new CaptureScreen(
                    ScreenshotOf.DESKTOP));
			//System.out.println("Element is not found");
			//fail
			/*logs.error("Element is not found");*/
		}
	}

	public void type(By object, String data) throws Exception {
		/*logs.debug("Executing___"+testName+"___"+stepName);*/
		try{
			driver.findElement(object).sendKeys(data);
			/*String exp=object.toString();
			ATUReports.add("Type Vale","Type","type"+data,"value typed at"+exp,LogAs.PASSED, new CaptureScreen(
                    ScreenshotOf.DESKTOP));*/
			//Thread.sleep(1000);
			//TakeScreenshot("TestName-"+testName+"_StepName-"+stepName+date1());
			}
		catch(Exception e)
		{
			String exp=object.toString();
			ATUReports.add("Type Vale","Type","type"+data,"Not found Element"+exp, LogAs.FAILED, new CaptureScreen(
                    ScreenshotOf.DESKTOP));
			//TakeScreenshot("ERROR_TestName-"+testName+"_StepName-"+stepName+date1());
		/*	logs.error("Element is not found");*/
		}
	}

	public void pressTabkey(By object) throws Exception{
		/*logs.debug("Executing___"+testName+"___"+stepName);*/
		try
		{
			driver.findElement(object).sendKeys(Keys.TAB);
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			TakeScreenshot("ERROR_TestName-"+testName+"_StepName-"+stepName+date1());
			/*logs.error("Element is not found");*/
		}
	}

	public String getText(By object) throws Exception{
//		logs.debug("Executing___"+testName+"___"+stepName);
		try{
			String text = driver.findElement(object).getText();	 		
			//TakeScreenshot("TestName-"+testName+"_StepName-"+stepName+date1());
			return text;
		}catch(Exception e){
			TakeScreenshot("ERROR_TestName-"+testName+"_StepName_"+stepName+date1());
			/*logs.error("text is not found");*/
			return null;
		}
	}

	public String getWindowtitle() throws Exception{
		/*logs.debug("Executing___"+testName+"___"+stepName);*/
		try{
			String text = driver.getTitle();	 		
			//TakeScreenshot("TestName-"+testName+"_StepName-"+stepName+date1());
			return text;
		} catch (Exception e) {
			TakeScreenshot("ERROR_TestName-"+testName+"_StepName-"+stepName+date1());
		/*	logs.error("text is not found");*/
			return null;
		}
	}

	public WebElement findElement(By object) {
		try
		{
			
		WebElement element=driver.findElement(object);
		
		/*ATUReports.add(stepDescription,inputvalue,Expected,Actual, LogAs.PASSED, new CaptureScreen(
                ScreenshotOf.DESKTOP));*/
		return element;
		}
		catch(Exception e)
		{
			
			String exp=object.toString();
			ATUReports.add("Find Element","Null",exp,"Element Not Found", LogAs.FAILED, new CaptureScreen(
                    ScreenshotOf.DESKTOP));
			throw e;
		}
	}

	public int sizeOf(By object) {
		int size=driver.findElements(object).size();
		return size;
	}


	public String getValue(By object) {
		return driver.findElement(object).getAttribute("value");
	}

	public boolean isTextPresent(String text) throws Exception {
		//System.out.println("text: "+text);
		//System.out.println(driver.getPageSource().contains(text));
		boolean result = driver.getPageSource().contains(text);
		if (result == false)
			TakeScreenshot("ERROR_TestName-"+testName+"_StepName-"+stepName+date1());
		return result;
	}

	public boolean isTextPresent(By object, String text) {
		System.out.println(driver.findElement(object).getText());
		return driver.findElement(object).getText().contains(text);
	}
	
	public boolean waitForTextPresent(final String text1, final String text2) throws Exception {
		System.out.println();
		boolean result = true;
		for (int second = 0;; second++) {
			System.out.println(second);
			if (second >= 100) {
				TakeScreenshot("ERROR_TestName-"+testName+"_StepName-"+stepName+date1());
				result = false;
				break;
				//fail("timeout");
			}
			try {
				if(driver.getPageSource().contains(text1) || driver.getPageSource().contains(text2))
					break;
				else
					Thread.sleep(1000);
			} catch (Exception e) {}
		}
		return result;
	}

	public boolean waitForTextPresent(final String text) throws Exception {
		System.out.println();
		boolean result = true;
		for (int second = 0;; second++) {
			//System.out.println(second);
			if (second >= 1) {
				TakeScreenshot("ERROR_TestName-"+testName+"_StepName-"+stepName+date1());
				result = false;
				break;
				//fail("timeout");
			}
			try {
				if(driver.getPageSource().contains(text))
					break;
				else
					System.out.println("Thread");
					Thread.sleep(1000);
			} catch (Exception e) {}
		}
		return result;
		
	}

	public boolean waitForTextPresent(final By object,final String text) throws Exception {
		/*return (new WebDriverWait(driver, 60)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver d) {
				return d.findElement(object).getText().toLowerCase().contains(text.toLowerCase()); 
			}
		});*/
		boolean result = true;
		for (int second = 0;; second++) {
			System.out.println(second);
			if (second >= 60) {
				TakeScreenshot("ERROR_TestName-"+testName+"_StepName-"+stepName+date1());
				//fail("timeout");
				result = false;
				break;
			}
			try { 
				if(this.isElementPresent(object)){
					//System.out.println("elt is present ");
					//System.out.println("test: "+this.getText(object));
					//System.out.println("test: "+this.getText(object).equals(text));
					if(this.getText(object).equals(text))
						break;
					else
						Thread.sleep(1000);
				}
				else fail("Element not found");

			} catch (Exception e) {}
		}
		return result;
	}

	//wait for some text to be displayed... 
	public boolean waitForTextToBeDisplayed(final By object) throws Exception{
		/*(new WebDriverWait(driver, 60)).until(new ExpectedCondition<Boolean>() {
				public Boolean apply(WebDriver d) {
					return !d.findElement(object).getText().isEmpty();
				}
			});*/
		boolean result = true;
		for (int second = 0;; second++) {
			System.out.println(second);
			if (second >= 60) {
				TakeScreenshot("ERROR_TestName-"+testName+"_StepName-"+stepName+date1());
				result = false;//fail("time out");
				break;
			}
			try { 
				if(this.isElementPresent(object))
					if(!this.getText(object).isEmpty())
						break;
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}


	/**
	 * 
	 * @param object
	 */

	public void waitForTextboxValueTobepopulated(final By object){
		(new WebDriverWait(driver, 60)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver d) {
				return !d.findElement(object).getAttribute("value").isEmpty();
			}
		});
	}


	public WebElement WaitForElement(By object) throws Exception {
		try	{		          
			WebDriverWait wait = new WebDriverWait(driver,60);
			return wait.until(ExpectedConditions.presenceOfElementLocated(object)); 

		}
		catch (Exception e) {
			throw e;
			//fail("timeout");
		}
	}

	public boolean isElementPresent(By object) throws Exception	{
	//	System.out.println("is element present.....");
		try{
			driver.findElement(object);
			return true;
		}catch(Exception e){
			//System.out.println("is element presernt catch....");
			TakeScreenshot("TestName-"+testName+"_StepName-"+stepName+date1());
			
			return false;
		}
	}


	public void waitForElementPresent(By object) {
		System.out.println("wait for Xpath element present is reached");
		for (int second = 0;; second++) {
			System.out.println("second: "+second);
			if (second >= 10) fail("timeout");
			try { 
				//System.out.println("this elt present: "+this.isElementPresent(object));
				if(this.isElementPresent(object)) 
					break;
				Thread.sleep(1000);
			} catch (Exception e) {}
		}
		System.out.println("wait for Xpath element present is reached");
	}




	public void SwitchToWindow(int index) throws Exception {	
	/*	logs.debug("Executing___"+testName+"___"+stepName);*/
		try{
			driver.switchTo().window(driver.getWindowHandles().toArray()[index].toString());
			//	TakeScreenshot("TestName-"+testName+"_StepName-"+stepName+date1());
			// SwitchToWindow(0); // to use 	
		} catch(Exception e){
			TakeScreenshot("ERROR_TestName-"+testName+"_StepName-"+stepName+date1());
			//System.out.println("window is not found");
			/*logs.error("window is not found");*/
		}
	}


	/*public void SwitchToFrame(String object) throws Exception {
	
		logs.debug("Executing___"+testName+"___"+stepName);
		try{
			driver.switchTo().frame(object);
			//TakeScreenshot("TestName-"+testName+"_StepName-"+stepName+date1());
			// SwitchToWindow(0); // to use 	
		}catch(Exception e){
			TakeScreenshot("ERROR_TestName-"+testName+"_StepName-"+stepName+date1());
			//System.out.println("Element is not found");
			logs.error("Element is not found");
		}

	}	
*/

	public void SwitchToFrame(Object object) throws Exception {
		/*logs.debug("Executing___"+testName+"___"+stepName);*/
		try{
			driver.switchTo().frame((int) object);
			//TakeScreenshot("TestName-"+testName+"_StepName-"+stepName+date1());
			SwitchToWindow(0); // to use 	
		}catch(Exception e){
			TakeScreenshot("ERROR_TestName-"+testName+"_StepName-"+stepName+date1());
			System.out.println("Element is not found");
		/*	logs.error("Element is not found");*/
		}

	}	


	public void MaximizeWindow() {
		((JavascriptExecutor)driver).executeScript("if (window.screen)" +
				"{window.moveTo(0, 0);window.resizeTo(window.screen.availWidth,window.screen.availHeight);};");
	}

	public void CloseAlertBox() throws InterruptedException{
		Thread.sleep(5000);
		driver.switchTo().alert().accept();

	}





	public void GetIseleniumObject(String URL)
	{           
		try{
		//	Selenium selenium = new WebDriverBackedSelenium(driver,URL);
			//selenium.type("q","Flights"); // to use
		}catch (Exception e){ System.out.println("Cannot Perform Backed Selenium "+e);
		/*logs.debug("Cannot Perform Backed Selenium");*/
		}
	}




	public void AutoIt(String path) throws InterruptedException, IOException {
		Thread.sleep(2000L);
		@SuppressWarnings("unused")
		Process p = Runtime.getRuntime().exec(path);
	}	

	// overloading method
	public void AutoIt(String path, String windowname,String username, String password) throws InterruptedException, IOException {
		String[] dialog;
		Thread.sleep(3000);
		dialog =  new String[]{ path,windowname,username,password};
		Runtime.getRuntime().exec(dialog);
	}	





	public void moveMouse(By object)
	{
		try{
			WebElement mouseelement = null;
			mouseelement = driver.findElement(object);
			if(mouseelement != null)
			{
				Actions builder = new Actions(driver);
				builder.moveToElement(mouseelement).build().perform();
			}
		}catch (Exception e){
			//System.out.println("Cant move mouse Element not found" +e);
			/*logs.debug("Cant move mouse Element not found");*/
		}
	}

	public void moveMouse(WebElement element)  // Overloading Method
	{ 
		try{
			if(element != null)
			{
				Actions builder = new Actions(driver);
				builder.moveToElement(element).perform();
			}
		}catch (Exception e){
			//System.out.println("Cant move mouse Element not found" +e);
			/*logs.debug("Cant move mouse Element not found");*/
		}
	}

	public void selectByVisibleText(By object,String name) throws Exception {
		try{
			Select select = new Select(driver.findElement(object));
			//select.selectByValue(name);
			select.selectByVisibleText(name);
			Thread.sleep(1000);
			//TakeScreenshot("TestName-"+testName+"_StepName-"+stepName+date1());
		}catch(Exception e){
			TakeScreenshot("ERROR_TestName-"+testName+"_StepName-"+stepName+date1());
			throw e;
			//System.out.println("The provided value is not available in select list" +e);
			/*logs.debug("The provided value is not available in select list");*/
		}
		
	}



	public void selectBy(By object,String name) throws Exception {
		try{
			Select select = new Select(driver.findElement(object));
			//select.selectByValue(name);
			select.selectByVisibleText(name);
			Thread.sleep(1000);
			//TakeScreenshot("TestName-"+testName+"_StepName-"+stepName+date1());
		}catch(Exception e){
			TakeScreenshot("ERROR_TestName-"+testName+"_StepName-"+stepName+date1());
			//System.out.println("The provided value is not available in select list" +e);
			/*logs.debug("The provided value is not available in select list");*/
		}
	}

	
	public void selectBy(By object, int index) throws InterruptedException, IOException	{
		Thread.sleep(2000L);
		Select select = new Select(driver.findElement(object));
		select.selectByIndex(index);
	}	

	public void selectByValue(By object, String value ) throws Exception{
		if(driver.findElements(object).size()>0);
		
		try{
			 WebElement dropDown = driver.findElement(object);
	    dropDown.click();
	    List<WebElement> allOptions = dropDown.findElements(object);
	    for ( WebElement we: allOptions) { 
	        dropDown.sendKeys( Keys.DOWN ); //simulate visual movement
	        Thread.sleep(2000);  
	        Select select = new Select(driver.findElement(object));
	        
	        //if ( we.getText().contains( text ) ) 
	        select.selectByVisibleText(value);
	    }
		}
		
		catch(Exception e){
			
			TakeScreenshot("ERROR_TestName-"+testName+"_StepName-"+stepName+date1());
		}
		
	}
	//
	/********************************************************************
	 * Application based keywords
	 *******************************************************************/



	public boolean validateWorkdeskSearchResult(String inputdata, String searchresultmessage,
			String searchresultcolumn) throws Exception {
		//System.out.println("validateWorkdeskSearchResult is erached");
		boolean result = false;	
		//Thread.sleep(5000);
		if (isTextPresent(By.xpath(searchresultmessage),"the maximum is 500 results")) {
			result = true;
		}
		else if (isTextPresent(By.xpath(searchresultmessage),"Total No Of Records: 0")) {
			result = true;
		}
		else {						
			List<WebElement> expectedValues = driver.findElements(By.cssSelector(searchresultcolumn));
			for(WebElement expectedvalue : expectedValues){
				if (expectedvalue.getText().toLowerCase().contains(inputdata.toLowerCase())){
					result = true;
				}
				else {
					result = false;
					TakeScreenshot("ERROR_TestName-"+testName+"_StepName-"+stepName+date1());
					break;
				}
			}			
		}
		//System.out.println("result: "+result);
		return result;
	}


	public boolean validateWorkdeskSearchResultDaterange(String startdate,String enddate, 
			String searchresultmessage, String searchresultcolumn1, String searchresultcolumn2) 
					throws Exception{
		boolean result = false;
		//Thread.sleep(5000);
		if (isTextPresent(By.xpath(searchresultmessage),"the maximum is 500 results")) {
			//System.out.println("5000");
			result = true;
		}
		else if (isTextPresent(By.xpath(searchresultmessage),"Total No Of Records: 0")) {
			//System.out.println("000000000000000");
			result = true;
		}
		else {
			DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
			Date startDate = df.parse(startdate);
			Date endDate = df.parse(enddate);
			for (int j = 1; j <= 25; j++) {
				//System.out.println("after for"+j);
				//System.out.println("is Elt present: "+ isElementPresent(By.cssSelector(searchresultcolumn1+j+searchresultcolumn2)));
				if(isElementPresent(By.cssSelector(searchresultcolumn1+j+searchresultcolumn2))) {

					@SuppressWarnings("unused")
					String dates = getText(By.cssSelector(searchresultcolumn1+j+searchresultcolumn2));
					//System.out.println("Date"+dates);
					//System.out.println("Names: "+getText(By.cssSelector(prop.getOrProperty("searcheComm_searchresult_firstlastname1_css")+j+prop.getOrProperty("searcheComm_searchresult_firstlastname2_css"))).contains(lastname));

					Date testDate = df.parse(getText(By.cssSelector(searchresultcolumn1+j+searchresultcolumn2)));
					//	System.out.println("testDate.getTime(): "+testDate.getTime());
					//System.out.println("startDate.getTime(): "+startDate.getTime());
					if(testDate.getTime()>=startDate.getTime() && testDate.getTime()<=endDate.getTime()) {
						result= true;
					}
					else {
						result = false;
						break;
					}
				}
				else if (j == 1) {
					//page loads for a long time
					System.out.println("j : " + j);
					result = false;
					break;
				}
				else{
					System.out.println("j : " + j);
					result = true;
					break;
				}
			}
		}
		System.out.println("result: " + result);
		return result;
	}


	public void waitForListUpdate(By object) throws Exception {
		for (int second = 0;; second++) {
			if (second >= 60) {
				TakeScreenshot("ERROR_TestName-"+testName+"_StepName-"+stepName+date1());
				fail("timeout");
			}
			try {
				if (driver.findElements(object).size() > 1) {
					break;
				}
				//Thread.sleep(1000);
			} catch (Exception e) {}
		}
	}
}
