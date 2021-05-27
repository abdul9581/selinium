package pom;

import org.testng.annotations.Test;

import mavenpack.seliniumproject.BaseTest;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class POM_001 extends BaseTest
{
  @BeforeMethod
  public void startProcess() 
  {
	  System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://automationpractice.com/index.php");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
  @Test
  public void login() throws InterruptedException 
  {
	  Login l = new Login(driver);
	  
	  l.login();
	  l.performmousehover(driver);
	  l.vadilidity(driver);
	 
	//  Assert.assertEquals(l.verifyLogin(), "Authentication failed.");
	  
  }

  @AfterMethod
  public void endProcess() 
  {
	  
  }

}
