package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewTest2 extends BaseTest

{
	
	//@FindBy(xpath="//a[contains(text(),'Sign in')]")public WebElement signIn;
	//@FindBy(id="email")public WebElement emailAddress;
	//@FindBy(id="passwd")public WebElement password;
	@FindBy(linkText="WOMEN")public WebElement Womentab;
	//@FindBy(id="SubmitLogin")public WebElement submitLogin;
	@FindBy(linkText="TOPS")public WebElement tops;
	@FindBy(linkText="T-shirts")public WebElement Tshirts;

    public NewTest2(WebDriver driver) 

    {
    	PageFactory.initElements(driver, this);
	}


	public void testnow(WebDriver driver)
	{
	
		
		       //signIn.click();
				//Thread.sleep(3000);
				//emailAddress.sendKeys("Prakashchary01234@gmail.com");
				//password.sendKeys("Chinna@12345");
				//submitLogin.click();
				Womentab.click();
				tops.click();
				Tshirts.click();
				
	}
}