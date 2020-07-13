package facebookreleated;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.facebook_logoutPAGE;
import Pages.facebooklogin_page;
import Pages.facebooklogin_pagewithpgfactor;
import Util.properyclass;
import frame.BaseFramework.Browser;
import frame.BaseFramework.Commonclass;

public class FaceBooklogin extends Browser
{
	String screenshotfilepath="C:\\Users\\sathish.kumar15\\eclipse-workspace\\BaseFramework\\Screenfolder\\";
	int count=0;

	@BeforeMethod
	public void screenshot()
	{
		TakeScreenshotmethod(screenshotfilepath,count);
		count++;
	}
	

	@Test(priority=0,dataProvider="inputdata",dataProviderClass=FacebookLauch.class)
	public void dataread(String user_name,String pass_word) throws IOException
	{
		facebooklogin_pagewithpgfactor fb= new facebooklogin_pagewithpgfactor(driver);
		fb.username(user_name);
		fb.password(pass_word);
		fb.login_click();
		facebook_logoutPAGE fl= new facebook_logoutPAGE(driver);
		fl.logoutdropdown(obj_prop);
		fl.logoutbutton(obj_prop);
		
	}

}
