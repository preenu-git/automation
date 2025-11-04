package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="user-name") WebElement userNameField;
	@FindBy(id="password") WebElement passwordField;
	@FindBy(id="login-button") WebElement loginField;
	
public void enterUsernameOnUsernameField()
{
	userNameField.sendKeys("standard_user");
}
public void enterPasswordOnPasswordField()
{
	passwordField.sendKeys("secret_sauce");
}
public void clickOnClickButton()
{
	loginField.click();
}
}
