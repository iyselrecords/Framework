package com.opus2.magnum.actions.login;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.opus2.core.Configuration;
import com.opus2.magnum.steps.login.LoginSteps;
import com.opus2.util.User;
import com.opus2.util.Util;

import static org.assertj.core.api.Assertions.*;
import net.thucydides.core.annotations.Steps;

public class LoginStepDefinitions  {
  @Steps
  LoginSteps userSteps;

  @Given("that a user is present on the login page")
  public void openLoginPage(){
    userSteps.openLoginPage();
    String url = Util.getDriver().getCurrentUrl();
    assertThat(url).containsOnlyOnce(Configuration.loginUrl);
  }
  
  @When("the user authenticates successfully")
  public void authenticate(){
    userSteps.loginAs();
  }
  
  @Then("the user is navigated to the memorableword page")
  public void openMemorableWordPage(){
    userSteps.openMemorableWordPage();
  }
  
  @When("the user fails to authenticate due to bad $type")
  public void failureAuthentication(String type){
    User user = Configuration.getSelectedUser();
    if(type.equals("email")){
      userSteps.authenticateBy(user.getEmail().concat("+failure"), user.getPassword());
    }else{
      userSteps.authenticateBy(user.getEmail(), user.getPassword().concat("+failure"));
    }
  }
  
  @Given("that a user is present on the memorableword page")
  public void isOnMemorableWordPage(){
    String url = Util.getDriver().getCurrentUrl();
    if(!url.equals(Configuration.memorableWordUrl)){
      userSteps.openMemorableWordPage();
      assertThat(url).containsOnlyOnce(Configuration.loginUrl);
    }else if(url.equals(Configuration.memorableWordUrl)){
      assertThat(url).containsOnlyOnce(Configuration.memorableWordUrl);
    }
  }
 
  @When("the user fills the memorable word options correctly")
  public void completeMemorableWord(){
    isOnMemorableWordPage();
    userSteps.fillMemorableWordFormSucessfully();
    String url = Util.getDriver().getCurrentUrl();
    assertThat(url).containsOnlyOnce(Configuration.homeUrl);
  }
  
  @Then("the user must be navigated to the home page")
  public void isInHomePage(){
    String url = Util.getDriver().getCurrentUrl();
    assertThat(url).containsOnlyOnce(Configuration.homeUrl);
  }
  
}
