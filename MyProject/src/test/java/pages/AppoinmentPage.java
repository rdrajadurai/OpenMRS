package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.WebTestBase;
import utils.Utility;

public class AppoinmentPage extends WebTestBase{
	
	@FindBy(id="appointmentschedulingui.requestAppointmentDashboardLink")
	WebElement request;
	
	@FindBy(id="appointment-type")
	WebElement type;
	
	@FindBy(xpath="/html/body/div/div[3]/div[4]/form/p[1]/ul/li[1]/a")
	WebElement settype;
	
	@FindBy(id="min-time-frame-value")
	WebElement mintime;
	
	@FindBy(id="min-time-frame-units")
	WebElement day;

	@FindBy(id="max-time-frame-value")
	WebElement maxtime;
	

	@FindBy(id="max-time-frame-units")
	WebElement week;
	
	
	@FindBy(id="save-button")
	WebElement save;
	
	
	
	

	
	public AppoinmentPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void requestAppointment() {
		request.click();	
		}
	public void type() {
		type.click();
		type.sendKeys("Infectious Disease");
		settype.click();
		
	}
	public void fixdays() {
		mintime.click();
		mintime.sendKeys("1");
		
	}
	public void fixdayss() {
		day.click();
		
	}
	public void confirmDays(String term,String value) throws InterruptedException {
		Utility.fix_days(day,term,value);
	}
	public void fixweeks() {
		maxtime.click();
		maxtime.sendKeys("1");
	}
	public void fixweekss() {
		week.click();
	}
	public void confirmweeks(String term,String value) throws InterruptedException {
		Utility.fix_weeks(week,term,value);
		
	}
	public void saveAppoinment() {
		save.click();
	}

}
