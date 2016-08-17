package com.opus2.magnum.documents.sortBy;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class CloseSortOrderDialogViaXButtonDocumentsPage{
	@Steps
	SortOrderSteps order;
	
	@Given("the X_Button is visible on the Sort_Order_Dialog")
	public void givenTheX_ButtonIsVisibleOnTheSort_Order_Dialog(){
		assertThat(order.xButton().isDisplayed()).isTrue();
	}
	
	@When("the user clicks the X_Button on the Sort_Order_Dialog")	
	public void whenTheUserclicksTheX_ButtonOnTheSort_Order_Dialog() {
		order.closeByXButton();
	}
	
	@Then("the Sort_Order_Dialog must close via the X_Button")
	public void thenTheSort_Order_DialogMustCloseViaTheX_Button(){
		assertThat(order.notVisible().equals("none")).isTrue();
	}
}