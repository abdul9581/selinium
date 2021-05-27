package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import mavenpack.seliniumproject.BaseTest;

public class Loginpage extends BaseTest
{

	@FindBy(xpath="//a[contains(text(),'Sign in')]")public WebElement signIn;
	@FindBy(id="email_create") public WebElement emailaddress;
	@FindBy(id="SubmitCreate")public WebElement createaccount;
	@FindBy(id="id_gender1")public WebElement selectgender;
	@FindBy(id="customer_firstname") public WebElement firstname;
	@FindBy(id="customer_lastname") public WebElement lastname;
	//@FindBy(id="email") public WebElement email;
	@FindBy(id="passwd") public WebElement password;
	@FindBy(name="days") public WebElement days;
	@FindBy(id="months") public WebElement months;
	@FindBy(id="years") public WebElement years;
	@FindBy(id="company") public WebElement company;
	@FindBy(id="address1") public WebElement address1;
	@FindBy(id="address2") public WebElement address2;
	@FindBy(id="city") public WebElement city;
	@FindBy(id="id_state") public WebElement state;
	@FindBy(name="postcode") public WebElement postcode;
	@FindBy(id="id_country") public WebElement country;
	@FindBy(id="other") public WebElement otherinformation;
	@FindBy(id="phone") public WebElement homephone;
	@FindBy(id="phone_mobile") public WebElement phonenumber;
	@FindBy(id="alias") public WebElement futurereference;
	@FindBy(id="submitAccount") public WebElement register;
	
	
	
	
	

public Loginpage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	}


public void Loginpage() throws InterruptedException
{
	signIn.click();
	//Thread.sleep(3000);
	waitForElement(emailaddress, 30,"element visible");
	String email=p.getProperty("firstname")+p.getProperty("lastname")+ranNum()+p.getProperty("domainname");
	emailaddress.sendKeys(email);
	createaccount.click();
	//Thread.sleep(3000);
	waitForElement(selectgender, 30,"element clickable");
	//wait.until(ExpectedConditions.elementToBeClickable(selectgender)).click();

	selectgender.click();
	firstname.sendKeys("abdul");
	lastname.sendKeys("gaffar");
	//email.sendKeys("tq7568@gmail.com");
	password.sendKeys("123456789");
	days.sendKeys("10");
	months.sendKeys("February");
	years.sendKeys("1996");
	company.sendKeys("GlobalTechnologyServices");
	address1.sendKeys("plot:101,shobhanivas,sr nagar,hydrabad,500031");
	address2.sendKeys("plot:101,Hyderabad,500038");
	city.sendKeys("Hyderabad");
	state.sendKeys("Telangana");
	postcode.sendKeys("00000");
	country.sendKeys("india");
	otherinformation.sendKeys("manikonda near shivaji chowk");
	homephone.sendKeys("234698");
	phonenumber.sendKeys("7013169811");
	futurereference.sendKeys("nothing");
    register.click();
    

}



}
