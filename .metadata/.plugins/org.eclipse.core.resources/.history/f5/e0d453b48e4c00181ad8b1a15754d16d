import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class VerifyTitle {
	
	@Test
    public void titleCheck(){
		
		// open the  browser
		System.setProperty("webdriver.chrome.driver", "../Test Project/driver/chromedriver");
		ChromeDriver driver = new ChromeDriver();

		// go to the URL
		String url = "http://www.ericrochester.com/name-game/";
		driver.get(url);

         // wait for web element to load
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//maximize browser window
		driver.manage( ).window( ).maximize( );
		

		//initialize a variable and store expected title of page
		String expectedTitle = "name game";

		//get the actual title of the page and store it in a variable
		String actualTitle = driver.getTitle( );

		//title check
		if(expectedTitle.equals( actualTitle)) {
		System.out.println("Title check passed");
		} else {
		System.out.println("Title check failed");
		}
	
		
	
}
	
}
