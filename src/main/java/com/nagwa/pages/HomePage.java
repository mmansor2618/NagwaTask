package com.nagwa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.beans.Visibility;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nagwa.base.TestBase;

import io.appium.java_client.functions.ExpectedCondition;

public class HomePage extends TestBase {
	
public HomePage() throws IOException {
		
	PageFactory.initElements(driver, this);
	
	
		
	}



// inspecting elements of Home page




@FindBy (xpath = "//span[contains(text(),'English')]")

WebElement langoption;


@FindBy (xpath="//a[@href='https://www.nagwa.com/en/']")

WebElement enoption;








// method or function to click on EN Language

public void  clickOnLanguage() {
	
	 driver.get(prop.getProperty("URL"));
	driver.manage().window().maximize();
	
langoption.click();	
enoption.click();

		
}




}





