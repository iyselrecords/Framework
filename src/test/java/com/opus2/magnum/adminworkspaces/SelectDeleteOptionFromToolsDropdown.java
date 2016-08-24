package com.opus2.magnum.adminworkspaces;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class SelectDeleteOptionFromToolsDropdown{
	@Steps
	AdminWorkspaceSteps user;
	
	
	
	
	@When("the user select Delete from dropdown options")	
	public void whenTheUserSelectDeleteFromDropdownOptions(){
		user.selectOption();
	}
	
	@Then("Delete_Dialog should be visible")	
	public void thenDelete_DialogShouldBeVisible(){
		assertThat(user.deleteDialog().equals("block")).isTrue();
	}
}