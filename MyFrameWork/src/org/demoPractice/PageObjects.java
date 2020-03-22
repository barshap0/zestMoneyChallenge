package org.demoPractice;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjects {
	WebDriver driver ;
	
		@FindBy(xpath=ObjectLibrary.AmazonSerchBox)
		protected WebElement srchBox;
		
		@FindBy(xpath=ObjectLibrary.AmazonSelectFromSuggestionBox)
		protected WebElement selectFromSuggestionBox;
		
		@FindBy(xpath=ObjectLibrary.AmazonPrice)
		protected WebElement getPrice;
		
		@FindBy(xpath=ObjectLibrary.CloseLogin)
		protected List<WebElement> closeLogin;
		
		@FindBy(xpath=ObjectLibrary.FlipkartSerchBox)
		protected WebElement flipKartSrchBox;
		
		@FindBy(xpath=ObjectLibrary.FlipkartSerchBoxSuggestion)
		protected WebElement flipkartSerchBoxSuggestion;
		
		@FindBy(xpath=ObjectLibrary.FlipkartPrice)
		protected WebElement getPriceFlipkart;
		
		public PageObjects(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		//Enter text in the search box
		public void enterTextInSearchBox() {
			srchBox.sendKeys("iPhone XR (64GB) - Yellow");
		}
		
		public void selectFromSuggestion() {
			selectFromSuggestionBox.click();
		}
		
		public void enterTextInflipKartSrchBox() {
			flipKartSrchBox.sendKeys("iPhone XR (64GB) - Yellow");
		}
		
		public void selectFromSuggestionFlipKart() {
			flipkartSerchBoxSuggestion.click();
		}
		
}
