package Selenium.BasicConcept;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTableHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\TestingJars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,120);
		//driver.get("https://www.naukri.com/");
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(5000);
		String Before= "//*[@id=\"customers\"]/tbody/tr[";
		String After = "]/td[1]";
		String After_x = "]/td[2]";
		//row count
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr"));
		int row_count = rows.size();
		System.out.println(row_count);
		//to print compamy and contact names
		for(int i=2;i<=row_count;i++)
		{
			String Actual_Xpath = Before+i+After;
			WebElement ele = driver.findElement(By.xpath(Actual_Xpath));
			WebElement country = driver.findElement(By.xpath(Before+i+After_x));
			
			System.out.println(ele.getText());
			System.out.println(country.getText());
			
					
		}

	}

}
