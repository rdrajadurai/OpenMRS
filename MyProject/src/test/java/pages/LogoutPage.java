package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.WebTestBase;
import utils.Utility;

public class LogoutPage extends WebTestBase{
	
	@FindBy(xpath="//ul[@class='navbar-nav ml-auto user-options']//li[@class='nav-item logout']/a")
	WebElement logout;
	
	public LogoutPage() {
		PageFactory.initElements(driver, this);
	}
	public void logoutt() {
		Utility.clicklogout(driver, logout);
		logout.click();
	}

}
