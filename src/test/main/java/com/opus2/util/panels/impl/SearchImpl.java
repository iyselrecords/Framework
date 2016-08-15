package com.opus2.util.panels.impl;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import com.opus2.util.components.Button;
import com.opus2.util.components.Input;
import com.opus2.util.panels.Search;

import net.serenitybdd.core.pages.PageObject;

public class SearchImpl extends PanelImpl implements Search {
  @FindBys({@FindBy(className="searchComponentInput"), @FindBy(tagName = "input")})
  private Input searchInput;
  @FindBys({@FindBy(className="searchComponent"), @FindBy(tagName = "button")})
  private Button searchBtn;
  public SearchImpl(PageObject page, ElementLocator locator, long timeoutInMilliseconds) {
    super(page, locator, timeoutInMilliseconds);
  }
  @Override
  public void find(String key) {
   searchInput.fill(key);
   searchBtn.click();
  }
  @Override
  public void resetSearch() {
    searchInput.clear();
    searchBtn.click();
  }
 
}
