package pages;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import testBase.WebTestBase;

	public class LoginPage extends WebTestBase {
		@FindBy(id="username")
		WebElement username;
		@FindBy(id="password")
		WebElement password;
		
		@FindBy(id="loginButton")
		WebElement loginbtn;
		
		@FindBy(id="Inpatient Ward")
		WebElement location;
		
		public LoginPage() {
			PageFactory.initElements(driver, this);
		}
		public void Login_Click() {
			username.sendKeys(prop.getProperty("username"));
			password.sendKeys(prop.getProperty("password"));
			location.click();
			loginbtn.click();
			
		}
		
	}
		
