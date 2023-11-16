package businesscomponents;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.LT.framework.selenium.WebDriverUtil;

//import bsh.util.Util;
import supportlibraries.ReusableLibrary;
import supportlibraries.ScriptHelper;


/**
 * Functional Components class
 * @author ocwen
 */
public class FunctionalComponents extends ReusableLibrary
{
	private WebDriverUtil driverUtil;
	/**
	 * Constructor to initialize the component library
	 * @param scriptHelper The {@link ScriptHelper} object passed from the {@link DriverScript}
	 */
	public FunctionalComponents(ScriptHelper scriptHelper)
	{
		super(scriptHelper);
		driverUtil = new WebDriverUtil(driver);
	}
	  WebDriverWait wait = new WebDriverWait(driver, 30);
	  public String errorMessage;
	  public String strMessage;
	  public String strCode;
	  public String strAppend;
	  public String strBatchName;
	  public String InvoiceNum;
	 
	  
	
	public void invokeApplication()
	{
		/*
		 * Clear all temp files and IE driver instances
		 */

		/*
		 try {
			 Runtime.getRuntime().exec("taskkill /F /IM IEDriverServer.exe");
			 } catch (final IOException e) {
			 throw new RuntimeException("Failed to run bat file");
			 }
		*/
		//driver.get(properties.getProperty("ApplicationUrl"));
		String strUrl = dataTable.getData("General_Data", "Environment");
		
		if(strUrl.contains("Production")){
			/*
			 * Enter production url 
			 */
			driver.get("https://ebhz.fs.us2.oraclecloud.com/homePage/faces/FuseWelcome"); // modified for utility
		}
		else if(strUrl.contains("Dev")){
			/*
			 * Dev URL
			 */
			driver.get("https://ebhzdev-test.fs.us2.oraclecloud.com/homePage/faces/FuseWelcome");
		}
		else{
			/*
			 * Test url
			 */
			// ebhz-test.fa.us2.oraclecloud.com/
			//ebhz-test.login.us2.oraclecloud.com/oam/server/obrareq.cgi?encquery%3Dgr7eZjaNmXRMxUcWbvmj8rfkp5rbHi9opkt7sJBhmkpT3CxNp3AAhdD3qGtaWBL%2FiHV4PKxSE9nZnM7jXAE%2B8iD7CClbNpxTSzkkzOqXbH2PKhURLZSNl8qukX5mIuDECWF9rV0v6KKPJY9LFdKBmbVb8VxHbR1bmNNfML8DS4BzLBKvFPVBbT0LEQgJixz7%2BritykrDNwt9PVsdjasQsVAgfOtpH%2BQ0JHGQIdreWn6PrgEwm%2BGwXRgcC0cxihWy7n3yk6oBv066Y5HshSPoB3FLbN5cEaei3Xx5UOfAu8QvalcfRgIusE1wijDCHYbVqJODxISf4gM96RgRHYKKdL7K0HUZUqawuAEzhGfmxVokj4XZL4zTtCMG2iFrax%2FVsi2ZWscGJBe86J2TStvHWZpnVttiZVTGct4KeGgMFstoY62Ry6b3y%2FUOKx4ekAVzMa5bRJ3MvAPKPKRyXvgl868AGQxk7lDhdr4dtQWTJfgPi9ojnp1pP9Pkhy3%2FaLd2%20agentid%3DOraFusionApp_11AG%20ver%3D1%20crmethod%3D2
			driver.get("https://ebhz-test.login.us2.oraclecloud.com/"); // modified for utility
		}
		
		/*report.updateTestLog("Invoke Application", "Invoke the application under test @ " +
								properties.getProperty("ApplicationUrl"), Status.PASS);*/
		
		//driver.get("http://www.google.co.in/");
		
	}
	
	public void loginIntoFusion() throws InterruptedException
	{
		String strLoginType = dataTable.getData("General_Data", "LoginType");
		String strBrowserType = dataTable.getData("General_Data", "BrowserType");
		String strEmailId = dataTable.getData("General_Data", "EmailId");
		String strSingleSignInPassword = dataTable.getData("General_Data", "SingleSignInPassword");
		if (strLoginType.equalsIgnoreCase("SingleSignOn")) {
			driver.findElement(By.id("ssoBtn")).click();
			Thread.sleep(5000);
			if(strBrowserType.equalsIgnoreCase("Chrome")) {
				driver.findElement(By.id("userNameInput")).sendKeys(strEmailId);
				driver.findElement(By.id("passwordInput")).sendKeys(strSingleSignInPassword);
				driver.findElement(By.id("submitButton")).click();
				Thread.sleep(5000);
			}
			
		}
		else {
			String strUserID = dataTable.getData("General_Data", "UserName");
			String strPassword = dataTable.getData("General_Data", "Password");
			driver.findElement(By.id("userid")).sendKeys(strUserID);
			driver.findElement(By.id("password")).sendKeys(strPassword);
			driver.findElement(By.id("btnActive")).click();	
			Thread.sleep(5000);
		}
		
	}
	/*
	 * Function for AP module
	 */
	
	
}