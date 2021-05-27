package mavenpack.seliniumproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class checkbox1 extends BaseTest
{
  
	@BeforeMethod()
	
	  public void beforeMethod() throws Exception 
	  {
		init();
	     System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
        test = report.startTest("checkbox1");
		test.log(LogStatus.INFO, "Init the Properties files.....");
		
		browserLaunch("chromebrowser");
		test.log(LogStatus.INFO, "Opened the browser :-" + p.getProperty("chromebrowser"));
		
		navigate("checkboxurl");
		test.log(LogStatus.INFO, "Navigated to url :-" + childProp.getProperty("checkboxurl"));
		
		maximizeWindow();
	  }
	  
	  
	@Test()
	public void checkboxTest()
	{
		List<WebElement> check=driver.findElements(By.xpath("//td[@class='table5']/input[@type='checkbox']"));
		for(int i=0;i<check.size();i++)
		{
			System.out.println(check.get(i).getAttribute("value")+"--"+check.get(i).getAttribute("checked"));
			//System.out.println(check.get(i).isSelected());
		}
	}
 

  @AfterMethod(groups = {"regression","smoke"})
  public void afterMethod() 
  {
	  System.out.println("iam aftermethod....");
	   // driver.quit();
	    
	    //report.endTest(test);
		//report.flush();
  }

}
