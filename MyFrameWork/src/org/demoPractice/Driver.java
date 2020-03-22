package org.demoPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Driver {
	
	@Test
	public WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Barsha/eclipse-workspace/MyFrameWork/chromedriver80.exe");
		WebDriver driver=new ChromeDriver();
		return  driver;
	}
}
