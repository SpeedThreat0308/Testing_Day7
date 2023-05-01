package testpk1;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Ce_1 {
	WebDriver driver;
  @Test
  public void checkTitle() {
	  driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
	  String expectedTitle="Guest Registration Form – User Registration";
	  String actualTitle=driver.getTitle();
	  Assert.assertEquals(expectedTitle,actualTitle);
  }
  @BeforeMethod
  public void beforeMethod() {
	  ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver(co);
		driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
		driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
  }

}