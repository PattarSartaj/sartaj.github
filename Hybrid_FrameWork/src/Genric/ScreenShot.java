package Genric;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot 
{
public static void getPhoto(WebDriver driver)
{
	String phot="./photo/";
	Date d = new Date();
	String d1 = d.toString();
	String d2 = d1.replaceAll(":","-");
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dst = new File("F:\\sartaj\\fail.jpeg");
	
}
}
