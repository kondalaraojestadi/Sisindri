package loginapplications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CorrectUsernameAndWrongPassword {

	@Test
	public void Testcase2() {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
	}
}
