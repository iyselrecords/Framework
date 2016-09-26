package com.opus2.magnum.chronology.tools;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.opus2.util.Util;

import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

public class LinkEntriesToSources {
	@Steps
	ChronologyToolsSteps tool;

	@When("user open and selects Link_Entries_To_Sources option")
	public void whenUserOpenAndSelectsLinkEntriesToSourcesOption(){
		tool.selectOption(ChronologyTools.LINK_ENTRIES_TO_SOURCE);
	}
	
	@Then("Link_Entries_To_Sources_Dialog should be visible")
	public void thenLinkEntriesToSourcesDialogShouldBeVisible(){
		//assertThat(tool.dialog().equals("block")).isTrue();
	}
	
	
	
	@Given("the Link_Entries_To_Sources_Dialog is open")
	public void givenTheLink_Entries_To_Sources_DialogIsOpen(){
		assertThat(tool.dialog().equals("block")).isTrue();
	}
	@Given("there Are Possible_Match")
	public void givenThereArePossible_Match(){
		assertThat(tool.assertDIP().equals("TDIP")).isTrue();
	}
	@When("user clicks Create_Links_Button")
	public void whenUserClicksCreate_Links_Button(){
		 tool.createLink();
	}
	
	@Then("Document_Scource should be Linked to Chronology_Entries")
	public void thenDocument_ScourceShouldBeLinkedToChronology_Entries(){
		Util.pause(7);
		assertThat(tool.assertDIP().equals("TDIP")).isTrue();
		tool.button();
	}
}
