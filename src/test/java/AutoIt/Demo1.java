package AutoIt;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {

	@Test
	public void tc1() throws InterruptedException, AWTException, IOException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("//a[@class='close'])")).click();
		
		driver.findElement(By.id("login_Layer")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("ruthu199425@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Duschlampe@10");
	
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		driver.findElement(By.xpath("//span[text()='Test Engineer']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Upload']")).click();
		Thread.sleep(2000);
		
		Runtime.getRuntime().exec("C:\\Users\\RUTHUPARNA\\Desktop\\AutoItDemo.exe");
	}
}
