package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrames extends Base {

	public void verifyFrames()
	{
		driver.navigate().to("https://demoqa.com/frames");
		//many frames so use list
		List<WebElement>totalFrame=driver.findElements(By.tagName("iframe"));//entire frame
		System.out.println(totalFrame.size());
		WebElement frame1=driver.findElement(By.id("frame1"));//1 of the frame from entire frame
		driver.switchTo().frame(frame1)	;
		WebElement frameHeading=driver.findElement(By.id("sampleHeading"));
		System.out.println(frameHeading.getText());
		driver.switchTo().defaultContent();
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingFrames frame=new HandlingFrames();
		frame.initializeBrowser();
		frame.verifyFrames();

	}

}
