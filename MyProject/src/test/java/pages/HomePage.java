package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.WebTestBase;

public class HomePage extends WebTestBase{
	
	@FindBy(xpath="//div[@class='col-12 col-sm-12 col-md-12 col-lg-12']/h4")
	WebElement home_pageverify;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	
	}
	public String gettextofsearch() {
		return home_pageverify.getText();
	}

}
