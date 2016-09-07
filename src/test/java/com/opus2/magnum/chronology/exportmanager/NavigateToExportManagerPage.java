package com.opus2.magnum.chronology.exportmanager;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.opus2.util.Util;

import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

public class NavigateToExportManagerPage {
	@Steps
	ExportManagerSteps exp;

	@Given("the Export_Manager_Button is visible")
	public void givenTheChronologiesDropdownListIsVisible(){
		assertThat(Util.getElement(ExportManager.EXPORT_MANAGER_BUTTON).isDisplayed()).isTrue();
	}
	
	@When("user clicks the Export_Manager_Button")
	public void whenUserSelectChronologiesList(){
		exp.manager();
	}
	
	@Then("user is navigated to Export_Manager_Page")
	public void thenChronologiesListOptionShouldDisplayChronologyEntries(){
		assertThat(exp.getCurrentUrl().equals(Util.getDriver().getCurrentUrl())).isTrue();
	}
}
