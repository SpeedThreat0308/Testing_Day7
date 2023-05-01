package testpk3;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Ce_3 {
	WebDriver driver;
  @Test
  public void enterdetials() throws InterruptedException {
	    Thread.sleep(3000);
	  	driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
	  	Thread.sleep(3000);
	  	driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
	  	Thread.sleep(3000);
	  	driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	  	Thread.sleep(5000);
	  	String name="Dashboard";
	  	WebElement Title=driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[1]/span/h6"));
	  	String txt=Title.getText();
	  	Assert.assertEquals(name, txt);
	  	
  }
  @BeforeMethod
  public void beforeMethod() {
	  ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver(co);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}