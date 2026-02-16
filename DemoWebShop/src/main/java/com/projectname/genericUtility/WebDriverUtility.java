package com.projectname.genericUtility;

import org.openqa.selenium.WebDriver;

public class WebDriverUtility {
public void maximize(WebDriver driver)
{
	driver.manage().window().maximize();
}
public void minimize(WebDriver driver)
{
	driver.manage().window().minimize();
}
public void quit(WebDriver driver)
{
	driver.quit();
}
public void switchtoParentWindow(WebDriver driver,String ParentID)

{
	driver.switchTo().window(ParentID);
}

}
