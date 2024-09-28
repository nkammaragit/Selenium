package webDriverTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static String amazonUrl="https://www.amazon.in/s?k=mobiles&crid=4IS3LBUPT7RD&sprefix=mobiles%2Caps%2C200&ref=nb_sb_noss_1";
	public static String ddlUrl="https://selenium08.blogspot.com/2019/11/dropdown.html";
	public static String cxbUrl="https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html";
	public static String alertUrl="https://selenium08.blogspot.com/2019/07/alert-test.html";	
	public static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) throws InterruptedException {
			//Launch Browser
			driver.manage().window().maximize();
			driver.get(alertUrl);
			//implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//			handleSimpleAlert();
//			handleConfirmationAlert();
			handlePromptAlert();
//			driver.close();
	}
	
	//Handle simple alert
    public static void handleSimpleAlert() {
	WebElement btnSimpleAlert = driver.findElement(By.id("simple"));
	btnSimpleAlert.click();
	org.openqa.selenium.Alert alert = driver.switchTo().alert();
	alert.accept();
	System.out.println("Simple Alert handled");
	}

	//Handle Confirmation alert
    public static void handleConfirmationAlert() {
	WebElement btnConfirmAlert = driver.findElement(By.id("confirm"));
	btnConfirmAlert.click();
	org.openqa.selenium.Alert alert = driver.switchTo().alert();
	alert.accept();
	System.out.println("Confirmation Alert handled");
    }
    
  //Handle Prompt alert
    public static void handlePromptAlert() throws InterruptedException {
	WebElement btnPromptAlert = driver.findElement(By.id("prompt"));
	btnPromptAlert.click();
	org.openqa.selenium.Alert alert = driver.switchTo().alert();
	Thread.sleep(5000);
	String textAlert = alert.getText();
	System.out.println(textAlert);
	alert.sendKeys("Hi Indra");
	alert.accept();

//	alert.accept();
//	driver.switchTo().alert().dismiss();
//	System.out.println(driver.switchTo().alert().getText());
	System.out.println("Prompt Alert handled");
    }
    
    
}
