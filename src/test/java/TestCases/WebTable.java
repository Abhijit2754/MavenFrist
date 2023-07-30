package TestCases;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/table");
		
		List<WebElement> ele = driver.findElements(By.xpath("//table[@id=\"webtable\"]//tr"));
		
		for(int i = 2 ; i<=ele.size() ; i++)
		{
			List<WebElement> col = driver.findElements(By.xpath("//table[@id=\"webtable\"]//tr["+i+"]//td"));
			
			for(int k = 1 ; k <= col.size(); k++)
			{
				String elee = driver.findElement(By.xpath("//table[@id=\"webtable\"]//tr["+i+"]//td["+k+"]")).getText();
				
				System.out.print("-------------- "+elee);
			}
			
			System.out.println();
		}	
		
		
	}
	
	////table[@id="webtable"]//tr[2]//td[2]
}
