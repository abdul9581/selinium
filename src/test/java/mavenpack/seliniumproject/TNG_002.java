package mavenpack.seliniumproject;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TNG_002 extends BaseTest
{
	 @BeforeMethod
	  public void startProcess() throws Exception
	 {
		 System.out.println("i am before method");
		 init();
	       System.setProperty("webdriver.chrome.driver","C:\\Users\\123\\Desktop\\Latest drivers\\chromedriver.exe");
	       test=report.startTest("TNG_002");
	       test.log(LogStatus.INFO, "init the properties files...");

			browserLaunch("chromebrowser");
			test.log(LogStatus.INFO, "open the browser:"+p.getProperty("chromebrowser"));
			
			navigate("amazonurl");
			test.log(LogStatus.INFO, "navigate to url:"+childProp.getProperty("amazonurl"));
			
			maximizeWindow();
	  }
  @Test
  public void amazon()
  {
	  
	  selectoption("amazondropdown_id","Books");
		test.log(LogStatus.PASS, "selected option books by using locator:"+orprop.getProperty("amazondropdown_id"));
	
		typetext("amazontextbox_name","Harry Potter");
		test.log(LogStatus.FAIL,"entered the harry potter by using locator:"+orprop.getProperty("amazontextbox_name"));
	
		clickElement("amazonsearchbutton_xpath");
		test.log(LogStatus.INFO,"clicked on amazon search button by using loacator:"+orprop.getProperty("amazonsearchbutton_xpath"));
  }
 

  @AfterMethod
  public void endProcess() 
  {
	  System.out.println("i am after method");
	  driver.quit();
	  report.endTest(test);
	  report.flush();
  }

}
