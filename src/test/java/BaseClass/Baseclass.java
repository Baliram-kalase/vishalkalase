package BaseClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilityPackage.Util;



public class Baseclass 
{
	protected static WebDriver driver;
 
	public void launchBudsBeyondURL() throws IOException {
		 driver = new ChromeDriver();
		driver.get(Util.readDataFromPropertyFile("URL"));
	}

     
  
}
