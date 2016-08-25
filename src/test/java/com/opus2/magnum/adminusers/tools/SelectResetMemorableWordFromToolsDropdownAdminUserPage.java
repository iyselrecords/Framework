package com.opus2.magnum.adminusers.tools;

import static org.assertj.core.api.Assertions.assertThat;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class SelectResetMemorableWordFromToolsDropdownAdminUserPage {
	@Steps
	ToolsOptionSteps user;
	
	@When("the user select Reset_Memorable_Word from dropdown options")	
	public void whenTheUserSelectResetMemorableWordFromDropdownOptions(){
		user.resetMemorableWord();
	}
	@Then("Reset_Memorable_Word_Dialog should be visible")	
	public void thenResetMemorableWordDialogShouldBeVisible(){
		assertThat(user.memorableWordReset().equals("block")).isTrue();
	}
}
