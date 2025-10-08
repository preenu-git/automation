package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public WebDriver driver;//declares reference variable driver of type webdriver
	public void initializeBrowser() {//create a method initialiseBrowser
		driver=new ChromeDriver();//ChromeDriver predefined class...opens chrome browser
		//driver=new FirefoxDriver();//predefined class
		driver.get("https://selenium.qabible.in");//opens website
		driver.manage().window().maximize();//maximize browser window
		//driver.manage().window().minimize();//minimise the browser window
		
		
	}
	public void driverCloseAndQuit()//method creation
	{
		//driver.close();//closing last window
		driver.quit();//close all windows
		
	}

	public static void main(String[] args) {
		Base base=new Base();//create object of class
		base.initializeBrowser();//calls initialisebrowsermethod and opens chrome
		base.driverCloseAndQuit();//calls driverclose and quit method and closes the brower then quit the browser......close means it close the last window
		//quit means it closes all windows.

	}

}
