package com.opus2.magnum.actions.components.caseslist;
import static org.assertj.core.api.Assertions.assertThat;

import org.jbehave.core.annotations.*;

import com.opus2.core.configuration.Configuration;
import com.opus2.magnum.steps.caseslist.CaseSelectionSteps;
import com.opus2.util.Util;

import net.thucydides.core.annotations.Steps;
public class CaseSelectorStepsDefinitions{
  @Steps
  CaseSelectionSteps actions;

  @When("the user selects workspace title")
  public void whenTheUserSelectsWorkspace(){
    actions.visitWorkspace(Configuration.getSelectedUser().getWorkspace()); 
  }
  @Then("they must be navigated to the documents page")
  public void navigateToSpecificDocumentsPage(){
    String url = Util.getDriver().getCurrentUrl();
    assertThat(url).containsOnlyOnce(Configuration.documentsUrl);
    assertThat(url).containsOnlyOnce("ws="+Configuration.getSelectedUser().getWorkspace());
  }
  @Given("the user can see the cases section in home page")
  public void givenTheUserCanSeeTheCasesSectionInHomePage(){
    actions.visitPage();
    String url = Util.getDriver().getCurrentUrl();
    assertThat(url).containsOnlyOnce(Configuration.homeUrl);
    assertThat(actions.isCasesListVisible()).isTrue();
  }
  @Given("the workspace is visible in the cases section")
  public void isWorkspaceVisible(){
    String wsid = Configuration.getSelectedUser().getWorkspace();
    assertThat(actions.hasWorkspaceInTheList(wsid)).isTrue();
  }
}