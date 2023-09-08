package datadrivetestParameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example1 {

	@Test
	@Parameters({"username","password"})
	public void Testcase1(String uname,String pword) {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.xpath("//*[@id='username']"));
		username.sendKeys(uname);
		
		WebElement password=driver.findElement(By.xpath("//input[@name='pwd']"));
		password.sendKeys(pword);
	}
}
