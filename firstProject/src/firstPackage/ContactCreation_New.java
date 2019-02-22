package firstPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class ContactCreation_New {

	public static void main(String[] args) throws InterruptedException {
		
		// Chrome browser
		
	/*	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shaiksh\\ShafeerData\\MyDocs\\Project\\Drivers\\chromedriver32bit.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://my307028.crm.ondemand.com");*/
		//driver.manage().window().maximize();
		System.out.println("hello ");
			
		// IE Browser
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\shaiksh\\ShafeerData\\MyDocs\\Project\\Drivers\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://my307028.crm.ondemand.com");
		driver.manage().window().maximize();
		
			
	// Firefox browser
		/*System.setProperty("webdriver.gecko.driver", "C:\\Users\\shaiksh\\ShafeerData\\MyDocs\\Project\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://my307028.crm.ondemand.com"); 
		driver.manage().window().maximize();*/
		// C4C Login 
		driver.findElement(By.id("USERNAME_FIELD-inner")).sendKeys("1214156");
		driver.findElement(By.id("PASSWORD_FIELD-inner")).sendKeys("Welcome123");
		driver.findElement(By.id("LOGIN_LINK")).click();
	     driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
	      
	  /*   wait.until(ExpectedConditions.titleIs("my307028.crm.ondemand.com"))
	     if(driver.getTitle().equalsIgnoreCase("my307028.crm.ondemand.com"))
	     {
	    	 System.out.println("C4C Login Sucessful");
	     }
	     */
		
		if(driver.findElements(By.xpath("//*[contains(@id,'__button0')]")).size() != 0)
		{
			System.out.println("no of Yes buutons:"+driver.findElements(By.xpath("//*[@id=\"__button0\"]")).size());
			
			driver.findElement(By.xpath("//*[contains(@id,'__button0')]")).click();
			
			System.out.println("Session override click executed");
			
		}	
		
	     		
	     
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
	// C4C Home Hide
						  
		driver.findElement(By.xpath("//img[contains(@src,'ToolPalette_CloseHome.png')]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// Click on Customers link
		driver.findElement(By.xpath("//a[contains(text(),'Customers')]")).click();
		System.out.println("clicked on Customers");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// Click on Contacts Link
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		System.out.println("clicked on contacts");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// Click on New Contact
		driver.findElement(By.xpath("//*[contains(text()='New')]")).click();
		System.out.println("end of the test");
		
		//driver.quit();
	
	}

}
