package Selenium.BasicConcept;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicWebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "E:\\TestingJars\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
				WebDriverWait wait = new WebDriverWait(driver,120);
				//driver.get("https://www.naukri.com/");
				driver.get("https://classic.crmpro.com/");
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\'loginForm\']/div/input[1]")));
				
				driver.findElement(By.xpath("//*[@id=\'loginForm\']/div/input[1]")).sendKeys("batchautomation");
				driver.findElement(By.xpath("//*[@id=\'loginForm\']/div/input[2]")).sendKeys("Test@12345");
				driver.findElement(By.xpath("//input[@value='Login']")).click();
				
				driver.switchTo().frame("mainpanel");
				Thread.sleep(3000);
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Contacts')]")));
				driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
				Thread.sleep(5000);
				//method1
				//Row count from dyanamic table
//				List  rows = driver.findElements(By.xpath ("./*[@id=\\'vContactsForm\\']/table/tbody/tr/td[1]"));
//				int size = rows.size();
//		        System.out.println("Total No of rows are : " + rows.size());
//		        String Before = "//*[@id='vContactsForm']/table/tbody/tr[" ;
//		        String After = "]/td[2]";
//
//		        for(int i=0;i<=size;i++)
//		        {
//		        	String value = driver.findElement(By.xpath("Before"+i+"After")).getText();
//		        	System.out.println(value);
//		        	if(value.contains("Ash Winnee")) {
//		        		
//		        		driver.findElement(By.xpath("//*[@id=\"vContactsForm\"]/table/tbody/tr["+i+"]/td[1]/input")).click();
//		        	}
//		        	
//		        }
		        
		        //Method 2 Using customized xpath using parent/sibling()
driver.findElement(By.xpath("//a[contains(text(),'Alka marthew')]/parent::td//preceding-sibling::td//input[@name='contact_id']")).click();
	}
	

}
