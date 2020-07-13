package frame.BaseFramework;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser {
	String chromediverpath="C:\\Users\\sathish.kumar15\\Desktop\\SathishkumarR\\Personal\\EY\\chromedriver_win32\\chromedriver.exe";
	public static WebDriver driver= null;
	public String env_prop="C:\\Users\\sathish.kumar15\\eclipse-workspace\\BaseFramework\\PropertyFile\\envproperty.properties";
	public String obj_prop="C:\\Users\\sathish.kumar15\\eclipse-workspace\\BaseFramework\\PropertyFile\\Objectrepo.properties";
	  
	public void firstmethod()
	{
		
		System.setProperty("webdriver.chrome.driver",chromediverpath);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
		options.addArguments("--disable-notifications");
		driver =new ChromeDriver(options);
		
	}
	
	public void TakeScreenshotmethod(String filepath, int count)
	{
		
		TakesScreenshot ts= (TakesScreenshot)driver;
		  File SrcFile=ts.getScreenshotAs(OutputType.FILE);
		  File DestFile=new File(filepath+"filename_"+count+".png");

        //Copy file at destination

        try {
			FileUtils.copyFile(SrcFile, DestFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		
	}

}
