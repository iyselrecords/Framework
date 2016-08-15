package com.opus2.util.components.impl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import com.opus2.util.components.Input;

public class InputImpl extends ComponentImpl implements Input {

  public InputImpl(WebDriver driver, ElementLocator locator, long implicitTimeoutInMilliseconds) {
    super(driver, locator, implicitTimeoutInMilliseconds);
  }

  @Override
  public void fill(String value) {
    super.type(value);
  }

}
