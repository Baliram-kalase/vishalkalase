package budsbeyondPomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BudsBeyondDashBoardPage 
{  
	 @FindBy (xpath = "//span[text()='Yes']") private WebElement yesButton;
	 @FindBy (xpath="(//button[@title='Close'])[2]") private WebElement closeButton;
	 @FindBy(xpath = "//a/span[text()='Concentrates']") private WebElement Concentrate;
	 
	 @FindBy (xpath = "//a/span[text()='Hash (Hashish)']") private WebElement hash;
	 
	 
	 
	 public BudsBeyondDashBoardPage(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	 }
	 
	 public void clickOnYesButton() {
		 if(yesButton.isDisplayed()) {
			 yesButton.click();
		 }
		 else {
			 System.out.println("Button is not visible");
		 }
	
		 }
	 public void clickOnCloseButton() {
		 if(closeButton.isDisplayed()) {
			 closeButton.click();
		 }else {
			 System.out.println("Not displayed");
		 }
	 }
	 
	 public void clickOnConcentrate(WebDriver driver) throws InterruptedException {
		 Thread.sleep(2000);
		 Actions act = new Actions(driver);
		 act.moveToElement(Concentrate).build().perform();
		 //Concentrate.click();
		// Thread.sleep(3000);
		 hash.click();
		 
	 }
	 }

	

