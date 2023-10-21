package testclasses;

import org.testng.annotations.Test;

public class AmazonSigninTest extends BaseTest
{
	@Test(priority = 1)
	public void signin() throws InterruptedException
	{
		sign.signin();       // method  hiding concept  // Abstraction
	   
	}
	@Test(priority = 2)
	public void addproduct() throws InterruptedException
	{
		
		sign.selectProduct();
		
	}
	@Test(priority = 3)
	public void addtocart() throws InterruptedException
	{
		
		sign.addtocart();
		
		
		
	}
	@Test(priority = 4)
	public void closewindows() throws InterruptedException
	{
		
		sign.closeWindowMethod();
		
	}
}
