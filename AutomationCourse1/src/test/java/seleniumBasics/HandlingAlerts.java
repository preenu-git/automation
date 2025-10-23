package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingAlerts extends Base {
	public void verifySimpleAlert()
	{
		driver.navigate().to(" https://demoqa.com/alerts");
		WebElement alert1=driver.findElement(By.id("alertButton"));
		alert1.click();
		Alert al=driver.switchTo().alert();
		al.accept();
	}
	public void verifyConfirmAlert()
	{
		driver.navigate().to(" https://demoqa.com/alerts");
		WebElement alert3=driver.findElement(By.id("confirmButton"));
		alert3.click();
		Alert al=driver.switchTo().alert();
		al.accept();
		
		
		
	}
	public void verifyPromptAlert()
	{
		driver.navigate().to(" https://demoqa.com/alerts");
		WebElement alert4=driver.findElement(By.id("promtButton"));
		alert4.click();
		Alert al=driver.switchTo().alert();
		al.sendKeys("preenu");
		al.accept();
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingAlerts alert=new HandlingAlerts();
		alert.initializeBrowser();
		//alert.verifySimpleAlert();
		//alert.verifyConfirmAlert();
		alert.verifyPromptAlert();
	}

}
