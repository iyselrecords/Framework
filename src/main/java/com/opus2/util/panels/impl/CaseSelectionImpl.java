package com.opus2.util.panels.impl;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import com.opus2.util.panels.home.CasesSelection;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CaseSelectionImpl extends PanelImpl implements CasesSelection {
  private static final String WORKSPACE_ELEMENTS_CLASS = "wsline";
  private static final CharSequence WS_ANCHOR_PREFIX = "a";
  By cases = By.className(WORKSPACE_ELEMENTS_CLASS);
  @FindBy(id="workspaceslist")
  private WebElementFacade list;
  public CaseSelectionImpl(PageObject page, ElementLocator locator, long timeoutInMilliseconds) {
    super(page, locator, timeoutInMilliseconds);
  }

  @Override
  public List<WebElement> findCase(String text) {
    return null;
  }
  @Override
  public boolean isVisible(){
    return this.list.isCurrentlyVisible();
  }
  @Override
  public List<WebElementFacade> getVisibleWorkspaces(){
    return thenFindAll(cases);
  }
  @Override
  public void selectWorkspace(String wsid){
    getWorkspaceItem(wsid).then().click();
    waitForPageAction();
  }
  public String getWorkspaceItemId(String wsid) {
    return String.join("-",WS_ANCHOR_PREFIX,wsid);
  }
  public WebElementFacade getWorkspaceItem(String wsid){
    return find(By.id(getWorkspaceItemId(wsid)));
  }
  @Override
  public boolean hasWorkspace(String wsid) {
    return (getWorkspaceItem(wsid)!=null);
  }
}
