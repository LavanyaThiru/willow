import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class VerifyStreak {
    @Test
	public void streakIncrement(){
		//open the browser
		System.setProperty("webdriver.chrome.driver", "../Test Project/driver/chromedriver");
        WebDriver driver= new ChromeDriver();	
        
        //go to the url
        String url = "http://www.ericrochester.com/name-game/";
        driver.get(url);
        
        //wait
        //driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        //driver.manage().window().maximize();
        
       WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='name']")));
        driver.manage().window().maximize();
        

        	//	until(ExpectedConditions.elementToBeClickable(By.id("someid"));

        
        
        //find name in who is?
       WebElement whoIs = driver.findElement(By.xpath("//*[@id='name']")); // eg pete //*[@id="name"] //*[@id="name"]
        String personNameInQuestion = whoIs.getText();
        System.out.println("Who is "+ personNameInQuestion);
        //String personpath = "//*[@id='gallery']/div and //text()=" + personNameInQuestion; 
        //String whoIs = driver.findElement(By.xpath("//*[@id='name']")).getText();
     //   System.out.println("print " + whoIs );
       // driver.findElement(By.xpath("//td[normalize-space(text())='"+newUser+"']/a")).click(); //*[contains(text(), 'To')]

     
        
        
        
        // WebElement personname = driver.findElement(By.xpath("//*[@id='gallery']/div and //text()='" +personNameInQuestion+"']"));
       WebElement personname = driver.findElement(By.xpath("//*[@id='gallery']/div and //*[contains(text(),'" +personNameInQuestion+"')]"));
      // 
      
        
    
      
      
      // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'" +personNameInQuestion+"')]")));

     System.out.println("print the person name"+ personname.getText());
      personname.click();
      
      sleep(10);

        
     // click the picture
      //  WebElement pic = driver.findElement(By.xpath("//*[@id='gallery']/div/div[1]/div[1]"));
       // pic.click();
        
       /** // a name appears on the picture -get it
        WebElement pictureNameOne =driver.findElement(By.xpath("/*[@id=‘gallery']/div/div[1]/div[2]"));
        String personNameOnPictureOne    = pictureNameOne.getText();
        System.out.println(personNameOnPictureOne);
        
        
        
        **/
        
        
        
        
	}

	private void sleep(int i) {
		// TODO Auto-generated method stub
		
	}
	
	
}
