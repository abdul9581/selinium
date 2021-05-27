package mavenpack.seliniumproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class RadioButton1 extends BaseTest
{
	
	@BeforeMethod()
	  public void beforeMethod() throws Exception 
	  {
		init();
	       System.setProperty("webdriver.chrome.driver","C:\\Users\\123\\Desktop\\Latest drivers\\chromedriver.exe");

		test = report.startTest("RadioButton1");
		test.log(LogStatus.INFO, "Init the Properties files.....");
		 
		browserLaunch("chromebrowser");
		test.log(LogStatus.INFO, "Opened the browser :-" + p.getProperty("chromebrowser"));
		
		navigate("radiourl");
		test.log(LogStatus.INFO, "Navigated to url :-" + childProp.getProperty("radiourl"));
		
		maximizeWindow();
	  }
	
	
	@Test()
	public void radioButton1()
	{
		WebElement radio=driver.findElement(By.xpath("(//td[@class='table5'])[2]"));
		List<WebElement> rbutton=radio.findElements(By.name("group1"));
		for(int i=0;i<rbutton.size();i++)
		{
			System.out.println(rbutton.get(i).getAttribute("value")+ "----" + rbutton.get(i).getAttribute("checked"));
		}
	}
 

  @AfterMethod()
  public void afterMethod() 
  {
	  System.out.println("iam aftermethod....");
	    driver.quit();
	    
	    //report.endTest(test);
		//report.flush();
  }

}