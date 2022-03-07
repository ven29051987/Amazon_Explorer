package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonExplorer {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srini\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//span[@class=\"nav-line-1 nav-progressive-content\"])[2]")).click();		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("venkatvmm1987@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@class,'button')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@class,'span12')]")).sendKeys("venkat21167");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[contains(@class,'input')])[3]")).click();
		
		
		
		
		
		
	}

}
