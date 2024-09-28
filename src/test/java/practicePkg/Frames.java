package practicePkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frames {
	public static String amazonUrl="https://www.amazon.in/s?k=mobiles&crid=4IS3LBUPT7RD&sprefix=mobiles%2Caps%2C200&ref=nb_sb_noss_1";
	public static String ddlUrl="https://selenium08.blogspot.com/2019/11/dropdown.html";
	public static String cxbUrl="https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html";
	public static String alertUrl="https://selenium08.blogspot.com/2019/07/alert-test.html";
	public static String cucumIoUrl= "https://cucumber.io/";
	public static String iFrameUrl= "https://selenium08.blogspot.com/2019/11/selenium-iframe.html";
	
	
	//Launch Browser
	public static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) throws InterruptedException {
		    //Maximize Browser
			driver.manage().window().maximize();
			//Launch Url
			driver.get(iFrameUrl);
			//implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.switchTo().frame("iframe_a");
//			System.out.println("Wait until");
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("td-header-search")));
//			System.out.println("Sendkeys search");
//			WebElement searchBox = driver.findElement(By.id("td-header-search"));
//			searchBox.sendKeys("QA automation");
			WebElement button = driver.findElement(By.xpath("//button[@value='Search']"));
			
            button.click();			

    }
    
    
}
