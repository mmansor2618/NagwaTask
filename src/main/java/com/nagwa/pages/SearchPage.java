package com.nagwa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.beans.Visibility;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nagwa.base.TestBase;

import io.appium.java_client.functions.ExpectedCondition;


public class SearchPage extends TestBase {

	public SearchPage() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
	
	
	// inspecting elements so the user can navigate to questions page
	
	@FindBy (xpath = "//button[@type='button']")

	WebElement searchIcon;
	
	@FindBy (xpath = "//input[@id='txt_search_query']")
	
	WebElement textBoxField;
	
@FindBy (linkText = "Vector Addition")
	
	WebElement secondLesson;
	

@FindBy (className = "question-preview")

WebElement worksheetPreview;









	
	

public void  navigateToQuestions() throws AWTException {
	
// clicking on search icon
searchIcon.click();
// sending value at the textbox field using data behavior developemnt by getting value from configuration file

textBoxField.sendKeys(prop.getProperty("textBoxField"));
// using Robot class so we can make keyboard action like pressing on enter
Robot robot = new Robot(); 

robot.keyPress(KeyEvent.VK_ENTER);
// clicking on the second lesson 
secondLesson.click();

// clicking on preview option of worksheet section

worksheetPreview.click();








}

// method or function to calculate no of questions at questions page

public int  gettingNoOfQuestions() throws AWTException {
	
// getting size of elements which integer value represent no of questions
	System.out.println(driver.findElements(By.xpath("//div[@class='instances']/div")).size());
	
	
	// return size value so we can use it in assertion to compare actual result with expected
	
	return driver.findElements(By.xpath("//div[@class='instances']/div")).size();
	
	
	
}

}

