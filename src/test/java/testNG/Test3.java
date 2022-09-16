package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {
	
	@Test
	public void tc3()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("pass");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		driver.close();
	}
}
