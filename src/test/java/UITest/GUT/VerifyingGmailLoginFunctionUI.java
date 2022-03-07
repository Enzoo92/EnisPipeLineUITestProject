package UITest.GUT;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;





public class VerifyingGmailLoginFunctionUI {
	
	@Test

	public void VerifyGmail() throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\enisw\\OneDrive\\Skrivbord\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		

		
		driver.get("https://www.google.com/");
		
        driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click();
		
		Thread.sleep(4000L);
		
		driver.findElement(By.xpath("//a[normalize-space()='Gmail']")).click();
		
		Thread.sleep(2000L);
		
		driver.findElement(By.xpath("//a[normalize-space()='Logga in']")).click();
		
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("EnisTest@gmail.com");
		
	
		
		
		
		try {
			Thread.sleep(2000L);
			WebElement e = driver.findElement(By.xpath("//button[@type='button']//div[@class='VfPpkd-RLmnJb']"));
			boolean actualValue = e.isEnabled();
			
			if(actualValue)
				System.out.print("Button is Enable");
				else 
					System.out.print("Button is Disable");
			Thread.sleep(2000L);
		}
		catch(Exception ex){
			System.out.print("Exception" +  ex.getMessage());
		}
	
			
					




	
		
		
		
		
		
		
		
		
		
		
				
			
				
	
		
	
		
	}


}