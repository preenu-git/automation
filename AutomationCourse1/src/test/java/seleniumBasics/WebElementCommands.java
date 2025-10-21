package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base {
	public void verifyCommands()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement message=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		message.sendKeys("preenu");
		System.out.println(message.isDisplayed());//isDisplayed is also boolean type...it returns true or false in console
		System.out.println(message.isEnabled());//isEnabled is also boolean type...it returns true or false in console
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		showMessageButton.click();
		//WebElement inputA=driver.findElement(By.xpath("//input[@id='value-a']"));
		//inputA.sendKeys("2");
		//WebElement inputB=driver.findElement(By.xpath("//input[@id=\"value-b\"]"));
		//inputB.sendKeys("3");
		//WebElement total=driver.findElement(By.xpath("//button[@id=\"button-two\"]"));
		//total.click();
		WebElement yourMessage=driver.findElement(By.xpath("//div[@id='message-one']"));
		System.out.println(yourMessage.getText());
		WebElement getTotal=driver.findElement(By.id("button-two"));
		System.out.println(getTotal.getTagName());
		System.out.println(showMessageButton.getCssValue("background-color"));
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebElementCommands commands=new WebElementCommands();
		commands.initializeBrowser();
		commands.verifyCommands();
		

	}

}
