import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class Click {
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
	        //driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	        
	       WebDriverWait wait = new WebDriverWait(driver, 20);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='name']")));
	        
	        
	        driver.findElement(By.xpath("//*[@id='gallery']/div/div[1]//ancestor: :div[1]")).click();
	        
	        
	        
	     /**  //click img
	        driver.findElement(By.xpath("//*[@id='gallery']/div/div[1]/img")).click();;
	        org.openqa.selenium.WebDriverException: unknown error: Element <img src="//images.ctfassets.net/3cttzl4i3k1h/5ZUiD3uOByWWuaSQsayAQ6/c630e7f851d5adb1876c118dc4811aed/featured-image-TEST1.png"> is not clickable at point (314, 233). Other element would receive the click: <div data-n="0" class="shade">...</div>
  (Session info: chrome=66.0.3359.139)
	        
	      //*[@id="gallery"]/div/div[1]/img
	      //a[text()= ‘Books’]
	      //div[text() = ‘secured Login’] **/
	        


	}
	}

}
