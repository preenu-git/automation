package testScript;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import automationCore.TestNGBase;

public class LoginTest extends TestNGBase {
	@Test
	public void verifyUserLoginWithValidCredentials()
	{
		WebElement userNameField=driver.findElement(By.id("user-name"));
		userNameField.sendKeys("standard_user");
		WebElement passwordField=driver.findElement(By.id("password"));
		passwordField.sendKeys("secret_sauce");
		WebElement loginField=driver.findElement(By.id("login-button"));
		loginField.click();
	}
	@Test
	public void verifyUserLoginWithInvalidUserNameValidPassword() 
	{
		WebElement userNameField=driver.findElement(By.id("user-name"));
		userNameField.sendKeys("san");
		WebElement passwordField=driver.findElement(By.id("password"));
		passwordField.sendKeys("secret_sauce");
		WebElement loginField=driver.findElement(By.id("login-button"));
		loginField.click();
	}
	@Test
	public void verifyUserLoginWithValidUserNameInvalidPassword() 
	{
		WebElement userNameField=driver.findElement(By.id("user-name"));
		userNameField.sendKeys("standard_user");
		WebElement passwordField=driver.findElement(By.id("password"));
		passwordField.sendKeys("secret");
		WebElement loginField=driver.findElement(By.id("login-button"));
		loginField.click();
	}
	@Test
	public void verifyUserLoginWithInvalidUserNameInvalidPassword() 
	{
		WebElement userNameField=driver.findElement(By.id("user-name"));
		userNameField.sendKeys("standard");
		WebElement passwordField=driver.findElement(By.id("password"));
		passwordField.sendKeys("secret");
		WebElement loginField=driver.findElement(By.id("login-button"));
		loginField.click();
	}
	

}
