package com.test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestGetText {

	public WebDriver driver;
	String baseUrl = "";

	@Before
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "D:\\driver\\gecko_21\\geckodriver.exe");
		driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		baseUrl = "http://www.practiceselenium.com/";
	}

	@Test
	public void getText() {
		driver.get(baseUrl);
		String textFromScreen = driver.findElement(By.id("wsb-element-00000000-0000-0000-0000-000450914886")).getText();
		System.out.println(textFromScreen);
	}
	
	@After
	public void tierDown() {
		driver.quit();
	}
}
