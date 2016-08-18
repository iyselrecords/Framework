package com.opus2.magnum.navigate;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.*;
import static org.assertj.core.api.Assertions.*;

import com.opus2.core.Configuration;
import com.opus2.magnum.steps.login.HomeSteps;
import com.opus2.util.Util;
public class NavigateToNotesPageViaNotesTab{
	@Steps
	HomeSteps home;
	
	@Given("the user is not present on the Notes_Page")
	public void givenTheUserIsNotPresentOnTheNotes_Page(){
		assertThat(Configuration.notesUrl.equals(Util.getDriver().getCurrentUrl())).isFalse();
	}
	
	@Given("the Notes_Tab is visible")
	public void givenTheNotes_TabIsVisible(){
		assertThat(home.tabIsVisible("magnumNotes").isDisplayed()).isTrue();
	}
	
	@When("the user clicks the Notes_Tab")	
	public void whenTheUserClicksTheNotes_Tab(){
		home.notesTab();
	}
	
	@Then("they must be navigated to the Notes_Page")	
	public void thenTheyMustBeNavigatedToTheNotes_Page(){
		String page = Configuration.notesUrl + "?ws="+ Configuration.getSelectedUser().getWorkspace();
		assertThat(page.equals(Util.getDriver().getCurrentUrl())).isTrue();
	}	
}