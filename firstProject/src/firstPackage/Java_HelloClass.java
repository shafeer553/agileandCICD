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

public class Java_HelloClass {

	public static void main(String[] args) throws InterruptedException {
		
		// Chrome browser
		
	/*	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shaiksh\\ShafeerData\\MyDocs\\Project\\Drivers\\chromedriver32bit.exe");
		WebDriver driverFF=new ChromeDriver();
		driverFF.get("https://my307028.crm.ondemand.com");*/
		//driverFF.manage().window().maximize();
		System.out.println("hello ");
		
		
		// IE Browser
		
	System.setProperty("webdriver.ie.driver", "C:\\Users\\shaiksh\\ShafeerData\\MyDocs\\Project\\Drivers\\IEDriverServer.exe");
		
		WebDriver driverFF = new InternetExplorerDriver();
		
		driverFF.get("https://my307028.crm.ondemand.com");
		driverFF.manage().window().maximize();
		
		/*System.out.println("end of test");
		driverIE.close();
		*/
		
	// Firefox browser
		/*System.setProperty("webdriver.gecko.driver", "C:\\Users\\shaiksh\\ShafeerData\\MyDocs\\Project\\Drivers\\geckodriver.exe");
		
		WebDriver driverFF = new FirefoxDriver();
		driverFF.get("https://my307028.crm.ondemand.com"); 
		driverFF.manage().window().maximize();*/
		// C4C Login 
		driverFF.findElement(By.id("USERNAME_FIELD-inner")).sendKeys("1214156");
		driverFF.findElement(By.id("PASSWORD_FIELD-inner")).sendKeys("Welcome123");
		driverFF.findElement(By.id("LOGIN_LINK")).click();
		
	      
	  /*   wait.until(ExpectedConditions.titleIs("my307028.crm.ondemand.com"))
	     if(driverFF.getTitle().equalsIgnoreCase("my307028.crm.ondemand.com"))
	     {
	    	 System.out.println("C4C Login Sucessful");
	     }
	     */
		
	     driverFF.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
	     /*
		if(driverFF.findElements(By.xpath("//*[contains(@id,'__button0')]")).size() != 0)
		{
			System.out.println("no of Yes buutons:"+driverFF.findElements(By.xpath("//*[@id=\"__button0\"]")).size());
			
			driverFF.findElement(By.xpath("//*[contains(@id,'__button0')]")).click();
			
			System.out.println("Session override click executed");
			
		}	*/
	     
			
	     
		  driverFF.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
	// C4C Home Hide
				
		//  wait.until(ExpectedConditions.stalenessOf(theElement));
		  
		driverFF.findElement(By.xpath("//img[contains(@src,'ToolPalette_CloseHome.png')]")).click();
		driverFF.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// Click on Customers link
		driverFF.findElement(By.xpath("//a[contains(text(),'Customers')]")).click();
		driverFF.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// Click on Contacts Link
		driverFF.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		driverFF.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// Click on New Contact
		driverFF.findElement(By.xpath("//*[contains(text()='New')]")).click();
		
		
		
		
		
		
		System.out.println("end of FF test");
		
		//driverFF.quit();
	
	}

}
