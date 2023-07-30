package Config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
	protected WebDriver driver;
	
	public void initilization(WebDriver driver)
	{
		this.driver = driver;
		
		driver.get("https://www.hirekar.in/");
	}
}
