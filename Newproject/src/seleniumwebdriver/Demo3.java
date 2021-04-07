package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\chromeversion\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		//driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("userName"));
		if(username.isEnabled())
		{
			username.clear();
			username.sendKeys("sunil");
		}
		if(username.isDisplayed())
		{
			WebElement pwd = driver.findElement(By.id("password"));
			pwd.clear();
			pwd.sendKeys("sunil");
			driver.findElement(By.id("submit")).click();
			}
}
}
