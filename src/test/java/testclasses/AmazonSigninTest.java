package testclasses;

import org.testng.annotations.Test;

public class AmazonSigninTest extends BaseTest
{
	@Test
	public void signin() throws InterruptedException
	{
		sign.signin();
	}
}
