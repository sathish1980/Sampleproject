package Pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Util.properyclass;
import frame.BaseFramework.Commonclass;

public class facebook_logoutPAGE {
	Commonclass cs= new Commonclass();
	properyclass pc= new properyclass();
	WebDriver driver;
	
	public facebook_logoutPAGE(WebDriver driver)
	{
		this.driver=driver;
	}
	public void logoutdropdown(String obj_prop) throws IOException
	{
		By logout_drop=cs.locatorfromprop(pc.getObjectRepository(new File(obj_prop)).getProperty("logout_dropdown"));
		cs.waitforelementbyxpath(driver,logout_drop);
		driver.findElement(logout_drop).click();
	}
	
	public void logoutbutton(String obj_prop) throws IOException
	{
		By logout_but=cs.locatorfromprop(pc.getObjectRepository(new File(obj_prop)).getProperty("logout_button"));
		cs.waitforelementbyxpath(driver,logout_but);
		driver.findElement(logout_but).click();
	}
}
