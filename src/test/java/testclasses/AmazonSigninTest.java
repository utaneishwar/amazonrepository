package testclasses;

import org.testng.Assert;
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
	
	@Test(priority = 5)
	public void validation() throws InterruptedException
	{
		
		String str = sign.quantityList();
		System.out.println("validation msg: "+str);
		Assert.assertEquals(str, "This seller has a limit of 1 per customer. To see if more are available from another seller, go to the product detail page.");
		
	}
	
	@Test(priority = 6)
	public void deleteitem() throws InterruptedException
	{
		
		sign.deleteitem();
		
	}
}
