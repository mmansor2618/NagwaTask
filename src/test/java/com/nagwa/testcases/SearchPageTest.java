package com.nagwa.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import com.nagwa.base.TestBase;
import com.nagwa.pages.HomePage;
import com.nagwa.pages.SearchPage;

public class SearchPageTest extends TestBase {

	public SearchPageTest() throws IOException {
		super();
		
	}
	
	 SearchPage searchPage;
	 
	 
	 // TestCase of Getting No of Questions
	 
	 @Test (priority = 2)
	 
	 public void gettingNoOFQuestions() throws InterruptedException, IOException, AWTException {
		 

		 HomePage homePageTest = new HomePage();
			homePageTest.clickOnLanguage();
			
			// calling navigate function to perform some steps to navigate to questions
			
			searchPage.navigateToQuestions();
			
			// assert steps to assert that the result will match the expected
			
			 int expectedResult = 10;
			 
			  
			  
			  int actualResult = searchPage.gettingNoOfQuestions();
				
		Assert.assertEquals(actualResult, expectedResult,"No of Questions is different than expected");
			
			
			
	 }
	
	
		
	 @Parameters({"browser"})
	 @BeforeMethod
	 
	 //Before method and intialize browser 
	 	
	 	public void beforeSetup(String browser) throws IOException, InterruptedException {
	 		
	 		intial(browser);
	 		

	 		
	 		
	 	 searchPage = new SearchPage();
	 	}
	 	
	    @AfterMethod
	    
	    // after method to close browser
	 	
	    public void tearDown() throws IOException {
	 	   
			  driver.quit();
			  
			   
		 }
	 	

}
