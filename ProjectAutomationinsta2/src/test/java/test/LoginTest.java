package test;

import org.testng.annotations.Test;

import org.testng.Assert;

public class LoginTest extends BaseTest {

	//@Test(priority = -2, groups= {"smoke","regression"})
	public void verifyTitleOfLoginPage() {	
		
		String verifyTitleOfLoginPge = loginPage.titleOfLoginPage();
		Assert.assertEquals(verifyTitleOfLoginPge, "Instagram");
		this.verifyCurrentUrlOfPage();
	}
	
	@Test(priority = 1, groups= {"smoke","regression"})
	public void verifyCurrentUrlOfPage() {
		String verifyUrlOfPage =loginPage.urlOfPage();
		Assert.assertEquals(verifyUrlOfPage, "https://www.instagram.com/");
	}
	
	@Test(priority = 2, groups= {"smoke","regression"})
	public void verifyLoginWithCorrectCredentials() {
		loginPage.setUserName("vaibhavi_9688");
		loginPage.setPassword("beVaibhavi@88");
		loginPage.clickLoginBtn();
		String titleOfDash= dashBoardPage.titleOfDashBoardPage();
		Assert.assertEquals(titleOfDash, "Save Your Login Info?");
	}
	
	@Test(priority = -1, groups={"smoke","regression"})
	public void verifyBuildTitleName() {
		String verifyTitleOfBuild = loginPage.getBuildTitle();
		Assert.assertEquals(verifyTitleOfBuild, "Instagram");
	}
}
