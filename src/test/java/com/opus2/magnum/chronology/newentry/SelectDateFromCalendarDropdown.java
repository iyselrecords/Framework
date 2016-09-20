package com.opus2.magnum.chronology.newentry;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import static org.assertj.core.api.Assertions.*;

import net.thucydides.core.annotations.Steps;

public class SelectDateFromCalendarDropdown {
    @Steps
    ChronologyNewEntrySteps newEntry;
  
    @When("user selects Today's_Date from Calendar_Dropdown")
    public void whenUserSelectsTodayFromCalendarDropdown(){
        newEntry.todaysDate();
    }

    @Then("selected_Date should saved to Chronology_Entry")
    public void thenSelectedDateShouldSavedToChronologyEntry(){
        assertThat(newEntry.assertDIP().equals("TDIP")).isTrue();
    }
}
