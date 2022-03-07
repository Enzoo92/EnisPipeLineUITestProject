package UITest.GUT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//comment the above line and uncomment below line to use Chrome
//import org.openqa.selenium.chrome.ChromeDriver;


@Test

public class HubDockerTitleUITest {

	


        public void HubDockerTitle() throws InterruptedException {
        // declaration and instantiation of objects/variables
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\enisw\\OneDrive\\Skrivbord\\chromedriver_win32\\chromedriver.exe");
    	WebDriver driver =new ChromeDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
    	
    	driver.get("https://hub.docker.com/r/bitnami/testlink/");
    	
    	
    	Thread.sleep(3000L);
    	
    	
    	WebElement p= driver.findElement(By.xpath("//h2[normalize-space()='bitnami/testlink']"));
    	
    	String s = p.getText();
    	
    	System.out.println(s);
    
        String expectedTitle = "bitnami/testlink";
        String actualTitle = p.getText();

        // launch Google Chrome and direct it to the Base URL
        

        // get the actual value of the title
        

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
       
      
    }

}