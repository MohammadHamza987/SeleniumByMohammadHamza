package pages.com.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	// Locators
	@FindBy(xpath = "//input[@name='user-name']")
	WebElement username;
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	@FindBy(xpath = "//input[@value='LOGIN']")
	WebElement loginbutton;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// page actions
	public void entercredentials(String user, String pass) {
		username.sendKeys(user);
		password.sendKeys(pass);
		loginbutton.click();

	}

}
