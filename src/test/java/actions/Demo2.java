package actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo2 {

	@Test
	public void tc1() throws InterruptedException, AWTException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.xpath("(//a[text()='Customer Service'])[1]"));

		Actions a = new Actions(driver);
		a.contextClick(ele).perform();
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		driver.close();
	}
}
