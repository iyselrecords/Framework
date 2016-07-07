package com.opus2.util.panels.impl;

import org.openqa.selenium.support.pagefactory.ElementLocator;

import com.opus2.util.Page;
import com.opus2.util.panels.Panel;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WidgetObjectImpl;

public class PanelImpl extends WidgetObjectImpl implements Panel {
  public PanelImpl(PageObject page, ElementLocator locator, long timeoutInMilliseconds) {
    super(page, locator, timeoutInMilliseconds);
  }
  @Override
  public void waitForPageAction(){
    ((Page) getPage()).waitForPageAction();
  }
}
