package pom;

import org.testng.annotations.Test;

import mavenpack.seliniumproject.BaseTest;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class POM_002 extends BaseTest
{
  @BeforeMethod
  public void beforeMethod() throws Exception 
  {
	  init();
	  System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.get("http://automationpractice.com/index.php");
	  driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	  
  }
  @Test
  public void login() throws InterruptedException 
  
  {
	  Loginpage lp = new Loginpage(driver);
	  lp.Loginpage();
	  
	 // Assert.assertEquals(l.verifyLogin(), "Authentication failed.");
	  
  }

  @AfterMethod
  public void afterMethod() 
  {
	  
  }

}
