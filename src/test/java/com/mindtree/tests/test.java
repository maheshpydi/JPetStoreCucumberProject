package com.mindtree.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.github.com");
	}

}
