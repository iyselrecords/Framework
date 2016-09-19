package com.opus2.magnum.chronology.tools;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

public class ShowThumbnails {
	@Steps
	ChronologyToolsSteps tool;

	@When("user click Tools_Button")
	public void whenUserClickToolsButton(){
	    tool.button();
	}
	
	@When("uncheck Show_Thumbnails_Checkbox")
    public void andUncheckShowThumbnailsCheckbox(){
        tool.showThumbnails();
    }
	
	@Then("Thumbnails are not displayed on Entries")
	public void thenThumbnailsAreNotDisplayedOnEntries(){
	    tool.plan();
		assertThat(tool.assertDIP().equals("TDIP")).isTrue();
	}
	
	@When("user check Show_Thumbnails_Checkbox")
    public void andUserCheckShowThumbnailsCheckbox(){
        tool.showThumbnails();
    }
    
    @Then("Chronology_Entries displays Thumbnails")
    public void thenChronologyEntriesDisplaysThumbnails(){
        tool.plan();  
        assertThat(tool.assertDIP().equals("TDIP")).isTrue();
        tool.button();
    }
}
