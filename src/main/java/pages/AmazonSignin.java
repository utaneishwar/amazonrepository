package pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonSignin 
{
	WebDriver driver ;
	WebDriverWait wait;
	@FindBy(xpath="//*[@id='nav-link-accountList-nav-line-1']")
	private WebElement hellosignin;
	@FindBy(xpath = "//*[@id='ap_email']")
	private WebElement mobiOrEmail;
	@FindBy(xpath = "//*[@type=\"submit\"]") // we can define also xpath in double cote
	private WebElement continueButton;
	@FindBy(xpath = "//*[@id='ap_password']")
	private WebElement password;
	@FindBy(xpath = "//*[@id='signInSubmit']")
	private WebElement signinsubmitbutton;
	@FindBy(xpath = "(//*[@class='_deals-shoveler-v2_style_dealImage__3nlqg'])[2]")	
	private WebElement productimage;

	@FindBy(xpath="//*[@name=\"submit.add-to-cart\"]")
	private WebElement addtocart;

	@FindBy(xpath="//*[@href='/cart?ref_=sw_gtc']")
	private WebElement goTocart;
	@FindBy(xpath="//*[@id='attach-close_sideSheet-link']")
	private WebElement closewindow;
	
	@FindBy(xpath="//*[@class='nav-cart-icon nav-sprite']")
	private WebElement clicktocart;
	
//	@FindBy(xpath="//*[@id='attach-close_sideSheet-link']")
//	private WebElement closewindow;
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
	public void selectProduct() throws InterruptedException
	{
		Actions act = new Actions(driver);
		//driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		Thread.sleep(2000);
		act.scrollToElement(productimage).perform();

		productimage.click();
	}
	public void addtocart()
	{
		wait= new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(addtocart));
		addtocart.click();
	}
	public void closeWindowMethod() throws InterruptedException
	{
		//goTocart.click();
		Thread.sleep(2000);
		closewindow.click();
		wait= new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(clicktocart));
		clicktocart.click();
	}








}



