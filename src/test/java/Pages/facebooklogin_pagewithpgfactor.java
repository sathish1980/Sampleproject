package Pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Util.properyclass;
import frame.BaseFramework.Commonclass;

public class facebooklogin_pagewithpgfactor {
	@FindBy(id="email")
	WebElement email;
	@FindBy(id="pass")
	WebElement password;
	@FindBy(id="loginbutton")
	WebElement loginclick;
	Commonclass cs= new Commonclass();
	properyclass pc= new properyclass();
	String screenshotfilepath="C:\\Users\\sathish.kumar15\\eclipse-workspace\\BaseFramework\\Screenfolder\\";
	int count=0;
	WebDriver driver;

	public facebooklogin_pagewithpgfactor(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);	
	}

	public void username(String user_name)
	{
			email.sendKeys(user_name); 
	}
	
	public void password(String pass)
	{
			password.sendKeys(pass);
	}
	public void login_click()
	{
			loginclick.click();
	}

}
