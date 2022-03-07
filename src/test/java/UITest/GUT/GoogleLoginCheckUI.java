package UITest.GUT;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.Test;




public class GoogleLoginCheckUI {
	
	
	@Test

	public void GoogleLoginCheck() throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\enisw\\OneDrive\\Skrivbord\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click();
		
	
		
		
		driver.findElement(By.xpath("//a[@class='gb_1 gb_2 gb_6d gb_6c']")).click();
		
		Thread.sleep(5000L);
		
		
		
		
		System.out.println(driver.findElement(By.xpath("//span[normalize-space()='Skapa konto']")).getText());
		
		String createS = driver.findElement(By.xpath("//span[normalize-space()='Skapa konto']")).getText();
		Assert.assertTrue(createS.contains("Skapa konto")); 
		System.out.print("Skapa Konto Correct");
	
		
	
		
		

		
	
		}
	
	
	

}
