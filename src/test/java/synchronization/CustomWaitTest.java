package synchronization;

import org.openqa.selenium.By;
  import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomWaitTest {
	
	@Test
	public void tc1()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone");
		 
		 while(true)
		 {
			 try 
			 {
				 driver.findElement(By.id("nav-search-submit-button")).click();
				 break;
			 }
			 catch(Exception e)
			 {
				 System.out.println("Element not found");
			 }
		 }
		
		
		driver.close();
	}
}
