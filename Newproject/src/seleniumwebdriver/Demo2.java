package seleniumwebdriver;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\chromeversion\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("txtUsername"));
		if(username.isEnabled())
		{
			username.clear();
			username.sendKeys("Admin");
		}
		if(username.isDisplayed())
		{
			WebElement pwd = driver.findElement(By.id("txtPassword"));
			pwd.clear();
			pwd.sendKeys("admin123");
			driver.findElement(By.id("btnLogin")).click();
			Thread.sleep(3000);
			//to find how many links are there
			List<WebElement> links = driver.findElements(By.tagName("a"));
			System.out.println(links.size());
			for(int i=0;i<links.size();i++) {
				System.out.println(links.get(i).getText());
			}
		}
		else
		{
			System.out.println("not displayed");
		}
	}
}