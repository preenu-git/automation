package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown extends Base {
	public void verifyDropdown()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropDown1=driver.findElement(By.id("dropdowm-menu-1"));
		Select select=new Select(dropDown1);
		//select.selectByIndex(2);//index value starts from 0,1,2......index value of python is 2
		select.selectByValue("python");//value="python
		//select.selectByVisibleText("Python");//text----python
	}
	public void verifyCheckbox()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement checkBox=driver.findElement(By.xpath("//input[@value='option-4']"));
		checkBox.click();//to click
	}
	public void radioButton()
	{ 
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radio=driver.findElement(By.xpath("//input[@value='green']"));
		radio.click();
		System.out.println(radio.isSelected());//isSelected is used to select the particular radiobutton is selected ,it displayed in boolean type
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingDropdown dropDown=new HandlingDropdown();
		//dropDown.initializeBrowser();
		//dropDown.verifyDropdown();
		dropDown.verifyCheckbox();
		dropDown.radioButton();
		
	}

}
