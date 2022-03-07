package UITest.GUT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



//import org.testng.Assert;



public class GoogleUrlCheck {
	
	@Test

	public void GoogleUrl() throws InterruptedException {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\enisw\\OneDrive\\Skrivbord\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://www.google.com/");
	
	System.out.println(driver.findElement(By.xpath("//span[@class='ktLKi']")).getText());
	
	String createS = driver.findElement(By.xpath("//span[@class='ktLKi']")).getText();
	Assert.assertTrue(createS.contains("Koldioxidneutralt sedan 2007")); 
	
	String URL = driver.getCurrentUrl();
	Assert.assertEquals(URL, "https://www.google.com/");
	System.out.println("URL CHECK CORRECT");
	
	driver.quit();
	
	


	
     
	}

}