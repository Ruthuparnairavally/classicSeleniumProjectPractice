package dataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderDemo {

	@DataProvider
	public Object[][] getData()
	{
		Object [][] obj = new Object[3][2];
		
		obj[0][0] = "abcde";
		obj[0][1] = "12345";
		
		obj[1][0] = "fghij";
		obj[1][1] = "67890";
		
		obj[2][0] = "klmno";
		obj[2][1] = "111213";
		
		return obj;
	}
	
	@Test(dataProvider = "getData")
	public void test(String user, String password){	
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	
	driver.findElement(By.id("email")).sendKeys(user);
	driver.findElement(By.id("pass")).sendKeys(password);
	driver.findElement(By.name("login")).click();
	
	driver.close();
	
	}
	
}
