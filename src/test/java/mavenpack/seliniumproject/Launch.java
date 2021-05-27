package mavenpack.seliniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch {

	public static void main(String[] args) 
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\123\\Desktop\\Latest drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com");
	}

}
