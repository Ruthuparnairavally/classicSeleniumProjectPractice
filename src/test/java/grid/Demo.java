package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	@Test
	public void tc1() throws MalformedURLException  {
		
		URL remoteAdress = new URL("http://192.168.170.110:4444/wd/hub"); //URL remoteAdress = new URL("https://192.168.1.101:4444/wd/hub");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("chrome");
		
		//WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new RemoteWebDriver(remoteAdress, capabilities);
		
		WebDriverManager.chromedriver().setup();
	
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("pass");
		driver.findElement(By.name("login")).click();
		
		driver.close();
	}
}
