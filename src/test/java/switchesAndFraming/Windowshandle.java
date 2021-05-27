package switchesAndFraming;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowshandle {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\123\\Desktop\\Latest drivers\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  driver.get("https://www.sc.com/in/bank-with-us/online-banking-login/");
		  System.out.println(driver.getTitle());
		  String parentwindow = driver.getWindowHandle();
		  System.out.println("parent window:" + parentwindow);
		  driver.findElement(By.xpath("//a[@title='Apply Now']")).click();
		  Set<String> multiplewindow = driver.getWindowHandles();
		 Iterator<String> itr = multiplewindow.iterator();
		 while(itr.hasNext())
		 {
			 String currentWindow=itr.next();
			 System.out.println("windows id's:"+ currentWindow);
			 if(!currentWindow.equals(parentwindow))
			 {
				 driver.switchTo().window(currentWindow);
			 }
			 
			 
		 }
			 String childwindowTitle = driver.getTitle();
			 System.out.println("ChildWindow Title :" + childwindowTitle);
		  driver.close();
		  driver.switchTo().window(parentwindow);
		  System.out.println("parent window title:"+ driver.getTitle());
		  driver.quit();
		  
	}

}
