package org.demoPractice;

import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

public class NewTest88768 extends Driver{
  @Test
  public void CompanyQuiz() throws InterruptedException {
  	WebDriver driver=getDriver();
  	PageObjects pageObj= new PageObjects(driver);
  	WebDriverWait wait=new WebDriverWait(driver, 30);
  	driver.get("https://www.amazon.in");
  	
  	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(ObjectLibrary.Amazon_Page)));
  	pageObj.enterTextInSearchBox();
  	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(ObjectLibrary.AmazonSelectFromSuggestionBox)));
  	pageObj.selectFromSuggestion();
  	String actualPriceAmazon=pageObj.getPrice.getText().trim().toString().replaceAll("[^0-9]", ""); 
  	System.out.println("Amazon Price ------------ >"+pageObj.getPrice.getText()+"------------>"+actualPriceAmazon);
  	int amazonPrice=Integer.parseInt(actualPriceAmazon);
  	
  	
  	driver.get("https://www.flipkart.com/");
  	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(ObjectLibrary.FlipkartSerchBox)));
  	List<WebElement> close=pageObj.closeLogin;
  	if(close.size()>0) {
  		close.get(0).click();	
  	}
  	else {
		System.out.println("No login popup- continue");
	}
  	pageObj.enterTextInflipKartSrchBox();
  	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(ObjectLibrary.FlipkartSerchBoxSuggestion)));
  	pageObj.selectFromSuggestionFlipKart();
  	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(ObjectLibrary.FlipkartPrice)));
  	String actualPriceFlipkart=pageObj.getPriceFlipkart.getText().trim().toString().replaceAll("[^0-9]", "");
  	System.out.println("Flipkart Price ------------ > " + actualPriceFlipkart);
  	int flipKartPrice=Integer.parseInt(actualPriceFlipkart);
  	
  	if(amazonPrice>flipKartPrice) {
  		System.out.println("Flipkart has lesser value :"+flipKartPrice);
  	}
  	else {
  		System.out.println("Amazon has lesser value :"+amazonPrice);
	}
  	
  	driver.close();
  	
  }
  

}
