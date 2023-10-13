package testCase;

import java.io.IOException;

import org.testng.annotations.*;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.AppoinmentPage;
import pages.DeletePage;
import pages.EditRegistration;
import pages.HomePage;
import pages.LoginPage;
import pages.LogoutPage;
import pages.RegisterPage;
import testBase.WebTestBase;

public class TC extends WebTestBase {
	
	LoginPage loginpage;
	HomePage homepage;
	RegisterPage registerpage;
    AppoinmentPage  appoinment;
    EditRegistration editregistration;
    DeletePage deletepage;
    LogoutPage logoutpage;
    
	public TC() {
		super();
		
	}
	@BeforeTest
	public void BeforeMethod() {
		
		loadUrl();
		loginpage=new LoginPage();
		homepage=new HomePage();
		registerpage=new RegisterPage();
		appoinment=new  AppoinmentPage();
		editregistration=new EditRegistration();
		deletepage=new DeletePage();
		logoutpage=new LogoutPage();
	}
	@Test(priority=0)
	public void verifyLogin() {
		SoftAssert softassert=new SoftAssert();
		//System.out.println("Hello");
		loginpage.Login_Click();
		softassert.assertAll();

	}
	@Test(priority=1)
	public void verify_homepage() throws InterruptedException {
		SoftAssert softassert=new SoftAssert();
		//System.out.println(homepage.gettextofsearch());
		softassert.assertEquals(homepage.gettextofsearch(),"Logged in as Super User (admin) at Inpatient Ward.","My");
		Thread.sleep(1000);
	}
	@Test(priority=2)
	public void register_patient() throws InterruptedException {
		SoftAssert softassert=new SoftAssert();
		registerpage.register_Page();
		softassert.assertAll();
		Thread.sleep(1000);
		
	}
	@Test(priority=3)
	public void demo_graphics() throws InterruptedException {
		SoftAssert softassert=new SoftAssert();
		registerpage.patient_Name();
		registerpage.family_Name();
		registerpage.confirm_Button();
		registerpage.double_Click();
		registerpage.confirm_Button2();
		registerpage.bdy_Date();
		registerpage.doubleClick_Bdymonth();
		registerpage.select_Month("byValue","5" );
		registerpage.bdy_Year();
		registerpage.confirm_Button3();
		softassert.assertAll();
		Thread.sleep(1000);
	}
	
	@Test(priority=4)
		public void contact_info() throws InterruptedException {
		SoftAssert softassert=new SoftAssert();
		registerpage.patient_Address();
		registerpage.patient_City();
		registerpage.confirm_Button4();
		registerpage.patient_number();
		registerpage.confirm_Button5();
		softassert.assertAll();
		Thread.sleep(1000);
			
		}
	@Test(priority=5)
	public void relative() throws InterruptedException{
		SoftAssert softassert=new SoftAssert();
		registerpage.patient_relative();
	    registerpage.choose_relative("byValue","8d91a01c-c2cc-11de-8d13-0010c6dffd0f-A");
	    registerpage.relative_name();
	    registerpage.confirm_Button6();
	    softassert.assertAll();
	    Thread.sleep(1000);
		
		
	}
	@Test(priority=6)
		public void submit() throws InterruptedException {
		SoftAssert softassert=new SoftAssert();
		registerpage.submit_details();
		 softassert.assertAll();
		 Thread.sleep(1000);
		
		}
	@Test(priority=7)
	public void appointment() throws InterruptedException {
		SoftAssert softassert=new SoftAssert();
		appoinment.requestAppointment();
		appoinment.type();
		appoinment.fixdays();
		appoinment.fixdayss();
		appoinment.confirmDays("byValue","string:DAYS");
		appoinment.fixweeks();
		appoinment.fixweekss();
		appoinment.confirmweeks("byValue","string:WEEKS");
		appoinment.saveAppoinment();
		softassert.assertAll();
		Thread.sleep(1000);
		
	}
	@Test(priority=8)
	public void editregistration() throws IOException, InterruptedException {
		SoftAssert softassert=new SoftAssert();
		editregistration.editregistration();
		editregistration.editgraphic();
		editregistration.demographicchange();
		editregistration.editcontactdetails();
		editregistration.screenShot();
		softassert.assertAll();
		Thread.sleep(1000);
	}
	@Test(priority=9)
	public void deletepatient() throws InterruptedException {
		SoftAssert softassert=new SoftAssert();
		deletepage.deletepatientt();
		softassert.assertAll();
		Thread.sleep(1000);

	}
	@Test(priority=10)
	
	public void LogOut() {
		SoftAssert softassert=new SoftAssert();
		logoutpage.logoutt();
		softassert.assertAll();
		
	}
/*	@AfterTest
	public void afterMethod() {
		driver.close();
		
	}*/

	}
	
	
	

