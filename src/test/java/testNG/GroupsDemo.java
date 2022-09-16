package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GroupsDemo {

	@BeforeMethod(alwaysRun = true)
	public void tc1()
	{
		Reporter.log("tc1", true);
	}
	
	@AfterMethod(alwaysRun = true)
	public void tc2()
	{
		Reporter.log("tc2", true);
	}
	
	@Test(groups="tc3")
	public void tc3()
	{
		Reporter.log("tc3", true);
	}

	@Test(groups="tc4")
	public void tc4()
	{
		Reporter.log("tc4", true);
	}
}
