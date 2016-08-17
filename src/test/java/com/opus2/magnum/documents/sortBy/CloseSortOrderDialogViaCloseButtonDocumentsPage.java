package com.opus2.magnum.documents.sortBy;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class CloseSortOrderDialogViaCloseButtonDocumentsPage{
	@Steps
	SortOrderSteps order;
	
	@Given("the Close_Button is visible on the Sort_Order_Dialog")	
	public void givenTheClose_ButtonIsVisibleOnTheSort_Order_Dialog(){
		assertThat(order.closeButton().isDisplayed()).isTrue();
	}
	
	@When("the user clicks the Close_Button on the Sort_Order_Dialog")	
	public void whenTheUserClicksTheClose_ButtonOnTheSort_Order_Dialog(){
		order.closeDialog();
	}
	
	@Then("the Sort_Order_Dialog must close vias the Close_Button")
	public void thenTheSort_Order_DialogMustCloseViaTheClose_Button() {
		assertThat(order.notVisible().equals("none")).isTrue();
    }
}