package seleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleWindowHandling extends Base {
	public void verifyMultipleWindow()
	{
	 driver.navigate().to("https://demo.guru99.com/popup.php");
	 String parentWindowId=driver.getWindowHandle();
	 System.out.println(parentWindowId);
	 WebElement clickhere=driver.findElement(By.xpath("//a[text()='Click Here']"));
	 clickhere.click();
	 Set<String> handleIds=driver.getWindowHandles(); 
		System.out.println(handleIds); 
		 
		Iterator<String> it=handleIds.iterator(); 
		while(it.hasNext()) 
		{ 
			String currentId=it.next(); 
			if(!currentId.equals(parentWindowId)) 
			{ 
				driver.switchTo().window(currentId); 
				 
				WebElement email=driver.findElement(By.xpath("//input[@name='emailid']")); 
				email.sendKeys("abc@gmail.com"); 
				 
				WebElement submit_btn=driver.findElement(By.xpath("//input[@name='btnLogin']")); 
				submit_btn.click(); 
				 
				driver.switchTo().window(parentWindowId); 
				 
			} 
				 
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleWindowHandling window=new MultipleWindowHandling();
		window.initializeBrowser();
		window.verifyMultipleWindow();

	}

}
