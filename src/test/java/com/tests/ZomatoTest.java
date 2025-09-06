package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZomatoTest {
	private static  WebDriver driver;

	public static void main(String[] args) {
     driver= new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.zomato.com/");


	}

}
