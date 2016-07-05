package com.opus2.steps.Login;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.opus2.actions.Login.LoginSteps;
import com.opus2.core.configuration.Configuration;
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
	 Configuration.getInstance();
  assertThat(url).isEqualTo(Configuration.loginUrl);
 }
 @When("the user authenticates successfully")
 public void authenticate(){
  Configuration.getInstance();
  userSteps.loginAs(Configuration.getSelectedUser());
 }
 @Then("the user is navigated to the memorableword page")
 public void openMemorableWordPage(){
   userSteps.openMemorableWordPage();
 }
 @When("the user fails to authenticate due to bad <type>")
 public void failure(@Named("type") String element){
   User user = Configuration.getSelectedUser();
   if(element.equals("email")){
     userSteps.authenticateBy(user.getEmail().concat("+failure"), user.getPassword());
   }else{
     userSteps.authenticateBy(user.getEmail(), user.getPassword().concat("+failure"));
   }
 }

}
