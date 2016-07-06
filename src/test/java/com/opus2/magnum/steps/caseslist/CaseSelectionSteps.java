package com.opus2.magnum.steps.caseslist;


import com.opus2.pages.Home;

import net.thucydides.core.annotations.Step;

public class CaseSelectionSteps {
  Home page = new Home();
  public void visitPage() {
    page.view();
  }
  @Step("see if we have the workspace in the list")
  public boolean hasWorkspaceInTheList(String wsid) {
   return page.hasWorkspaceInTheList(wsid);
  }
  @Step("select workspace from the list")
  public void visitWorkspace(String wsid) {
    page.visitWorkspace(wsid);
  }
  public boolean isCasesListVisible() {
    return page.isCasesListVisible();
  }
 

}
