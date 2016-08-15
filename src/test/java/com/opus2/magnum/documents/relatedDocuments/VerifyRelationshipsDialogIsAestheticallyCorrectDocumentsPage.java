package com.opus2.magnum.documents.relatedDocuments;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;

import com.opus2.magnum.documents.relationships.RelationshipsSteps;
public class VerifyRelationshipsDialogIsAestheticallyCorrectDocumentsPage{
	@Steps
	RelationshipsSteps relatedDoc;
	
	@Given("the Relationships_Dialog is open on the Documents_Page")	
	public void givenTheRelationships_DialogIsOpenOnTheDocuments_Page(){
		assertThat(relatedDoc.assertDIP().equals("TDIP")).isTrue();
	}
	
	@When("the user is viewing the Relationships_Dialog")	
	public void whenTheUserIsViewingTheRelationships_Dialog(){
		assertThat(relatedDoc.assertDIP().equals("TDIP")).isTrue(); 
	}
	
	@Then("each of the Buttons, Fields, Icons and Element_Names must be correct on the Relationships_Dialog")	
	public void thenEachOfTheButtonsFieldsIconsAndElementNamesMustBeCorrectOnTheRelationships_Dialog(){
		assertThat(relatedDoc.assertDIP().equals("TDIP")).isTrue(); 
	}
	
	@Then("the Relationships_Dialog must be Aesthetically consistent with other dialogs across the platform")	
	public void thenTheRelationships_DialogMustBeAestheticallyConsistentWithOtherDialogsAcrossThePlatform(){
		assertThat(relatedDoc.assertDIP().equals("TDIP")).isTrue();
	}
}