package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	     
       Actions action;
		//@FindBy(xpath="//a[contains(text(),'Sign in')]")public WebElement signIn;
		//@FindBy(id="email")public WebElement emailAddress;
		//@FindBy(id="passwd")public WebElement password;
		//@FindBy(id="SubmitLogin")public WebElement submitLogin;
		//@FindBy(xpath="//li[contains(text(),'Authentication failed.')]")public WebElement getLoginError;
		@FindBy(linkText="WOMEN")public WebElement Womentab;
		@FindBy(linkText="TOPS")public WebElement tops;
		@FindBy(linkText="T-shirts")public WebElement Tshirts;
		@FindBy(xpath="//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
		public WebElement image;
		@FindBy(xpath="//span[contains(text(),'More')]") public WebElement more;
		@FindBy(id="quantity_wanted") public WebElement quantity;
		@FindBy(id="group_1") public WebElement size;
		@FindBy(xpath="//span[contains(text(),'Add to cart')]") public WebElement addtocart;
		
		@FindBy(xpath="//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/span[1]/span[1]") public WebElement continueshopping;
		@FindBy(linkText="DRESSES")public WebElement Dresstab;
		//@FindBy(linkText="CASUALDRESSES")public WebElement casualdresses;
		@FindBy(xpath="//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]") public WebElement casualdresses;
		@FindBy(xpath="//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[1]/img[1]") public WebElement casualimage;
		@FindBy(xpath="//span[contains(text(),'More')]") public WebElement morego;
		@FindBy(xpath="//input[@id='quantity_wanted']") public WebElement casualquantity1;
		@FindBy(xpath="//select[@id='group_1']") public WebElement casualsize;
		@FindBy(xpath="//span[contains(text(),'Add to cart')]") public WebElement casualaddtocart;
		@FindBy(xpath="//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/a[1]/span[1]") public WebElement proceedtochckout;
		
		public Login(WebDriver driver) 
		{
			PageFactory.initElements(driver, this);
		}

		public void login() throws InterruptedException
		{
			//signIn.click();
			//Thread.sleep(3000);
			//emailAddress.sendKeys("tq7568@gmail.com");
			//password.sendKeys("123456789");
			//submitLogin.click();
			Womentab.click();
			//Thread.sleep(3000);
			tops.click();
			//Thread.sleep(3000);
			Tshirts.click();
			//Thread.sleep(3000);
		
			}
		 public void performmousehover(WebDriver driver) throws InterruptedException
		 {
			 action = new Actions(driver);
			 
		action.moveToElement(image).perform();	
		more.click();
		quantity.clear();
		quantity.sendKeys("3");
		size.sendKeys("M");	 
		addtocart.click();
		continueshopping.click();
		Dresstab.click();
		casualdresses.click();
		action.moveToElement(casualimage).perform();	
		morego.click();
		casualquantity1.clear();
		casualquantity1.sendKeys("3");
		casualsize.sendKeys("M");
		casualaddtocart.click();
		proceedtochckout.click();
		
		//System.out.println(driver.findElement(By.xpath("//span[contains(text(),'$16.51')]")).getText());
		
		 //System.out.println(driver.findElement(By.id("total_product_price_1_5_0")).getText());
		 }

			/*
			 * public void vadilidity(WebDriver driver) { WebElement price=
			 * driver.findElement(By.xpath("//span[contains(text(),'$16.51')]")); String
			 * str= price.getText(); System.out.println(str);
			 * 
			 * //WebElement quantity= driver.findElement(By.xpath(
			 * "//tbody/tr[@id='product_1_5_0_0']/td[5]/input[2]")); //String
			 * str2=quantity.getText(); //System.out.println(str2); }
			 */
		 
		/* public boolean validatetext (WebDriver driver,WebElement element,String Expectedtext)
		 {
			 String observedtext= element.getText();
			 if(observedtext.equals(Expectedtext))
			 {
			return true;
			 
		 }
			 return false;*/
		 public void vadilidity(WebDriver driver)
		 { 
			 String price= driver.findElement(By.xpath("//span[contains(text(),'$16.51')]")).getText();
			  int itest= Integer.parseInt(price);
			  System.out.println(itest);
			  //String quantity= driver.findElement(By.xpath("//tbody/tr[@id='product_1_5_0_0']/td[5]/input[2]")).getText();
			  int iprice = itest*3;
				 String total= driver.findElement(By.xpath("//span[@id='total_product_price_1_5_0']")).getText();
                  int value= Integer.parseInt(total);
                  System.out.println(value);
                  
                  if(iprice==value)
                  {
                	  System.out.println("value are equal");
                  }
                  else
                  {
                	  System.out.println("values are not equal");
                  }
		 }
		 }
		 



			 
			
		
		
		


		  
	


