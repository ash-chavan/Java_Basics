package Selenium.BasicConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameSwitch {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\TestingJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html");
		Thread.sleep(5000);
		driver.switchTo().frame("classFrame");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Deprecated')][2]")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
	}

	
}
