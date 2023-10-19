package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSignin 
{
	WebDriver driver ;
	
	@FindBy(xpath="//*[@id='nav-link-accountList-nav-line-1']")
	WebElement hellosignin;
	@FindBy(xpath = "//*[@id='ap_email']")
	WebElement mobiOrEmail;
	@FindBy(xpath = "//*[@type=\"submit\"]") // we can define also xpath in double cote
	WebElement continueButton;
	@FindBy(xpath = "//*[@id='ap_password']")
	WebElement password;
	@FindBy(xpath = "//*[@id='signInSubmit']")
	WebElement signinsubmitbutton;
//	@FindBy(xpath = "")
//	WebElement signinsubmit;
	
	public AmazonSignin (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void signin () throws InterruptedException
	{
		hellosignin.click();
		mobiOrEmail.sendKeys("918788584611");
		Thread.sleep(2000);
		continueButton.click();
		password.sendKeys("Pass@123");
		Thread.sleep(2000);
		signinsubmitbutton.click();
	}
	
	
	
	
	
	
	
	
}



