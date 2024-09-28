package practicePkg;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {
	public static String amazonUrl="https://www.amazon.in/s?k=mobiles&crid=4IS3LBUPT7RD&sprefix=mobiles%2Caps%2C200&ref=nb_sb_noss_1";
	public static String ddlUrl="https://selenium08.blogspot.com/2019/11/dropdown.html";
	public static String cxbUrl="https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html";
	public static String alertUrl="http://selenium08.blogspot.com/2019/07/alert-test.html";
	static WebDriver driver = new ChromeDriver();
	public static void main(String[] args) throws InterruptedException {
		//Launch Browser
		driver.manage().window().maximize();
		driver.get(alertUrl);
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		handleSimpleAlert();
		handleConfirmationAlert("accept");
		handlePromptAlert("accept", "hi there");
		driver.close();
	}
	public static void handleSimpleAlert() {
		WebElement btnAlert = driver.findElement(By.id("simple"));
		btnAlert.click();
		Alert simple = driver.switchTo().alert();
		simple.accept(); }
  	public static void handleConfirmationAlert(String action) {
		WebElement btnAlert = driver.findElement(By.id("confirm"));
		btnAlert.click();
		Alert simple = driver.switchTo().alert();
		if(action.equalsIgnoreCase("accept"))
		simple.accept(); 
		else simple.dismiss(); }
	public static  void handlePromptAlert(String action, String message) {
		WebElement btnAlert = driver.findElement(By.id("prompt"));
		btnAlert.click();
		Alert simple = driver.switchTo().alert();
		simple.sendKeys(message);
		if(action.equalsIgnoreCase("accept"))
		simple.accept(); 
		else simple.dismiss(); 
}

}