package Selenium.BasicConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionExamples {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\TestingJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
		Thread.sleep(3000);
		Actions act  = new Actions(driver);
		WebElement men = driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[1]/div/a"));
		act.moveToElement(men).build().perform();
		driver.findElement(By.xpath("//a[@class='desktop-categoryName'][contains(text(),'Bags & Backpacks')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Backpacks')]")).click();
	}
}
