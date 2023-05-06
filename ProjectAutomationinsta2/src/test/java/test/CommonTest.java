package test;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;

public class CommonTest extends BaseTest{
	@BeforeClass
	public void login() { 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		loginPage.setUserName("vaibhavi_9688");
		loginPage.setPassword("beVaibhavi@88");
		loginPage.clickLoginBtn();
		String titleOfDash= dashBoardPage.titleOfDashBoardPage();
		Assert.assertEquals(titleOfDash, "Save Your Login Info?");
	}
}
