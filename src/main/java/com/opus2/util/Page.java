package com.opus2.util;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.opus2.util.components.Component;

import net.serenitybdd.core.pages.PageObject;

public class Page extends PageObject{
 protected WebElement me;
 public Page(WebDriver driver, int timeout) {
   super(driver, timeout);
 }
 public Page view() {
  return null;
}
 public void waitForPageToLoad() {
   setWaitForTimeout(25000);
 }
 public void waitForPageAction() {
   setWaitForTimeout(10000);
 }
}
