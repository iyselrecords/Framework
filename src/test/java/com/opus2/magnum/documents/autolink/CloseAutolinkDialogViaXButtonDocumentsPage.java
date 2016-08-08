package com.opus2.magnum.documents.autolink;
import org.jbehave.core.annotations.*;
public class CloseAutolinkDialogViaXButtonDocumentsPage {
	
	@Then("the <Autolink_Dialog> must close via the <X_Button>")
	 public void thenTheAutolink_DialogMustCloseViaTheX_Button(@Named("Autolink_Dialog") String Autolink_Dialog, @Named("X_Button") String X_Button) {

	 }
	
	@When("the user clicks the <X_Button> on the <Autolink_Dialog>")
	 @Pending
	 public void whenTheUserclicksTheXButtonOnTheAutoL(@Named("X_Button") String X_Button, @Named("Autolink_Dialog") String Autolink_Dialog) {

	 }

	@Given("the <X_Button> is visible on the <Autolink_Dialog>")
	@Pending
	public void givenTheX_ButtonIsVisibleOnTheAutolink_Dialog(@Named("X_Button") String X_Button, @Named("Autolink_Dialog") String Autolink_Dialog){
		 //TODO 
	}
}