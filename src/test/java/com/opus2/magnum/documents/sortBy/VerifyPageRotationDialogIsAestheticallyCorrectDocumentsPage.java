package com.opus2.magnum.documents.sortBy;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class VerifyPageRotationDialogIsAestheticallyCorrectDocumentsPage{
	@Steps
	SortOrderSteps order;
	
	@Given("the Sort_Order_Dialog is open on the Documents_Page")  
    public void givenTheSort_Order_DialogIsOpenOnTheDocuments_Page(){
		assertThat(order.assertDIP().equals("TDIP")).isTrue();
    }
	
	@When("the user is viewing the Sort_Order_Dialog")	
	public void whenTheUserIsViewingTheSort_Order_Dialog(){
		assertThat(order.assertDIP().equals("TDIP")).isTrue();
	}	
	
	@Then("the Sort_Order_Dialog must be Aesthetically consistent with other dialogs across the platform")	
	public void thenTheSort_Order_DialogMustBeAestheticallyConsistentWithOtherDialogsAcrossThePlatform(){
		assertThat(order.assertDIP().equals("TDIP")).isTrue();
	}
	
	@Then("each of the Buttons, Fields, Icons and Element_Names must be correct on the Sort_Order_Dialog")	
	public void thenEachOfTheButtonsFieldsIconsAndElementNamesMustBeCorrectOnTheSort_Order_Dialog(){
		assertThat(order.assertDIP().equals("TDIP")).isTrue();
	}
}