package dynamicXpath;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	@Test
	public void tc1()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("samsung");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'SAMSUNG Galaxy F22 (Denim Blue, 128 GB)')]/ancestor::div[@class='_3pLy-c row']//div[@class='_30jeq3 _1_WHN1']")).click();
		
		Set<String> ele = driver.getWindowHandles();
		
		for(String e : ele)
		{
			driver.switchTo().window(e);
		}
		
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		
	}
}
