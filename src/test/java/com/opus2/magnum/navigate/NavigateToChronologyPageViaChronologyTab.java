package com.opus2.magnum.navigate;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.*;
import com.opus2.core.Configuration;
import com.opus2.magnum.steps.login.HomeSteps;
import com.opus2.util.Util;

import static org.assertj.core.api.Assertions.*;
public class NavigateToChronologyPageViaChronologyTab{
	@Steps
	HomeSteps home;
	
	@Given("the user is not present on the Chronology_Page")
	public void givenTheUserIsNotPresentOnTheChronology_Page(){
		String currentUrl = Util.getDriver().getCurrentUrl();
		assertThat(Configuration.chronologyUrl.equals(currentUrl)).isFalse();
	}
	
	@Given("the Chronology_Tab is visible")
	public void givenTheChronology_TabIsVisible(){
		assertThat(home.tabIsVisible("magnumChronology").isDisplayed()).isTrue();
	}
	
	@When("the user clicks the Chronology_Tab")
	public void whenTheUserClicksTheChronology_Tab(){
		home.clickTab("magnumChronology");
	}
	
	@Then("they must be navigated to the Chronology_Page")
	public void thenTheyMustBeNavigatedToTheChronology_Page(){
		String page = Configuration.chronologyUrl + "?ws="+ Configuration.getSelectedUser().getWorkspace();
		assertThat(page.equals(Util.getDriver().getCurrentUrl())).isTrue();
	}
}