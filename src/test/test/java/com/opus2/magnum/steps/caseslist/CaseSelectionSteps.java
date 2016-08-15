package com.opus2.magnum.steps.caseslist;


import com.opus2.pages.Home;
import com.opus2.util.Util;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;

public class CaseSelectionSteps {
  Home page;
  public void visitPage() {
    page.view();
  }
  
  @Step("see if we have the workspace in the list")
  public boolean hasWorkspaceInTheList(String wsid) {
	  return page.hasWorkspaceInTheList(wsid);
  }
  
  @Step("select workspace from the list")
  public void selectWorkspace(String wsid) {
	  page.selectWorkspace(wsid);
	  Util.loadingIcon();
  }
}
