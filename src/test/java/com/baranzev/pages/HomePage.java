package com.baranzev.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;

/**
 * Sample page
 */
public class HomePage extends Page {

 //driver.get("https://greengnome.github.io/panels/");
  @CacheLookup
  public WebElement header;

 public HomePage(WebDriver driver) {
  super(driver);
 }
}

