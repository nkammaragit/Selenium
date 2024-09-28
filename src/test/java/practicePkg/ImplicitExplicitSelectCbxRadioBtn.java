package practicePkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitExplicitSelectCbxRadioBtn {
	public static String amazonUrl="https://www.amazon.in/s?k=mobiles&crid=4IS3LBUPT7RD&sprefix=mobiles%2Caps%2C200&ref=nb_sb_noss_1";
	public static String ddlUrl="https://selenium08.blogspot.com/2019/11/dropdown.html";
	public static String cxbUrl="https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html";


	public static void main(String[] args) throws InterruptedException {
		
		//Launch Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(cxbUrl);
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		//Working with dropdown list
//		WebElement ddl = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='country']")));
//		Select li = new Select(ddl);
//		li.selectByIndex(4);
//		System.out.println("index 4 selected");
//		li.selectByVisibleText("Thailand");
//		System.out.println("Thailand is selected");
//		li.selectByValue("BD");
//		System.out.println("selected by value BD");
		
		//working with Checkbox
//		WebElement cbx = driver.findElement(By.xpath("//input[@value='orange']"));
//		System.out.println("cbx is selected ? " + cbx.isSelected());
//		if(!cbx.isSelected()) {
//		cbx.click();
//		System.out.println("cbx is selected");
//		}
//		else {
//			System.out.println("cbx is NOT selected");
//		}
		
		//working with Radio button
				WebElement rbtn = driver.findElement(By.xpath("//input[@value='Mozilla']"));
				System.out.println("rbtn is selected ? " + rbtn.isSelected());
				if(!rbtn.isSelected()) {
					rbtn.click();
				System.out.println("rbtn is selected");
				}
				else {
					System.out.println("rbtn is NOT selected");
				}
		
		
		

		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		driver.get("https://demo.opencart.com/");
		//Launch URL
//		driver.navigate().to("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
//		System.out.println(driver.getPageSource());
//		WebElement we = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
//		WebElement we1 = driver.findElement(By.name("email"));
//		we1.sendKeys("Test");
//		Thread.sleep(10000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.navigate().forward();
//		Thread.sleep(2000);
//		driver.navigate().refresh();
		driver.close();

		
		
		
	}

}
