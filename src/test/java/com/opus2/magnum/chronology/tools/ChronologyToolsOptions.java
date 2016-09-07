package com.opus2.magnum.chronology.tools;

import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class ChronologyToolsOptions {
	@Steps
	ChronologyToolsSteps tool;
	
	
	@When("user clicks Tools_Button")
	public void whenUserClicksToolsButton(){
		tool.button();
	}
	
	@Then("Chronology_Tools_Dropdown should display options")
	public void thenChronologyToolsDropdownShouldDisplayOptions(){
		assertThat(tool.dropdown().equals("block")).isTrue();
	}
}
