package testpk4;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Ce_4 {
	WebDriver driver;

	@Test
	public void f() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement Username = driver.findElement(By.name("username"));
		Username.sendKeys("Admin");
		WebElement Password = driver.findElement(By.name("password"));
		Password.sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(5000);
		WebElement Title = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6"));
		String Acttxt = Title.getText();
		String Exptxt = "Dashboard";
		Assert.assertEquals(Acttxt, Exptxt);
		if(Acttxt.equals(Exptxt)) {
			System.out.println("User is successfully Logged in");
		} else {
			System.out.println("Not successful");
		}
			

	}
	@Test
	public void g() throws InterruptedException {
		driver.findElement(By.className("oxd-userdropdown-tab")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
		
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
	}

}