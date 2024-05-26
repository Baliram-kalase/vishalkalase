package utilityPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import BaseClass.Baseclass;

public class Util extends Baseclass {
	
	public static String readDataFromPropertyFile(String data) throws IOException {
		Properties properties = new Properties();
		FileInputStream file = new FileInputStream("D:\\eclipse\\Budsbeyond\\property.properties");
		properties.load(file);
		String value = properties.getProperty(data);
		return value;
//		public static void readDataFromPropertyFile2() {
//			Properties prop = new Properties();
//			FileInputStream file = new FileInputStream("D:\\\\eclipse\\\\Budsbeyond\\\\property.properties");
//            prop.load(file);
//           Object value = prop.getProperty(data);
//		}
	
	}
	public static void TakeScreenShot(WebDriver driver) throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File file = new File("Pictures");
		FileHandler.copy(src, file);
	}
	
	public static void implicitwait(int value) {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(value));
	}
	
    public static void readDataFromExcel() {
    	File myfile = new File("C:\\Users\\avish\\Desktop\\vishal.xlsx");
       // workBookFactory.create(myfile).getSheet("sheet1").getrow().getCell().getStringCellValue();
    }
	}


