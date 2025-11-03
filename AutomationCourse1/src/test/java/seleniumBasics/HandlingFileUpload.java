package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFileUpload extends Base{
	public void fileUploadUsingSendKeys()
	{
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement chooseFile=driver.findElement(By.id("uploadfile_0"));
		chooseFile.sendKeys("C:\\Users\\lenovo\\git\\automation\\AutomationCourse1\\src\\test\\resources\\dobbespet 7th english.pdf");
		WebElement checkbox=driver.findElement(By.id("terms"));
		checkbox.click();
		WebElement submitButton=driver.findElement(By.id("submitbutton"));
		submitButton.click();
	}
	public void fileUploadUsingRobot() throws AWTException
	{
		driver.navigate().to(" https://www.ilovepdf.com/pdf_to_word");
		WebElement selectPdf=driver.findElement(By.id("pickfiles"));
		selectPdf.click();
		StringSelection string=new StringSelection("C:\\Users\\lenovo\\git\\automation\\AutomationCourse1\\src\\test\\resources\\dobbespet 7th english.pdf");//select
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(string, null);//copy
		Robot robot=new Robot();//paste
		robot.delay(2500);//delay() is used only in robot class
	
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingFileUpload upload=new HandlingFileUpload();
		upload.initializeBrowser();
		//upload.fileUploadUsingSendKeys();
		try {
			upload.fileUploadUsingRobot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
