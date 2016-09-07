package com.opus2.magnum.chronology.tools;

import static org.assertj.core.api.Assertions.assertThat;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Steps;

public class DeleteAllEntries {
	@Steps
	ChronologyToolsSteps tool;
	
	
	@Given("the Chronology_Tools_Dropdown is open")
	public void givenTheChronologyToolsDropdownIsOpen(){
		assertThat(tool.dropdown().equals("block")).isTrue();
	}
	
	@When("user open and selects Delete_All option")
	public void whenUserOpenAndSelectsDeleteAllOption(){
		tool.selectOption(ChronologyTools.DELETE_ALL);
	}
	
	@Then("all Chronology_Entries should be deleted")
	public void thenAllChronologyEntriesShouldBeDeleted(){
		tool.OK();
		assertThat(tool.assertDIP().equals("TDIP")).isTrue();
	}
}
