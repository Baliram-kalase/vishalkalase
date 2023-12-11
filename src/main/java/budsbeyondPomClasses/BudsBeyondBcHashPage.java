package budsbeyondPomClasses;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

public class BudsBeyondBcHashPage 
{
	@FindBy (xpath = "//a[text()='BC FINGER HASH']") private WebElement SelectOption;	
	 @FindBy (xpath = "//span[text()='Yes']") private WebElement yesButton;
	@FindBy (xpath = "fgfgfgggv") private WebElement vishal;
//	public BudsBeyondBcHashPage(WebDriver driver) {
//		PageFactory.initElements(driver, this);
//	}
	public BudsBeyondBcHashPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	 public void clickOnYesButton(WebDriver driver) {
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(10000));
		 wait.until(ExpectedConditions.visibilityOf(yesButton));
		 if(yesButton.isDisplayed()) {
			 yesButton.click();
		 }
		 else {
			 System.out.println("Button is not visible");
		 }
	 }
	public List<WebElement> getRelatedSearches(WebDriver driver) {
		By elementLocator = By.xpath("//div/a[@class='woocommerce-LoopProduct-link woocommerce-loop-product__link']");
		return driver.findElements(elementLocator);
	}
	public void moveOnselectOption(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.moveToElement(SelectOption).build().perform();
		//SelectOption.click();
	}
	public void clickOnSelectOptions() {
		SelectOption.click();
	}
}
