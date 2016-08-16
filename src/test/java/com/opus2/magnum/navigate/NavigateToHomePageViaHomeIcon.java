package com.opus2.magnum.navigate;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebElement;
import static org.assertj.core.api.Assertions.*;
import com.opus2.core.Configuration;
import com.opus2.util.Util;

import net.thucydides.core.annotations.Steps;

public class NavigateToHomePageViaHomeIcon {
	@Steps
	NavigateSteps nav;
	
	@Given("the user is not present on the Home Page")
	public void givenTheUserIsNotPresentOnTheHome_Page(){
		String currentUrl = Util.getDriver().getCurrentUrl();
		assertThat(Configuration.homeUrl.equals(currentUrl)).isFalse();
	}
	
	@Given("the Home Tab is visible")
	public void givenTheHome_TabIsVisible(){
		WebElement tab = nav.tabIsVisible();
		assertThat(tab.isDisplayed());
	}
	
	@When("the user clicks the Home Tab")
	public void whenTheUserClicksTheHome_Tab(){
		nav.clickTab();
	}
	
	@Then("they must be navigated to the Home Page")
	public void thenTheyMustBeNavigatedToTheHome_Page(){	
		String currentUrl = Util.getDriver().getCurrentUrl();
		String wsid = Configuration.getSelectedUser().getWorkspace();
		String page = Configuration.homeUrl + "?ws="+ wsid;
		assertThat(page.equals(currentUrl)).isTrue();
	}
}
