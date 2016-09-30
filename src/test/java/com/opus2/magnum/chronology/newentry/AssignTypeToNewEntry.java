package com.opus2.magnum.chronology.newentry;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.opus2.magnum.chronology.customtypes.CustomTypes;

import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

public class AssignTypeToNewEntry {
	@Steps
	ChronologyNewEntrySteps newEntry;
	
	@When("user add Types to Chronology_Details")
	public void userAddTypesChronologyEventDetails(){
		newEntry.assignType();
	}
	
	@Then("Types is assigned to Chronology_Entry")
	public void thenTagIsAssignedToChronologyEntry(){
		assertThat(newEntry.assertDIP().equals("TDIP")).isTrue();
	}
	
	@When("user adds CustomType to Chronology_Details")
    public void userAddsCustomTypeChronologyEventDetails(){
        newEntry.assignType(CustomTypes.ADD_TYPE);
    }
}
