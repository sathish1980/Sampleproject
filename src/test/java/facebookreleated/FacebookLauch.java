package facebookreleated;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Util.properyclass;
import frame.BaseFramework.Browser;

public class FacebookLauch extends Browser 
{
	properyclass pc= new properyclass();
	String Filepath="C:\\Users\\sathish.kumar15\\eclipse-workspace\\BaseFramework\\InputFiles\\";
	String Filename="input.xls";
	String Sheetname="input";
	String Sheetname_1="accountcreation";
	
	@BeforeSuite
	public void luanch()
	{
		firstmethod();
	}
	
	@BeforeTest
	public void maximizee()
	{
		driver.manage().window().maximize();
	}
	
	@Test(priority=0)
	public void loadtheurl()
	{
		try 
		{
			driver.get(pc.getObjectRepository(new File(env_prop)).getProperty("URL"));
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@DataProvider(name="inputdata")
	public String[][] data() throws IOException	
	{
		 return Util.excelread.excelreaddata( Filepath, Filename,Sheetname );
	
	}
	@DataProvider(name="accountcreation")
	public String[][] acc() throws IOException	
	{
		 return Util.excelread.excelreaddata( Filepath, Filename,Sheetname_1 );
	
	}

@AfterSuite
public void teardown()
{
	driver.close();
	driver.quit();
}
}
