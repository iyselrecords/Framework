package com.opus2.pages;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.FindBy;

import com.opus2.core.configuration.Configuration;
import com.opus2.util.Page;
import com.opus2.util.components.Button;
import com.opus2.util.panels.Search;
import com.opus2.util.panels.home.CasesSelection;




public class Home extends Page {
  
  private static final String NEW_WORKSPACE = "home-buttons_NewWorkspace";
  private static final String MANAGE_USERS_ID = "home-buttons_ManageUsersandWorkspaces";
  private static final String CASES_PANEL_XPATH = "//*[@id='homemain']/div[2]";
  private static final String SEARCH_CASES_ID = "wsfindcontainer";
  
  @FindBy(id=NEW_WORKSPACE)
  private Button newWorkspaceBtn;
  @FindBy(id=MANAGE_USERS_ID)
  private Button manageUsersBtn;
  @FindBy(xpath=CASES_PANEL_XPATH)
  private CasesSelection cases;
  @FindBy(id=SEARCH_CASES_ID)
  private Search search;
  public Home(WebDriver driver, int timeout) {
    super(driver, timeout);
  }


  @Override
  public Page view() {
    this.openAt(Configuration.homeUrl);
    return this;
  }

}
