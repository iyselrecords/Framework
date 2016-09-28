package com.opus2.magnum.chronology.newentry;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.opus2.util.Util;

import net.thucydides.core.annotations.Steps;

public class FilterOptionOnExistingEntry {
    private static final String FILTER_BUTTON = "chron-chooser_chron-chooser_Filter";
    private static final String FILTER_DIALOG = "chron-filter";
    @Steps
    ChronologyNewEntrySteps newEntry;
    
    @Given("Filter_Button is visible")
    public void givenFilterButtonIsVisible() {
        assertThat(Util.getElement(FILTER_BUTTON).isDisplayed()).isTrue();
    }
    
    @Given("the Filter_Dialog is open")
    public void givenFilterDialogIsOpen() {
        assertThat(Util.getElement(FILTER_DIALOG).getCssValue("display").equals("block")).isTrue();
    }
    
    @When("user clicks Filter_Button")
    public void whenUserClicksFilterButton(){
        newEntry.filterButton();
    }
    
    @When("selects Filter_Option $option")
    @Alias("user selects Filter_Option $option")
    public void andSelectsFilterOptionItemsWithoutDescription(String option){
        newEntry.getFilterOption(option);
    }
    
    @Then("Existing_Entries With Filter_Option should display")
    public void thenLinkedDocumentIsAddedAsASourceToNewEntry(){
        assertThat(newEntry.assertDIP().equals("TDIP")).isTrue();
    }
}
