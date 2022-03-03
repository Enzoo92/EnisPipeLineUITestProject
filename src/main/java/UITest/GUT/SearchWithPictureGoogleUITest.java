package UITest.GUT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SearchWithPictureGoogleUITest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\enisw\\OneDrive\\Skrivbord\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		

		
		driver.get("https://www.google.com/");
		
		
         driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click();
		
		
		Thread.sleep(4000L);
		
		driver.findElement(By.xpath("//a[normalize-space()='Bilder']")).click();
		
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://www.google.se/imghp?hl=sv&ogbl");
		System.out.println("URL CHECK CORRECT");
		
		

	}


}
