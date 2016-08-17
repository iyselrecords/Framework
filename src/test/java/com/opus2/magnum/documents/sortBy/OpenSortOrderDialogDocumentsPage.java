package com.opus2.magnum.documents.sortBy;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class OpenSortOrderDialogDocumentsPage{
	@Steps
	SortOrderSteps order;
	
	@Given("the Sort_By_Option is visible in the Right_Click_Menu")	
	public void givenTheSort_By_OptionIsVisibleInTheRight_Click_Menu(){
		assertThat(order.option().isDisplayed()).isTrue();
	}
	
	@When("the user clicks the Sort_By_Option")	
	public void whenTheUserClicksTheSort_By_Option(){
		order.sortOrderOption();
	}
	
	@Then("the Sort_Order_Dialog must open")	
	public void thenTheSort_Order_DialogMustOpen(){
		assertThat(order.dialog().equals("block")).isTrue();
	}
}