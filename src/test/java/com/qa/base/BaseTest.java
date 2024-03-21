package com.qa.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pages.com.qa.HomePage;
import pages.com.qa.LoginPage;

public class BaseTest {
	WebDriver driver;
	protected LoginPage loginpg;
	protected HomePage homepg;

	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/index.html");
		// LoginPage loginpg = new LoginPage(driver);
		loginpg = new LoginPage(driver);
		homepg = new HomePage(driver);
		loginpg.entercredentials("standard_user", "secret_sauce");

	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
