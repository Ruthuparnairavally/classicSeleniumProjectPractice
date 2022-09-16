package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {
	@Test
	public void tc1() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement ele1 = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement ele2 = driver.findElement(By.xpath("//h1[text()='Block 3']"));
		
		Actions a = new Actions(driver);
		a.clickAndHold(ele1).moveToElement(ele2).release().perform();
		
		driver.close();
	}
}
