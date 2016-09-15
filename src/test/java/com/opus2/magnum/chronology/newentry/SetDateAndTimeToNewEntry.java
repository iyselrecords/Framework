package com.opus2.magnum.chronology.newentry;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.opus2.util.Util;

import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

public class SetDateAndTimeToNewEntry {
	@Steps
	ChronologyNewEntrySteps newEntry;
	
	@When("user select $option Date_Option and set Date $date")
	public void userSelectDateOption(String option, String date){
		newEntry.setDate(option,date);
	}
	
	@When("select $timezone Time_Zone set Time $time")
	public void andSelectTimeOption(String timezone, String time){
		newEntry.setTime(timezone,time);
	}
	
	@Then("Date and Time is set on Chronology_Entry")
	public void thenDateAndTimeIsAddedToChronologyEntry(){
		assertThat(newEntry.assertDIP().equals("TDIP")).isTrue();
		Util.pause(2);
	}
}
