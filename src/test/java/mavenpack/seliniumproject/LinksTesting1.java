package mavenpack.seliniumproject;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class LinksTesting1 extends BaseTest
{
	
	@BeforeMethod
	public void setup() throws Exception
	{
		init();
	       System.setProperty("webdriver.chrome.driver","C:\\Users\\123\\Desktop\\Latest drivers\\chromedriver.exe");

		test = report.startTest("LinksTesting1");
		test.log(LogStatus.INFO, "Init the Properties files.....");
		
		browserLaunch("chromebrowser");
		test.log(LogStatus.INFO, "Opened the browser :-" + p.getProperty("chromebrowser"));
		
		navigate("googleurl");
		test.log(LogStatus.INFO, "Navigated to url :-" + childProp.getProperty("googleurl"));
		
		maximizeWindow();
	}
	
	@Test()
	public void linktesting1()
	 {
		String expval="Google Images";
		
		driver.findElement(By.linkText("Images")).click();	
		Reporter.log("Clicked on Image Link");
		String actval=driver.getTitle();
		
		Assert.assertEquals(actval, expval);
		
	 }
	
	@AfterMethod(groups = {"regression"})
	public void tearDown()
	{
		System.out.println("iam aftermethod....");
	    driver.quit();
	    
	    report.endTest(test);
		report.flush();
	}

}
