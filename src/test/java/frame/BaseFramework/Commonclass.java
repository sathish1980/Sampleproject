package frame.BaseFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Commonclass 
{
String[] split_s=null;
public static By output_locatorvalue=null;	
public By loactors(String locat,String value)
	{
		By locatorvalue = null;
		switch(locat)
		{
			case "id":
				locatorvalue=By.id(value);
				break;
			case "name":
				locatorvalue=By.name(value);
				break;
			case "classname":
				locatorvalue=By.className(value);
				break;
			case "xpath":
				locatorvalue=By.xpath(value);
				break;
			case "linktext":
				locatorvalue=By.linkText(value);
				break;
			case "partiallinktext":
				locatorvalue=By.partialLinkText(value);
				break;
			default:
				break;
			
		}
		return locatorvalue;
		
	}

public String[] String_split(String value)
{
	split_s=value.split("&");
	return split_s;
}

public By locatorfromprop(String value)
{
	String[] loc_string= String_split(value);
	String locator=loc_string[0];
	String locator_value=loc_string[1];
	output_locatorvalue=loactors(locator,locator_value);
	return output_locatorvalue;	
}

public void waitforelementbyxpath(WebDriver driver,By value)
{
	WebDriverWait wd= new WebDriverWait(driver,60);
	wd.until(ExpectedConditions.elementToBeClickable(value));
}
}
