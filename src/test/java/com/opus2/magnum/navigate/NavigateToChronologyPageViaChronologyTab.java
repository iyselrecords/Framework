package com.opus2.magnum.navigate;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;

import com.opus2.core.Configuration;
import com.opus2.util.Util;

public class NavigateToChronologyPageViaChronologyTab{
	@Steps
	NavigateSteps nav;
	
	@Given("the user is not present on the Chronology_Page")
	public void givenTheUserIsNotPresentOnTheChronology_Page(){
		assertThat(Configuration.chronologyUrl.equals(Util.getDriver().getCurrentUrl())).isFalse();
	}
	
	@Given("the Chronology_Tab is visible")
	public void givenTheChronology_TabIsVisible(){
		assertThat(nav.chronTab().isDisplayed()).isTrue();
	}
	
	@When("the user clicks the Chronology_Tab")
	public void whenTheUserClicksTheChronology_Tab(){
		nav.chronologyTab();
	}
	
	@Then("they must be navigated to the Chronology_Page")
	public void thenTheyMustBeNavigatedToTheChronology_Page(){
		String page = Configuration.chronologyUrl + "?ws="+ Configuration.getSelectedUser().getWorkspace();
		assertThat(page.equals(Util.getDriver().getCurrentUrl())).isTrue();
	}
}