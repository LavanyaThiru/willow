import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class find {
	@Test
	public void streakIncrement(){
		//open the browser
		System.setProperty("webdriver.chrome.driver", "../Test Project/driver/chromedriver");
        WebDriver driver= new ChromeDriver();	
        
        //go to the url
        String url = "http://www.ericrochester.com/name-game/";
        driver.get(url);
        
        //wait
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='name']")));
        
        //find Streak Existing value
        WebElement a =driver.findElement(By.xpath("//*[@id='stats']/span[3]"));
        int initialStreakValue = Integer.parseInt(a.getText());
        System.out.println("InitialStreakValue is" + initialStreakValue);
        
        // find personname in question and store in  a variable
        WebElement whoIs = driver.findElement(By.xpath("//*[@id='name']")); // eg pete //*[@id="name"] //*[@id="name"]
        String personNameInQuestion = whoIs.getText();
        System.out.println("Who is "+ personNameInQuestion);
        
        // Find the tag that has a matching name
        WebElement personname = driver.findElement(By.xpath("//*[@id='gallery']//div[text() ='" +personNameInQuestion+"']"));
        String PicName = personname.getText();
        System.out.println( "Name picture match found" +PicName );
        
        	
        //click correct name and picture match
        WebElement picClick = driver.findElement(By.xpath("//*[@id='gallery']//div[text() ='" +personNameInQuestion+"']//ancestor::div[1]"));
        picClick.click();
        
        
        // Find Streak New value and compare 
        WebElement b =driver.findElement(By.xpath("//*[@id='stats']/span[3]"));
        int newStreakValue = Integer.parseInt(b.getText());
        System.out.println("newStreakValue is" + newStreakValue);
        if(initialStreakValue < newStreakValue){
        	System.out.print("Pass: Streak value increased upon correct selection");
        } else {
        	System.out.print("Fail: Streak value did not increased upon correct selection");
        }
        
        
      //ancestor::div[1]
 //       "//*[@id='gallery']/div/div[1]//ancestor: :div[1]"
        
        
        //WebElement picClick = driver.findElement(By.xpath("//*[@id='gallery']//div[text() ='" +personNameInQuestion+"']/img"));
        //picClick.click();
        
        
      //*[@id="gallery"]/div/div[1]/img
        
        
      //a[text()= ‘Books’]
      //div[text() = ‘secured Login’]
        


}
}
