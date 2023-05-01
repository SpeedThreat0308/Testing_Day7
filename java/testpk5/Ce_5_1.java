package testpk5;

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

public class Ce_5_1 {
	WebDriver driver;

	@Test
	public void f() throws InterruptedException {
		driver.get("https://www.godaddy.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement Title = driver.findElement(By.xpath("/html/body/main/section[1]/section/div/div[1]/div/div[1]/h2"));
		String Acttxt = Title.getText();
		String Exptxt = "Domain Names";
		Assert.assertEquals(Acttxt, Exptxt);
	}
	@Test
	public void g() throws InterruptedException {
		Thread.sleep(5000);
		String cururl=driver.getCurrentUrl();
		String url="https://www.godaddy.com/en-in";
		Assert.assertEquals(cururl,url);
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