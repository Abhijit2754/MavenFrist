package TestCases;

import java.rmi.registry.Registry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Config.BaseClass;
import ObjectClass.RegistrationPOM;

public abstract class TestCasr_registration extends BaseClass {
	
	private WebDriver driver;

	@BeforeMethod
	public void init()
	{
		driver = new ChromeDriver();
		
		initilization(driver);
	}
	
	@Test
	public void checkRegistration()
	{
		RegistrationPOM reg = new RegistrationPOM(driver);
		reg.clickOnJoinBtn();
		reg.pasFullName("Abhijit");
	}
}
