package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.WebTestBase;
import utils.Utility;

public class EditRegistration extends WebTestBase{
	
	@FindBy(id="application.registrationapp.summary.editPatientLink")
	WebElement edit;
	
	@FindBy(id="demographics-edit-link")
	WebElement editdemographic;
	
	@FindBy(xpath="//input[@class='required focused']")
	WebElement editname;
	
	@FindBy(id="next-button")
	WebElement nextbutton;
	
	@FindBy(id="next-button")
	WebElement nextbutton2;
	
	@FindBy(name="birthdateDay")
	WebElement changedate;
	
	@FindBy(id="next-button")
	WebElement nextbutton3;
	
	
	@FindBy(id="registration-submit")
	WebElement confirmedited;
	
	@FindBy(id="contactInfo-edit-link")
	WebElement editcontact; 
	
	@FindBy(id="cityVillage")
	WebElement editcity;
	

	@FindBy(id="next-button")
	WebElement confirmright;
	
	@FindBy(xpath="//input[@class='phone']")
	WebElement editnum;
	
	@FindBy(id="next-button")
	WebElement confirmright2;
	
	@FindBy(id="registration-submit")
	WebElement submit;
	
    @FindBy(xpath="//span[@class='labeled']")
    WebElement nextpage;
	
	@FindBy(id="save-form")
	WebElement saveform;
	
	@FindBy(id="body-wrapper")
	WebElement screenshot;
	
	
	
	public EditRegistration() {
		PageFactory.initElements(driver, this);
	}
	
	public void editregistration() {
		edit.click();
	}
	
	public void editgraphic() {
		editdemographic.click();
		
	}
	public void demographicchange() {
		editname.clear();
		editname.sendKeys("Ajay");
		nextbutton.click();
		nextbutton2.click();
		changedate.clear();
		changedate.sendKeys("10");
		nextbutton3.click();
		confirmedited.click();
		
	}
	public void editcontactdetails() {
		editcontact.click();
		editcity.clear();
		editcity.sendKeys("Cuddalore");
		confirmright.click();
		editnum.clear();
		editnum.sendKeys("1234567890");
		confirmright2.click();
		submit.click();
		nextpage.click();
		
		
	}
	public void screenShot() throws IOException, InterruptedException {
		Utility.screenShotAction(driver, screenshot);
		screenshot.click();
	

	}
}
