package BudsBeyondTestClasses;

import org.testng.annotations.Test;

import BaseClass.Baseclass;
import budsbeyondPomClasses.BudsBeyondBcHashPage;
import budsbeyondPomClasses.BudsBeyondDashBoardPage;
import utilityPackage.Util;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class ValidateRelatedSearchesForBudsBeyond extends Baseclass {
	
	BudsBeyondDashBoardPage dash;
	BudsBeyondBcHashPage hash;
	  @BeforeClass
	  public void launchingUrl() throws IOException {
		  launchBudsBeyondURL();
	  }
	  @BeforeMethod
	  public void beforeMethod() throws InterruptedException {
		  
		  dash = new BudsBeyondDashBoardPage(driver);
		  hash = new BudsBeyondBcHashPage(driver);
		  Util.implicitwait(2000);
		  dash.clickOnYesButton();
		  Util.implicitwait(2000);
		  //dash.clickOnCloseButton();
		  Thread.sleep(2000);
		  dash.clickOnConcentrate(driver);
		 hash
		  .moveOnselectOption(driver);
		 hash .clickOnYesButton(driver);
		 hash.clickOnSelectOptions();
		  
	  }
  @Test
  public void ValidateRelatedSesarches() {
	 List<WebElement> list = hash.getRelatedSearches(driver);
	 for(WebElement a:list) {
		 String actual = a.getText();
		 String expected = "EVEREST EXTRACTS – Shatter (1g)";
		 if(actual.equals(expected)) {
			 System.out.println("the Actual and expected result is matching");
		 }
				 
		 System.out.println(a.getText());
		 
	 }
  }
 

  @AfterMethod
  public void closeBrowser() {
	  driver.quit();
  }



  

}
