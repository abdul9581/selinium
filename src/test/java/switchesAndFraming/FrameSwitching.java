package switchesAndFraming;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import mavenpack.seliniumproject.BaseTest;

public class FrameSwitching  extends BaseTest
{

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\123\\Desktop\\Latest drivers\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://docs.oracle.com/javase/8/docs/api/");
		  
			driver.switchTo().frame(0);

		  driver.findElement(By.linkText("java.applet"));
		  driver.switchTo().defaultContent();
		  
		  driver.switchTo().frame(driver.findElement(By.name("packageFrame")));
			driver.findElement(By.linkText("Applet")).click();

	}

}
