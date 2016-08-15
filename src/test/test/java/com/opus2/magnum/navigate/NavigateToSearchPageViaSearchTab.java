package com.opus2.magnum.navigate;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.*;
import com.opus2.core.Configuration;
import com.opus2.magnum.steps.login.HomeSteps;
import com.opus2.util.Util;

import static org.assertj.core.api.Assertions.*;
public class NavigateToSearchPageViaSearchTab{
	@Steps
	HomeSteps home;
	
	@Given("the user is not present on the Search_Page")	
	public void givenTheUserIsNotPresentOnTheSearch_Page(){
		String currentUrl = Util.getDriver().getCurrentUrl();
		assertThat(Configuration.searchUrl.equals(currentUrl)).isFalse();
	}
	
	@Given("the Search_Tab is visible")	
	public void givenTheSearch_TabIsVisible(){
		assertThat(home.tabIsVisible("search").isDisplayed()).isTrue();
	}
	
	@When("the user clicks the Search_Tab")	
	public void whenTheUserClicksTheSearch_Tab(){
		home.searchTab();;
	}
	
	@Then("they must be navigated to the Search_Page")	
	public void thenTheyMustBeNavigatedToTheSearch_Page(){
		String page = Configuration.searchUrl + "?ws="+ Configuration.getSelectedUser().getWorkspace();
		assertThat(page.equals(Util.getDriver().getCurrentUrl())).isTrue();
	}
}