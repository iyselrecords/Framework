package com.opus2.magnum.account;

import static org.assertj.core.api.Assertions.assertThat;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Steps;

public class NavigateToAccountPage {
	@Steps
	AccountPageSteps dip;
	
	@Given("user is present on Home_Page")
	public void givenUserIsPresentOnHomePage(){
		assertThat(dip.assertDIP().equals("TDIP")).isTrue();
	}

	@When("user clicks on Account_Email_Link")
	public void whenUserClicksOnAccountEmailLink(){
		dip.accountPage();
	}

	@Then("they must be navigated to the Account_Page")
	public void thenTheyMustBeNavigatedToAccountPage(){
		assertThat(dip.assertDIP().equals("TDIP")).isTrue();
	}
}
