package pages.com.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	// locators
	@FindBy(xpath = "(//button[text()='ADD TO CART'])[1]")
	WebElement SauceLabsBackpack;
	@FindBy(xpath = "(//button[text()='ADD TO CART'])[2]")
	WebElement SauceLabsBikeLight;
	@FindBy(xpath = "(//button[text()='ADD TO CART'])[3]")
	WebElement SauceLabsBoltTshirtk;
	@FindBy(xpath = "//div[4]//div[3]//button[1]")
	WebElement SauceLabsFleecejacket;
	@FindBy(xpath = "//div[5]//div[3]//button[1]")
	WebElement SauceLabsOnsie;
	@FindBy(xpath = "//div[6]//div[3]//button[1]")
	WebElement SauceLabsalltshirts;

//constructor
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

// page actions
	public void Item1() {
		SauceLabsBackpack.click();
		System.out.println("Item 1 added");
	}

	public void Item2() {
		SauceLabsBikeLight.click();
		System.out.println("Item 2 added");
	}

	public void Item3() {
		SauceLabsBoltTshirtk.click();
		System.out.println("Item 3 added");
	}

	public void Item4() {
		SauceLabsFleecejacket.click();
		System.out.println("Item 4 added");
	}

	public void Item5() {
		SauceLabsOnsie.click();
		System.out.println("Item 5 added");
	}

	public void Item6() {
		SauceLabsalltshirts.click();
		System.out.println("Item 6 added");
	}

}
