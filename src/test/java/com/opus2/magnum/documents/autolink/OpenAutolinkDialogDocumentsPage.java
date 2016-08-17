package com.opus2.magnum.documents.autolink;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class OpenAutolinkDialogDocumentsPage{
	@Steps
	AutolinkSteps autolink;
	
	@Given("the Autolink_Option is visible in the Right_Click_Menu")	
	public void givenTheAutolink_OptionIsVisibleInTheRight_Click_Menu(){
		assertThat(autolink.option().isDisplayed()).isTrue();
	}
	
	@When("the user clicks the Autolink_Option")	
	public void whenTheUserClicksTheAutolink_Option(){
		autolink.autolinkOption();
	}
	
	@Then("the Autolink_Dialog must open")	
	public void thenTheAutolink_DialogMustOpen(){
		assertThat(autolink.dialog().equals("block")).isTrue();
	}
}