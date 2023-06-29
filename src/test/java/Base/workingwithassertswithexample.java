package Base;

import org.testng.Assert;
import org.testng.annotations.Test;

public class workingwithassertswithexample {
	@Test(priority=1)
	public void login() {
		String exp="runner";
		String act="runner";
		Assert.assertEquals(exp,act);
	}
	@Test(priority=2,dependsOnMethods="login")
	public void homepage() {
		System.out.println("hello babji");
	}
	
	

}
