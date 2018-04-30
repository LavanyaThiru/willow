import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class VerifyAttempsIncrement {

	@Test
	public void attempsIncrementCheck() {
		//open the browser
		System.setProperty("webdriver.chrome.driver", "../Test Project/driver/chromedriver");
        ChromeDriver driver = new ChromeDriver( );

		//go to the url 
		 String url = "http://www.ericrochester.com/name-game/";
		driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // wait when searcing for an element
		
		
		//find element existing value
		WebElement triesexistingValue = driver.findElement(By.xpath("//*[@id='stats']/span[1]"));
		int existingValue = Integer.parseInt(triesexistingValue.getText()); //use Integer.parseInt() to convert a String to int.
		//print the value
		System.out.println("existing value" +" "+ existingValue);

		//now click the picture
		WebElement picture = driver.findElement(By.xpath("//*[@id='gallery']/div/div[1]/div[1]") );
		picture.click();

		//find element newValue
		WebElement triesNewValue  = driver.findElement(By.xpath("//*[@id='stats']/span[1]"));
		 int newValue = Integer.parseInt(triesNewValue.getText());
		 //print the value
		 System.out.println("New Value" + " "+ newValue);
	

		//condition - compare existing and new value
		if (existingValue < newValue){
		System.out.println("Increment check passed");
		} else {
		System.out.println("Increment check failed");

		}	
	
	
	
}
	
}
