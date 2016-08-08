package com.opus2.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.opus2.core.Configuration;
import com.opus2.util.Page;
import com.opus2.util.Util;
import com.opus2.util.action.UserAction;
import com.opus2.util.components.Button;
import com.opus2.util.components.Component;
import com.opus2.util.panels.Search;
import com.opus2.util.panels.home.CasesSelection;




public class Home extends Page {
  UserAction action;
  
  private static final String NEW_WORKSPACE = "home-buttons_NewWorkspace";
  private static final String MANAGE_USERS_ID = "home-buttons_ManageUsersandWorkspaces";
  private static final String CASES_PANEL_XPATH = "//*[@id='homemain']/div[2]";
  private static final String SEARCH_CASES_ID = "wsfindcontainer";
  private static final String CREATE_WORKSPACE = "new-ws_Createworkspace";
  private static final String CLOSE_DIALOG = "new-ws dialogClose-div";
  
  
  @FindBy(id=NEW_WORKSPACE)
  private Button newWorkspaceBtn;
  @FindBy(id=MANAGE_USERS_ID)
  private Button manageUsersBtn;
  @FindBy(xpath=CASES_PANEL_XPATH)
  private CasesSelection cases;
  @FindBy(id=SEARCH_CASES_ID)
  private Search search;
  @FindBy(id=CREATE_WORKSPACE)
  private Button createWorkspaceBtn;
  @FindBy(id=CLOSE_DIALOG)
  private Button dialogXBtn;

  

  @Override
  public Page view() {
    this.openAt(Configuration.homeUrl);
    return this;
  }

  public boolean hasWorkspaceInTheList(String wsid) {
    return cases.hasWorkspace(wsid);
  }

  public void selectWorkspace(String wsid) {
      cases.selectWorkspace(wsid);
  }
  
  public WebElement getElement(String elementId) {
	  WebElement element = Util.getDriver().findElement(By.id(elementId));	  
	  return element;
  }
  
  public void startANewWorkspace() {
      newWorkspaceBtn.click();
  }

  public boolean dialogIsVisible(String header, String elementId) {
    String expected = (header).toUpperCase();
    WebElement dialog = getDriver().findElement(By.id(elementId))
        .findElements(By.tagName("h2")).get(0);
    return expected.equals(dialog.getText());
  }

  public void createWorkspace() {
      createWorkspaceBtn.click();
  }

  public void inputWorkspaceTitle(String workspace_Title, String Workspace_Title) {
     WebElement element = getDriver().findElement(By.id("new-ws"))
         .findElements(By.tagName(Workspace_Title)).get(0);
     element.sendKeys(workspace_Title);
  }

  public void inputDescription(String description, String description_Field) {
    WebElement element = getDriver().findElement(By.id("new-ws"))
        .findElements(By.tagName(description_Field)).get(0);
    element.sendKeys(description);
  }

  public void closeDialog(String btn) {
	  getDriver().findElement(By.id(btn))
	  	.click();
  }

  public boolean confirmDialog(String dialog) {
	 WebElement element = getDriver().findElement(By.id("new-ws"))
		        .findElements(By.tagName("h2")).get(0);
	 return element.getText().equals(dialog.toUpperCase());
  }

  public void docTitle(String document_Title) {
	  action.selectByClassList("recentDocs", "docitem", document_Title)
		.click();
  }
  
  
  
  
}
