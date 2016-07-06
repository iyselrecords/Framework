package com.opus2.util.components.home;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.opus2.pages.Home;
import com.opus2.util.Util;
import com.opus2.util.components.Search;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CasesSelection extends PageObject {
  private static final String SEARCH_COMPONENT_ID = "wsfindcontainer";
  private static final String WORKSPACE_ELEMENTS_CLASS = "wsline";
  private static final String WORKSPACES_LIST_ID = "workspaceslist";
  private static final String WS_ANCHOR_PREFIX = "a";
  private Search searchComponent;
  private WebElementFacade list;
  WebDriver driver;
  public CasesSelection(){
   
  }
  public void init(){
    withTimeoutOf(20,TimeUnit.SECONDS).waitForPresenceOf(By.id(SEARCH_COMPONENT_ID));
    withTimeoutOf(20,TimeUnit.SECONDS).waitForPresenceOf(By.id(WORKSPACES_LIST_ID));
    searchComponent = new Search(this.element(By.id(SEARCH_COMPONENT_ID)));
    list = this.element(By.id(WORKSPACES_LIST_ID));
  }
  public List<WebElement> findCase(String text){
    searchComponent.find(text);
    return getVisibleWorkspaces();
  }
  public boolean isVisible(){
    return this.list.isCurrentlyVisible();
  }
  public List<WebElement> getVisibleWorkspaces(){
    return this.thenReturnElementList(By.className(WORKSPACE_ELEMENTS_CLASS));
  }
  public void selectWorkspace(String wsid){
    getWorkspaceItem(wsid).click();
  }
  public WebElement getWorkspaceItem(String wsid) {
    return this.element(By.id(getWorkspaceItemId(wsid)));
  }
  public String getWorkspaceItemId(String wsid) {
    return String.join(WS_ANCHOR_PREFIX, "-",wsid);
  }
}
