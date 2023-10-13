package utils;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import testBase.WebTestBase;

public class Utility extends WebTestBase{
	
	public static void doubleClick(WebDriver driver,WebElement element) throws InterruptedException {
		Actions a=new Actions(driver);
		a.doubleClick(element).perform();
		Thread.sleep(2000);
	}
	
	public static void doubleClick_Bdymonth(WebDriver driver,WebElement element) throws InterruptedException {
		Actions a=new Actions(driver);
		a.doubleClick(element).perform();
		
	}
	public static void click_Bdymonth(WebElement element,String term,String value) throws InterruptedException {
		Select bdymonth=new Select(element);
		if(term.equalsIgnoreCase("byValue")) {
			bdymonth.selectByValue(value);
			Thread.sleep(2000);
	}
	}
		public static void click_Relative(WebElement element,String term,String value) throws InterruptedException {
			Select relative=new Select(element);
			if(term.equalsIgnoreCase("byValue")) {
				relative.selectByValue(value);
				Thread.sleep(2000);
			
		}
	}
		
		public static void fix_days(WebElement element,String term,String value) throws InterruptedException {
			Select day=new Select(element);
			if(term.equalsIgnoreCase("byValue")) {
				day.selectByValue(value);
				Thread.sleep(2000);
		}}
		public static void fix_weeks(WebElement element,String term,String value) throws InterruptedException {
			Select week=new Select(element);
			if(term.equalsIgnoreCase("byValue")) {
				week.selectByValue(value);
				Thread.sleep(2000);
		}}
		public static void screenShotAction(WebDriver driver,WebElement screenshot) throws IOException, InterruptedException {
			TakesScreenshot S=(TakesScreenshot)driver;
			File source=S.getScreenshotAs(OutputType.FILE);
			File destination=new File("F:\\Myproject/Patientdetails.png");
			FileUtils.copyFile(source, destination);
			Thread.sleep(1000);
		}
		public static void clicklogout(WebDriver driver, WebElement element) {
			// TODO Auto-generated method stub
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();",element);
		}
		public static void getCookies() {
			Set<Cookie> cookies=driver.manage().getCookies();
			for(Cookie c:cookies) {
				System.out.print(c);
			}
			driver.manage().deleteAllCookies();
			
		}
		
		
}
