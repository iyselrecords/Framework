package com.opus2.magnum.documents.access;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class OpenAccessDialogDocumentsPage {
  @Steps
  DocsAccessSteps menu;
  
  @Given("the Access_Option is visible in the Right_Click_Menu")
  public void givenTheAccess_OptionIsVisibleInTheRight_Click_Menu(){
      assertThat(menu.option().isDisplayed()).isTrue();
  }
  
  @When("the user clicks the Access_Option")
  public void whenTheUserClicksTheAccess_Option(){
      menu.accessOption();
  }
  
  @Then("the Access_Dialog must open")    
  public void thenTheAccess_DialogMustOpen(){
      assertThat(menu.dialog().isDisplayed()).isTrue();
  }
}