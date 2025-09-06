package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTest {
	 private static WebDriver driver;

	public static void main(String[] args)
	{
		driver=new ChromeDriver();
		driver.get("https://www.automationexercise.com");
		driver.close();
	}
}