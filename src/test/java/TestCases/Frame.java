package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.qa-practice.com/elements/iframe/iframe_page");
		
		String text = driver.findElement(By.xpath("//h1[normalize-space()='Iframes']")).getText();
		
		System.out.println("The capctured text is : "+text);
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//button[@aria-label='Toggle navigation']")).click();
	}
}
