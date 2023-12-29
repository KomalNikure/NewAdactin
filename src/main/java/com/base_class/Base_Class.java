package com.base_class;

import org.openqa.selenium.WebElement;

public class Base_Class {
 public static void inputValueElement(WebElement element,String value)
 {
	 element.sendKeys(value);
 }
 
 public static void clickOnElement(WebElement element) 
 {
	 element.click();
 }
}
