package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.WebTestBase;
import utils.Utility;

public class DeletePage extends WebTestBase {
	@FindBy(xpath="//a[@id='org.openmrs.module.coreapps.deletePatient']")
	WebElement remove;
	
	@FindBy(id="delete-reason")
	WebElement reason;
	
	@FindBy(xpath="//*[@id=\"delete-patient-creation-dialog\"]/div[2]/button[1]")
	WebElement confirmdelete;
	
	
	
	public DeletePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void deletepatientt() {
		remove.click();
		reason.sendKeys("Nil");
		confirmdelete.click();
		Utility.getCookies();
		
	}

}
