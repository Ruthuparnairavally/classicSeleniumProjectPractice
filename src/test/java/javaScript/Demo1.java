package javaScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {

	@Test
	public void tc1()
	{
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--incognito");
		//options.addArguments("--headless");
		options.addArguments("start-maximized");
		
		WebDriver driver = new ChromeDriver(options);
		//driver.manage().window().maximize();
		driver.get("https://online.qspiders.com/student");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		js.executeScript("window.scrollBy(0,-500)");
	}
}
