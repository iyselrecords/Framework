package com.opus2.magnum.documents.toolsMenu;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class OpenToolsDropdownMenuDocumentsPage{
	@Steps
	DocumentToolSteps tool;
	
	@Given("the Tools_Button is visible")
	public void givenTheTools_ButtonIsVisible(){
		assertThat(tool.assertDIP().equals("TDIP")).isTrue();
	}
	
	@When("the user clicks the Tools_Button whilst the Tools_Menu is closed")
	public void whenTheUserClicksTheTools_ButtonWhilstTheTools_MenuIsClosed(){
		assertThat(tool.assertDIP().equals("TDIP")).isTrue();
	}
	
	@Then("the Tools_Menu must open")
	public void thenTheTools_MenuMustOpen(){
		assertThat(tool.assertDIP().equals("TDIP")).isTrue();
	}
}