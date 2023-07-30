package ObjectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Config.BaseClass;

public class RegistrationPOM extends BaseClass {
	
	WebDriverWait wait ;

	@FindBy(linkText = "Join Now")
	public WebElement joinBtn;
	
	@FindBy(xpath = "//input[@id='modal-join-name']")
	public WebElement fullName;
	
	public RegistrationPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnJoinBtn()
	{
		joinBtn.click();		
	}
	
	public void pasFullName(String pass_name)
	{
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		WebElement fullname =  (WebElement) wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy((By) fullName));
		
		fullname.sendKeys(pass_name);
	}
	
}
