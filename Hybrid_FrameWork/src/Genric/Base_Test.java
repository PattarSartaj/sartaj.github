package Genric;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test 
{
public WebDriver driver;
@BeforeMethod
public void oprnAppln()
{
	System.setProperty(chrome_key,chrome_value);
	driver=new ChromeDriver();
	driver.get(baseURL);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
}
@AfterMethod
public void closeAppn()
{
	driver.close();
}

}
