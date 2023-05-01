package testpk5;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Ce_5_2 {
	WebDriver driver;
	
	@Test
	public void f() throws InterruptedException {
		driver.get("https://www.godaddy.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/header/div/section/div/div[1]/nav/div[2]/div[1]/ul/li[1]/button")).click();
		Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/header/div/section/div/div[1]/nav/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul/li[2]/a")).click();
	    Thread.sleep(3000);
	}

	@BeforeClass
	public void beforeMethod() {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@AfterClass
	public void afterMethod() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}

}