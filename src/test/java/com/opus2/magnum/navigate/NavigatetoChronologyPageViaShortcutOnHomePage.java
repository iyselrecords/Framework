package com.opus2.magnum.navigate;

import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.*;
import static org.assertj.core.api.Assertions.*;

import com.opus2.core.Configuration;
import com.opus2.util.Util;
public class NavigatetoChronologyPageViaShortcutOnHomePage{
	@Steps
	NavigateShortcutSteps userSteps;
	
	@Given("the Chronology_Shortcut is visible")	
	public void givenTheChronology_ShortcutIsVisible(){
		assertThat(userSteps.chrnologyImage().isDisplayed()).isTrue();
	}
	
	@When("the user clicks the Chronology_Shortcut")	
	public void whenTheUserClicksTheChronology_Shortcut(){
		userSteps.chronShortcut();
	}
	
	@Then("they must be navigated to the Chronology_Page via the Chronology_Shortcut")
	public void thenTheyMustBeNavigatedToTheChronology_PageViaTheChronology_Shortcut(){
		String page = Configuration.chronologyUrl + "?ws="+ Configuration.getSelectedUser().getWorkspace();
		assertThat(page.equals(Util.getDriver().getCurrentUrl())).isTrue();
	}
}