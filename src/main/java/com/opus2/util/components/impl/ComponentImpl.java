package com.opus2.util.components.impl;

import java.util.ArrayList;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import com.opus2.util.components.Component;

import net.serenitybdd.core.pages.WebElementFacadeImpl;

public class ComponentImpl extends WebElementFacadeImpl implements Component {

  public ComponentImpl(WebDriver driver, ElementLocator locator, long implicitTimeoutInMilliseconds) {
    super(driver, locator, implicitTimeoutInMilliseconds);
  }

  @Override
  public boolean hasClass(String cssClassName) {
    String cssClassValue = this.getAttribute("class").toLowerCase();
    String[] classes = cssClassValue.split(" ");
    ArrayList<String> cssClasses = new ArrayList<String>();
    for(String cssClass : classes){
      String trimmed = cssClass.trim();
      if(!trimmed.equals("")){
        cssClasses.add(trimmed.toLowerCase());
      }
    }
    return cssClasses.contains(cssClassName.toLowerCase());
  }

  @Override
  public Component refresh() {
    for (int i = 0; i < 10; i++) {
      try {
        Thread.sleep(300);
      } catch (InterruptedException e1) {
      }
      try {
        getAttribute("");
        return this;
      } catch (StaleElementReferenceException e) {
        System.out.println("Control StaleElementReferenceException");
      }
    }
    return this;
  } 
}
