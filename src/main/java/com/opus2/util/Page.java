package com.opus2.util;

import java.util.List;

import net.serenitybdd.core.pages.PageObject;

public class Page extends PageObject{
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
