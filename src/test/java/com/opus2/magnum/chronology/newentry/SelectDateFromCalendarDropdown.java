package com.opus2.magnum.chronology.newentry;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static org.assertj.core.api.Assertions.*;
import net.thucydides.core.annotations.Steps;

public class SelectDateFromCalendarDropdown {
    @Steps
    ChronologyNewEntrySteps newEntry;
  
    @When("user opens Calendar_Dropdown")
    public void whenUserOpensCalendarDropdown(){
        newEntry.openDropdown(ChronologyNewEntry.NEW_ENTRY_DATE_DROPDOWN);
    }
    
    @When("user opens Filter_Calendar_Dropdown")
    public void whenUserOpensFilterCalendarDropdown(){
        newEntry.openDropdown(ChronologyNewEntry.FILTER_DATE_DROPDOWN);
    }
    
    @When("selects Today's_Date")
    public void whenUserSelectsTodayFromCalendarDropdown(){
        newEntry.todaysDate();
    }

    @When("clicks Next_Arrow to view Next_Month_Dates")
    public void andClicksNextArrowToViewNextMonthDates(){
        newEntry.nextMonth();
    }
    
    @When("clicks Previous_Arrow to view Previous_Month_Dates")
    public void andClicksNextArrowToViewPreviousMonthDates(){
        newEntry.previousMonth();
    }
    
    @Then("selected_Date should saved to Chronology_Entry")
    public void thenSelectedDateShouldSavedToChronologyEntry(){
        assertThat(newEntry.assertDIP().equals("TDIP")).isTrue();
        newEntry.saveDescAndDelete();
    }
}
