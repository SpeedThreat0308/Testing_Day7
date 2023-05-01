package testpk2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Ce_2 {
	WebDriver drive;
  @Test(priority=2)
  public void add() {
	  int a=10,b=20,add=0;
	  add=a+b;
	  System.out.println(add);
	  Assert.assertEquals(add,30);
  }
  @Test(priority=3)
  public void sub() {
	  int a=30,b=20,sub=0;
	  sub=a-b;
	  System.out.println(sub);
	  Assert.assertEquals(sub,10);
  }
  @Test(priority=1)
  public void div() {
	  int a=30,b=10,div=0;
	  div=a/b;
	  System.out.print(div);
	  Assert.assertEquals(div,3);
  }
  @Test(priority=4)
  public void mul() {
	  int a=10,b=20,mul=1;
	  mul=a*b;
	  System.out.print(mul);
	  Assert.assertEquals(mul,200);
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  
  }
  
  @AfterMethod
  public void aftermethod() {
	  
  }

}
