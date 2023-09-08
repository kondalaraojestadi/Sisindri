package loginapplications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CorrectUsernameAndPassword {

	@Test
		public void Testcase1() throws Throwable {
			
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver=new FirefoxDriver();
			
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			
			WebElement Email=driver.findElement(By.xpath("//input[@id='email']"));
			Email.sendKeys("kondalaraojestadi@gmail.com");
			Thread.sleep(3000);
			
	        WebElement Password=driver.findElement(By.xpath("//input[@id='pass']"));
	        Password.sendKeys("Kondal@123");
	        Thread.sleep(3000);
	        
	        WebElement Login=driver.findElement(By.xpath("//button[@name='login']"));
	        Login.click();
	        
	        driver.quit();
	        
		}
}
