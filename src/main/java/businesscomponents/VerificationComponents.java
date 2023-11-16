package businesscomponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.LT.framework.FrameworkException;
import com.LT.framework.Status;
import com.LT.framework.selenium.WebDriverUtil;

import supportlibraries.ReusableLibrary;
import supportlibraries.ScriptHelper;


/**
 * Verification Components class
 * @author Ocwen
 */
public class VerificationComponents extends ReusableLibrary
{
	private WebDriverUtil driverUtil;
	
	/**
	 * Constructor to initialize the component library
	 * @param scriptHelper The {@link ScriptHelper} object passed from the {@link DriverScript}
	 */
	public VerificationComponents(ScriptHelper scriptHelper)
	{
		super(scriptHelper);
		
		driverUtil = new WebDriverUtil(driver);
	}
	
	
	public void verifyRegistration()
	{
		String userName = dataTable.getData("General_Data", "Username");
		
		if(driverUtil.isTextPresent("^[\\s\\S]*Dear " +
					dataTable.getExpectedResult("FirstName") + " " +
					dataTable.getExpectedResult("LastName") + "[\\s\\S]*$")) {
			report.updateTestLog("Verify Registration",
										"User " + userName + " registered successfully", Status.PASS);
		} else {
			throw new FrameworkException("Verify Registration",
											"User " + userName + " registration failed");
		}
	}
	
	public void verifyBooking()
	{
		if(driverUtil.isTextPresent("^[\\s\\S]*Your itinerary has been booked![\\s\\S]*$")) {
			report.updateTestLog("Verify Booking", "Tickets booked successfully", Status.PASS);
			
			//WebElement flightConfirmation = driver.findElement(By.xpath("//font/font/b/font"));
			WebElement flightConfirmation =
								driver.findElement(By.cssSelector("font > font > b > font"));
			
			String flightConfirmationNumber = flightConfirmation.getText();
			flightConfirmationNumber = flightConfirmationNumber.split("#")[1].trim();
			dataTable.putData("Flights_Data", "FlightConfirmationNumber", flightConfirmationNumber);
			report.updateTestLog("Flight Confirmation",
					"The flight confirmation number is " + flightConfirmationNumber,
					Status.DONE);
		} else {
			report.updateTestLog("Verify Booking", "Tickets booking failed", Status.FAIL);
		}
	}


	public static void main(String[] args) {
		
	}
}