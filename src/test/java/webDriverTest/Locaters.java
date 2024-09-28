package webDriverTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locaters {

	public static void main(String[] args) throws InterruptedException {
		LaunchBrowserClass lb = new LaunchBrowserClass();
		lb.launchApplication("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
//		WebDriver driver = new ChromeDriver();
//		driver.navigate().to("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
//        Thread.sleep(3000);
//		driver.findElement(By.id("ap_email")).sendKeys("xyz.gmail.com");
        //put email id in to "Email or mobile phone number" object
		
		
//		absolute xpth : /html/body/div[1]/div[3]/div[2]/div/div[4]/div[4]/div[1]/form/div/div/div/div[1]/input[1]
//		Relative xpth://input[@name='email']
//		Indexing:
//			(//script[@type='text/javascript'])[1]
//			(//script[@type='text/javascript'])[5]
			//a[text()='Privacy policy']
			//a[text()='Terms of things']
			//*[text()='Terms of things']
			//a[contains(text(),'Terms of')]
			//a[contains(text(),'Privacy')]
			//*[contains(text(),'Privacy')]
//           WebElement inputEmail = lb.driver.findElement(By.name("email"));
					
		   WebElement inputEmail = lb.driver.findElement(By.xpath("//input[@name='email']"));
           inputEmail.sendKeys("xyz.gmail.com");
           System.out.println(inputEmail.getText());  
           
           
           //with class name
           WebElement btnContinue = lb.driver.findElement(By.className("a-button-input"));
           
           //with Xpath
//           WebElement btnContinue = lb.driver.findElement(By.xpath("//span[@id='continue-announce']"));
           
           btnContinue.click();
           
           System.out.println(btnContinue.getText());  
           
           
           
//           WebElement errorText = lb.driver.findElement(By.className("a-alert-content"));
//           System.out.println(errorText.getText());  
//           
//           
//           WebElement linkPrivacyNote = lb.driver.findElement(By.partialLinkText("Privacy Notice"));
//  
//           
//           List<WebElement> allLinks = lb.driver.findElements(By.tagName("a"));
//           System.out.println(allLinks.size());
//           
//           for(WebElement link : allLinks) {
//        	   System.out.println(link.getText());  
//        	   
//           }
           
           
           
           
        
           
           
           
           
           
           
        
  //	driver.findElement(By.name("email")).sendKeys("xyz.gmail.com");
           
           
		//click on continue button 
           lb.driver.findElement(By.className("a-button-input")).click();
//		driver.findElement(By.partialLinkText("Continue")).click();
//           lb.driver.findElement(By.className("a-button-input")).click();

		
		
		
		
		
	}

}
