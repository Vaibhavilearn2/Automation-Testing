package mainjava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage extends BaseClass {

	// All the locators of page
	@FindBy(xpath="//*[text()='Save Your Login Info?']")
	WebElement titleDashBoard;
	@FindBy(tagName = "button")
	WebElement notnow;
	@FindBy(xpath="//*[text()='More']")
	WebElement moretext;
	
	
	
	@FindBy(xpath="//div[@class='xl5mz7h xhuyl8g']//div/a/div/div/div/div[@class='x9f619 xxk0z11 xvy4d1p x11xpdln xii2z7h x19c4wfv']")
	WebElement Moremodule;
	@FindBy(css=".x1y1aw1k x1sxyh0 xwib8y2 xurb0ha div")
	WebElement clickLogoutDrpDown;
	
	
	@FindBy(xpath="//span[text()='Log out']")
	WebElement txtLogout;
	
	// Initialization of locators/variables
	public DashBoardPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//all method on page
	
	/*
	 * Author : Avdhut Pawar 
	 * Date : 04 Feb 2023 
	 * Description : This test method use to verify dashboard page title  
	 * Parameter return : String
	 */
	public String titleOfDashBoardPage() {
		return titleDashBoard.getText();
	}
	
	//all method on page
	
	/*
	 * Author : Avdhut Pawar 
	 * Date : 04 Feb 2023 
	 * Description : This test method use to verify dashboard page title  
	 * Parameter return : String
	 */
	
	
	public String titleOfMorePage() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Actions act	= new Actions(driver);
		act.moveToElement(moretext).perform();
		return moretext.getText();
	}
		
		public String setting() {
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Actions act	= new Actions(driver);
		act.moveToElement(Moremodule).perform();
		Moremodule.click();
	
	//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	//	clickLogoutDrpDown.click();
	//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//Actions act = new Actions(driver);
		//act.moveToElement(txtLogout).click();
		return txtLogout.getText();
		
	}
		public void logout() {
			txtLogout.click();
		}
	
	/*
	 * Author : Avdhut Pawar 
	 * Date : 08 Feb 2023 
	 * Description : This test method use to logout from build  
	 */
	
	
}
