package com.opus2.magnum.documents.reorder;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class OpenReorderDialog{
	@Steps 
	ReOrderSteps reorder;
	
	@Given("the Reorder_Option is visible in the Right_Click_Menu")	
	public void givenTheReorder_OptionIsVisibleInTheRight_Click_Menu(){
		assertThat(reorder.option().isDisplayed()).isTrue();
	}
	
	@When("the user clicks the Reorder_Option")	
	public void whenTheUserClicksTheReorder_Option(){
		reorder.reOrderOption();
	}
	
	@Then("the Reorder_Dialog must open")	
	public void thenTheReorder_DialogMustOpen(){
		assertThat(reorder.dialog().equals("block")).isTrue(); 
	}
}