package webDriverTest;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindows {
		public static String multipleWindowsUrl= "https://www.naukri.com/";
			public static void main(String[] args) {
			//Launch browser and url	
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.navigate().to(multipleWindowsUrl);
			
			//Open new window by clicking on btn Remote
			driver.findElement(By.xpath("//span[@title='Remote']")).click();
			//Read parent handle
			String parentWindow = driver.getWindowHandle();
			//Read all window handles including parent window
			Set<String> allWindows = driver.getWindowHandles();
			//Access each window 
			for(String window: allWindows) {
				System.out.println(window);
				//Exclude Parent window
				if(!window.equals(parentWindow)) {
					//Switch child window which is having a button by name 'remote'
					driver.switchTo().window(window);
					//Check if child window has a span with title 'remote' then break the loop
					if(driver.findElements(By.xpath("//span[@title='remote']")).size()!=0) {
					System.out.println("we are with child window");
					break;
					}	
				}
			}
			//perform some actions on child window
			driver.findElement(By.xpath("//span[@title='remote']")).click();
			System.out.println("Clicked btn remote in child window");
		
			
	}
}
