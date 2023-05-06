package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Morepage extends BaseClass {
	@FindBy(css="._ab6-")
	WebElement setHomePage;
	@FindBy(xpath="//div[text()='Home']")
	WebElement titleOfhomePage;
	public Morepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	/*
	 * Author : Avdhut Pawar 
	 * Date : 06 Feb 2023 
	 * Description : This test method use to click on Pim page   
	 */
	//public void clickHomePageLinks() {
	//	setHomePage.click();
	//}
	public String getHomePageTitle() {
		return titleOfhomePage.getText();
	}
}
