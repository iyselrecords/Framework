package com.opus2.steps.Login;

import org.jbehave.core.annotations.Given;

import com.opus2.actions.Login.LoginSteps;
import static org.assertj.core.api.Assertions.*;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;

public class LoginStepDefinitions  {
 @Steps
 LoginSteps userSteps;
 @Given("that a user is present on the login page")
 public void openLoginPage(){
	 userSteps.openLoginPage();
	 String url = Serenity.getWebdriverManager().getCurrentDriver().getCurrentUrl();
	 assertThat(url).isEqualTo(com.opus2.core.configuration.Configuration.getInstance().loginUrl);
 }
 


}
