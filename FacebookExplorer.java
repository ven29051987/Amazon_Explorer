package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookExplorer {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srini\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.facebook.com");
	
	driver.findElement(By.linkText("Create New Account")).click();
	Thread.sleep(1000);
	driver.findElement(By.name("firstname")).sendKeys("venkatesh");
	Thread.sleep(1000);
	driver.findElement(By.name("lastname")).sendKeys("srinivasan");
	Thread.sleep(1000);
	driver.findElement(By.name("reg_email__")).sendKeys("srinivenkat1987@gmail.com");
	Thread.sleep(1000);
	driver.findElement(By.name("reg_email_confirmation__")).sendKeys("srinivenkat1987@gmail.com");
	Thread.sleep(1000);
	driver.findElement(By.id("password_step_input")).sendKeys("venkat21167");
	Thread.sleep(1000);
	driver.findElement(By.id("day")).sendKeys("29");
	Thread.sleep(1000);
	driver.findElement(By.name("birthday_month")).sendKeys("may");
	Thread.sleep(1000);
	driver.findElement(By.name("birthday_year")).sendKeys("1987");
	
	
		}

}
