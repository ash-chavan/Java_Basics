package Selenium.BasicConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\TestingJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/users/sign_up");
		driver.findElement(By.xpath("//input[@id='user_full_name']")).sendKeys("Ashwifvcv");
		driver.findElement(By.xpath("//input[@id='user_email_login']")).sendKeys("ashwi@gmail.com");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("cbdsffDFv");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='user_submit']")).click(); 
		System.out.println("user made some changes");
	
	}

}
