package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.WebTestBase;
import utils.Utility;

public class RegisterPage extends WebTestBase{
	
	@FindBy(id="next-button")
	WebElement emptybutton;
	
	@FindBy(id="next-button")
	WebElement emptybutton2;
	
	@FindBy(id="next-button")
	WebElement emptybutton3;
	
	@FindBy(id="next-button")
	WebElement emptybutton4;
	
	
	
	
	@FindBy(id="referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension")
	WebElement register;
	
	@FindBy(name="givenName")
	WebElement name;
	
	@FindBy(name="familyName")
	WebElement familyname;
	
	@FindBy(id="next-button")
	WebElement confirm;
	
	@FindBy(xpath="//option[text()='Male']")
	WebElement gender;
	
	@FindBy(id="next-button")
	WebElement confirm2;
	
	@FindBy(id="birthdateDay-field")
	WebElement bdydate;
	

	@FindBy(id="birthdateMonth-field")
	WebElement bdymonth;
	
	@FindBy(id="birthdateYear-field")
	WebElement bdyyear;
	
	@FindBy(id="next-button")
	WebElement confirm3;
	
	@FindBy(id="address1")
	WebElement address;
	
	@FindBy(id="cityVillage")
	WebElement city;
	
	@FindBy(id="next-button")
	WebElement confirm4;
	
	@FindBy(name="phoneNumber")
	WebElement number;
	
	@FindBy(id="next-button")
	WebElement confirm5;
	
	@FindBy(id="relationship_type")
	WebElement relative;
	
	@FindBy(xpath="//input[@class='person-typeahead ng-pristine ng-untouched ng-valid ng-empty']")
	WebElement relativename;
	

	@FindBy(id="next-button")
	WebElement confirm6;
	
	@FindBy(id="submit")
	WebElement submit;
	
	

	public RegisterPage() {
		PageFactory.initElements(driver, this);
	
	}
	
	
	public void register_Page() {
		register.click();
	}
	public void click_empty() {
		emptybutton.click();
			
	}
	 
	public void patient_Name() {
		name.sendKeys("Babu");
	}
	public void family_Name() {
		familyname.sendKeys("John");
	}
	public void confirm_Button() {
		confirm.click();
	}
	
	public void click_emptyGender() {
		emptybutton2.click();
		
	}
	public void double_Click() throws InterruptedException {
		Utility.doubleClick(driver,gender);
		gender.click();
	}
	
	public void confirm_Button2() {
		confirm2.click();
	}
	
	public void click_emptyDob() {
		emptybutton2.click();
			
	}
	
	public void bdy_Date() {
		bdydate.sendKeys("19");
	
	}
	public void doubleClick_Bdymonth() throws InterruptedException {
		Utility.doubleClick_Bdymonth(driver,bdymonth);
		
	}
	public void select_Month(String term,String value) throws InterruptedException {
		Utility.click_Bdymonth(bdymonth,term,value);
		
	}
	public void bdy_Year() {
		bdyyear.sendKeys("1990");
	}
	
	public void confirm_Button3() {
		confirm3.click();
	}
	
	
	public void click_emptyAddress() {
		emptybutton3.click();
		
	}
	public void patient_Address() {
		address.sendKeys("xyz street");
	}
	public void patient_City() {
		city.sendKeys("Chennai");
	}
	
	public void confirm_Button4() {
		confirm4.click();
	}
	public void patient_number() {
		number.sendKeys("abcdefghi");
		emptybutton4.click();
		
		number.clear();
		number.sendKeys("1234567890");
		
	}
	public void confirm_Button5() {
		confirm5.click();
	}
	
	public void patient_relative() {
		relative.click();
		
	}
	public void choose_relative(String term,String value) throws InterruptedException {
		Utility.click_Relative(relative,term,value);
	}
	public void relative_name() {
		relativename.sendKeys("Anand");
		
	}

    public void confirm_Button6() {
	   confirm6.click();
}
    public void submit_details() {
    	submit.click();
    }
	
}
