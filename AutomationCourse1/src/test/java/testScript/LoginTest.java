package testScript;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import automationCore.TestNGBase;
import pages.LoginPage;
import utilities.ExcelUtilities;

public class LoginTest extends TestNGBase {
	@Test
	public void verifyUserLoginWithValidCredentials() throws IOException
	{
		String userName=ExcelUtilities.getStringData(0, 0, "LoginPage");
		String password=ExcelUtilities.getStringData(0, 1, "LoginPage");
		//WebElement userNameField=driver.findElement(By.id("user-name"));
		//userNameField.sendKeys("standard_user");
		//WebElement passwordField=driver.findElement(By.id("password"));
		//passwordField.sendKeys("secret_sauce");
		//WebElement loginField=driver.findElement(By.id("login-button"));
		//loginField.click();
		LoginPage loginPage=new LoginPage(driver);
		loginPage.enterUsernameOnUsernameField(userName);
		loginPage.enterPasswordOnPasswordField(password);
		loginPage.clickOnClickButton();
	}
	@Test
	public void verifyUserLoginWithInvalidUserNameValidPassword() throws IOException 
	{
		String userName=ExcelUtilities.getStringData(1, 0, "LoginPage");
		String password=ExcelUtilities.getStringData(1, 1, "LoginPage");
		//WebElement userNameField=driver.findElement(By.id("user-name"));
		//userNameField.sendKeys("san");
		//WebElement passwordField=driver.findElement(By.id("password"));
		//passwordField.sendKeys("secret_sauce");
		//WebElement loginField=driver.findElement(By.id("login-button"));
		//loginField.click();
		LoginPage loginPage=new LoginPage(driver);
		loginPage.enterUsernameOnUsernameField(userName);
		loginPage.enterPasswordOnPasswordField(password);
		loginPage.clickOnClickButton();
	}
	@Test
	public void verifyUserLoginWithValidUserNameInvalidPassword() throws IOException 
	{
		String userName=ExcelUtilities.getStringData(2, 0, "LoginPage");
		String password=ExcelUtilities.getStringData(2, 1, "LoginPage");
		//WebElement userNameField=driver.findElement(By.id("user-name"));
		//userNameField.sendKeys("standard_user");
		//WebElement passwordField=driver.findElement(By.id("password"));
		//passwordField.sendKeys("secret");
		//WebElement loginField=driver.findElement(By.id("login-button"));
		//loginField.click();
		LoginPage loginPage=new LoginPage(driver);
		loginPage.enterUsernameOnUsernameField(userName);
		loginPage.enterPasswordOnPasswordField(password);
		loginPage.clickOnClickButton();
	}
	@Test
	public void verifyUserLoginWithInvalidUserNameInvalidPassword() throws IOException 
	{
		String userName=ExcelUtilities.getStringData(3, 0, "LoginPage");
		String password=ExcelUtilities.getStringData(3, 1, "LoginPage");
		//WebElement userNameField=driver.findElement(By.id("user-name"));
		//userNameField.sendKeys("standard");
		//WebElement passwordField=driver.findElement(By.id("password"));
		//passwordField.sendKeys("secret");
		//WebElement loginField=driver.findElement(By.id("login-button"));
		//loginField.click();
		LoginPage loginPage=new LoginPage(driver);
		loginPage.enterUsernameOnUsernameField(userName);
		loginPage.enterPasswordOnPasswordField(password);
		loginPage.clickOnClickButton();
	}
	

}
