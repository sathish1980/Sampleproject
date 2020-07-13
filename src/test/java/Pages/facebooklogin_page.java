package Pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Util.properyclass;
import frame.BaseFramework.Commonclass;

public class facebooklogin_page {
	
	Commonclass cs= new Commonclass();
	properyclass pc= new properyclass();
	String screenshotfilepath="C:\\Users\\sathish.kumar15\\eclipse-workspace\\BaseFramework\\Screenfolder\\";
	int count=0;
	WebDriver driver;
	

	public facebooklogin_page(WebDriver driver)
	{
	this.driver=driver;
	}

	public void username(String user_name,String obj_prop)
	{
		try {
			driver.findElement(cs.locatorfromprop(pc.getObjectRepository(new File(obj_prop)).getProperty("Login_username"))).sendKeys(user_name);
		} 
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void password(String pass,String obj_prop)
	{
		try {
			driver.findElement(cs.locatorfromprop(pc.getObjectRepository(new File(obj_prop)).getProperty("Login_password"))).sendKeys(pass);
		} 
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public void login_click(String obj_prop)
	{
		try {
			driver.findElement(cs.locatorfromprop(pc.getObjectRepository(new File(obj_prop)).getProperty("Login_loginbutton"))).click();
		} 
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
