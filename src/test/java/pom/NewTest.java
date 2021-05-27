package pom;

import org.testng.annotations.Test;

import mavenpack.seliniumproject.BaseTest;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class NewTest extends BaseTest 

{
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\123\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://automationpractice.com/index.php");
	  
	 // driver.get("https://www.amazon.in");
	  
	  
  }
  @Test
  public void f() 
  {
	  
	  driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
	  driver.findElement(By.id("email")).sendKeys("tq7568@gmail.com");
	  driver.findElement(By.id("passwd")).sendKeys("123456789");
	  driver.findElement(By.id("SubmitLogin")).click();
	  String actualTest = driver.findElement(By.xpath("//li[contains(text(),'Authentication failed.')]")).getText();
	  String expectedTest = "Authentication failed.";
	  Assert.assertEquals(actualTest, expectedTest); 
	  }
  @AfterMethod
  public void afterMethod() 
  {
  }

}
