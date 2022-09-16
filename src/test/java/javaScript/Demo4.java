package javaScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo4 {

	@Test
	public void tc1() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.xpath("//img[contains(@alt,'SANA Handloom Hand')]"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		System.out.println(js.executeScript("return Document.title"));
		System.out.println(js.executeScript("return document.URL"));
		js.executeScript("history.go(0)");
	}
}
