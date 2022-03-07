package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srini\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("http://www.facebook.com");
		String title1 = driver.getTitle();
		System.out.println(title1);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("infosyslogin");
		WebElement password = driver.findElement(By.name("pass"));
          password.sendKeys("ven29051987");
driver.findElement(By.linkText("Log In")).click();	
Thread.sleep(3000);
driver.navigate().to("http://www.amazon.in");
Thread.sleep(3000);
driver.navigate().to("http://www.flipkart.com");
Thread.sleep(3000);
driver.navigate().to("http://cars24.com");
driver.navigate().back();
Thread.sleep(3000);
driver.navigate().forward();

String currentUrl = driver.getCurrentUrl();
System.out.println(currentUrl);
String title = driver.getTitle();
System.out.println(title);

driver.quit();


	}

}
