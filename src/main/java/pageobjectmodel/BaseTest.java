package pageobjectmodel;


import java.io.FileInputStream;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BaseTest 
{
	public static WebDriver driver;
	public static String projectPath=System.getProperty("user.dir");
	public static FileInputStream fis;
	public static Properties p;
	public static Properties parentProp;
	public static Properties childProp;
	public static Properties orprop;
	public static ExtentReports report;
	public static ExtentTest test;
	
	public static void init() throws Exception
	{
		fis = new FileInputStream(projectPath+"\\data.properties");
		p = new Properties();
		p.load(fis);
		
		fis = new FileInputStream(projectPath+"\\environment.properties");
		parentProp = new Properties();
		parentProp.load(fis);
		String e = parentProp.getProperty("env");
		System.out.println(e);
		
		fis = new FileInputStream(projectPath+"//"+e+".properties");
		childProp = new Properties();
		childProp.load(fis);
		System.out.println(childProp.getProperty("amazonurl"));
		
		fis=new FileInputStream(projectPath+"\\or.properties");
		orprop=new Properties();
		orprop.load(fis);
		
		fis=new FileInputStream(projectPath+"\\log4jconfig.properties");
		PropertyConfigurator.configure(fis);
		
		//report=ExtentManager.getInstane();
		
	}
	
	public static void browserLaunch(String browser)
	{
			
		if(p.getProperty(browser).equals("chrome"))
		{
			ChromeOptions option=new ChromeOptions();
			option.addArguments("user-data-dir=C:\\Users\\123\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 2");
		option.addArguments("--disable-notifications");
			driver = new ChromeDriver(option);
		}
		else if(p.getProperty(browser).equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		
	}
	
	public static void navigate(String url)
	{
		driver.get(childProp.getProperty(url));
	}
	
	public static void windowClose() 
	{
		driver.quit();
	}

	public static void windowRefresh() 
	{
		driver.navigate().refresh();
	}

	public static void windowForward() 
	{
		driver.navigate().forward();
	}

	public static void windowBack() 
	{
		driver.navigate().back();
	}

	public static void deleteCookies() 
	{
		driver.manage().deleteAllCookies();
	}

	public static String windowCurrentUrl() 
	{
		String url = driver.getCurrentUrl();
		return url;
	}

	public static String windowTitle() 
	{
		String title = driver.getTitle();
		return title;
	}

	public static void maximizeWindow()
	{
		driver.manage().window().maximize();
	}
	
	public static void wait(int milliSeconds) throws Exception
	{
		Thread.sleep(milliSeconds);
	}
	public static void clickElement(String locatorkey) 
	{
		getLocator(locatorkey);
		driver.findElement(By.xpath(orprop.getProperty(locatorkey))).click();
		
		}

	public static void typetext(String locatorkey, String text) 
	{
		getLocator(locatorkey);
		driver.findElement(By.name(orprop.getProperty(locatorkey))).sendKeys(text);
		
		
	}

	public static void selectoption(String locatorkey, String option) 
	{
		getLocator(locatorkey);
		driver.findElement(By.id(orprop.getProperty(locatorkey))).sendKeys(option);
		
		
	}
public static void getLocator(String locatorkey) 
{
	
 WebElement element = null;
 
	if(locatorkey.endsWith("_id"))
	{
		driver.findElement(By.id(orprop.getProperty(locatorkey)));
	}
	else if(locatorkey.endsWith("_name"))
	{
		driver.findElement(By.name(orprop.getProperty(locatorkey)));
		
	}
	else if(locatorkey.endsWith("_classname"))
	{
		driver.findElement(By.className(orprop.getProperty(locatorkey)));
		
	}
	else if(locatorkey.endsWith("_xpath"))
	{
		driver.findElement(By.xpath(orprop.getProperty(locatorkey)));	
	}
	else if(locatorkey.endsWith("_cssSelector"))
	{
		driver.findElement(By.cssSelector(orprop.getProperty(locatorkey)));	
	
	}
	else if(locatorkey.endsWith("_linktext"))
	{
		driver.findElement(By.linkText(orprop.getProperty(locatorkey)));	
	}
	else if(locatorkey.endsWith("_PartiallinkText"))
	{
		driver.findElement(By.partialLinkText(orprop.getProperty(locatorkey)));	
	}
	else if(locatorkey.endsWith("_tagName"))
	{
		driver.findElement(By.tagName(orprop.getProperty(locatorkey)));	
	}

	
	}
public static void waitForElement(WebElement locator,int timeOutInSeconds,String waittype)
{
	WebDriverWait wait=new WebDriverWait(driver, timeOutInSeconds);
	if(waittype.equals("element visible"))
	{
		wait.until(ExpectedConditions.visibilityOf(locator));
	}
	else if(waittype.equals("element clickable"))
	{
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	
}
public  int ranNum()
{
	Random r=new Random();
	int a = r.nextInt(99999);
	return a ;
}
}




