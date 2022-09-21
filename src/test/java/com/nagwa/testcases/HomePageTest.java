package com.nagwa.testcases;


import java.awt.AWTException;
import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.nagwa.base.TestBase;
import com.nagwa.pages.HomePage;







public class HomePageTest extends TestBase {
	
	
	
	
	public HomePageTest() throws IOException {
		super();
	}
	
	

	
	
	
	 HomePage homePage;
	 

	
	


	// first test case clicking on EN language
	
	@Test (priority = 1)
	 
	public void clickOnLanguage() throws InterruptedException, IOException, AWTException   {
		

		// calling function to click on EN language
		homePage.clickOnLanguage();
		
		//assertion to compare current URL with expected result
		
		 String expectedResult = "https://www.nagwa.com/en/";
		 
		 String actualResult = driver.getCurrentUrl();
			
	Assert.assertEquals(actualResult, expectedResult,"it was failure because the expected result is not https://www.nagwa.com/en/");
		
		
		
	}
	
	
	@Parameters({"browser"})
	@BeforeMethod
	
	//Before method and intialize browser 
 	
	
		public void beforeSetup(String browser) throws IOException {
			
			intial(browser);
			

			
			
		 homePage = new HomePage();
		}

	
	
		
	

	
   @AfterMethod
	
   public void tearDown() throws IOException {
	   
	   // after method to close browser
	   
		  driver.quit();
		  
		   
	 }
	  
	
	
	

}
