package PomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom 
{
@FindBy(id="email")
private WebElement username;//pom class
@FindBy(name="pass")
private WebElement pass;
@FindBy(name="login")
private WebElement log_btn;

public Pom(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void username(String data)
{
	username.sendKeys(data);
}
public void pwd(String data1)
{
	pass.sendKeys(data1);
}
public void click_btn()
{
	log_btn.click();
}
}
