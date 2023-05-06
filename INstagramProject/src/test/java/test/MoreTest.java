package test;

import org.testng.Assert;
import org.testng.annotations.Test;



public class MoreTest extends BaseTest{
	
		
	//	@Test(priority=4,groups= {"smoke","regression"})
	//	public void verifyMorePageTitle() {
	//		String verifyTitleOfPim = morePage.getHomePageTitle();
	//		Assert.assertEquals(verifyTitleOfPim, "Home");
	//	}	

		@Test(priority=3,groups= {"smoke","regression"})
		public void titleOfDashBoardPage() {
			String verifyTitleOfDashbord = dashBoardPage.titleOfDashBoardPage();
			Assert.assertEquals(verifyTitleOfDashbord, "Save Your Login Info?");
		

}
		@Test(priority=4,groups= {"smoke","regression"})
		public void titleOfMorePage() {
			String verifyTitleOfmore = dashBoardPage.titleOfMorePage();
			Assert.assertEquals(verifyTitleOfmore, "More");
		

}	
		@Test(priority=6,groups= {"smoke","regression"})
		public void setting() {
			String verifyTitleOflogout = dashBoardPage.setting();
			Assert.assertEquals(verifyTitleOflogout, "Log out");
		
}
}