import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;


public class One {

@Test
public void open(){
    System.setProperty("webdriver.chrome.driver", "../Test Project/driver/chromedriver"); // need to change webdriver,path
	String browser ="Mozilla"; // change b name as needed
	WebDriver driver = null; // once driver iiis initialized, can use the common functions
	
	if(browser.equals("chrome")){
		driver = new ChromeDriver();
	}else if (browser.equals("Mozilla")){
		driver = new FirefoxDriver();
	}else if (browser.equals("InternetExplorer")) {
		driver = new InternetExplorerDriver();
	}
	
	
	driver.get("https://www.carpoolworld.com/login.html"); //get the page
	
	System.out.println(driver.getTitle());
	// gets the page title
	 
	WebElement username = driver.findElement(By.id("form_traveler"));
	 username.sendKeys("lavanyat");
	//Identify web element username
	// return type WebElement
     //Enter a text

     WebElement password = driver.findElement(By.name("form_password1"));
     password.sendKeys("retysuy");
     
    WebElement buttonSubmit = driver.findElement(By.name("pressed_submit"));
    buttonSubmit.click();
     //cicl a buton
     
    WebElement text = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div[1]/div/div[2]/div[3]/div/div/div"));
    System.out.println(text.getText());
     
}
	
}
