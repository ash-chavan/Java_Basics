package Selenium.BasicConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniulMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\TestingJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.popuptest.com/popuptest2.html");
		Thread.sleep(4000);
		Set<String> winodows = driver.getWindowHandles();
		System.out.println("No of Windows :"+winodows.size());
		String currrent = driver.getWindowHandle();
		System.out.println(currrent);
		// 1. Window switching using arraylist
		List <String>windws= new ArrayList(driver.getWindowHandles());
		driver.switchTo().window(windws.get(1));
	//	driver.switchTo().alert();	
		//2. USing Iteraotr
		Iterator it = windws.iterator();
		while(it.hasNext())
		{
			it.next();
			System.out.println(driver.getTitle());
		}
		driver.close();
		
//      

	}

}
