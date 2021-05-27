package pom;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class POM_003 extends BaseTest{
  @Test
  public void f()
  {
	NewTest2 nw = new NewTest2(driver);
	nw.testnow(driver);
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://automationpractice.com/index.php");
  }

  @AfterMethod
  public void afterMethod() {
  }

}
