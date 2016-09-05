package com.opus2.magnum.chronology;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.*;

import org.jbehave.core.annotations.*;
public class ChronologyDIP{
	@Steps
	ChronologySteps dip;
	
	@When("the user is on CHRON_01")
	public void whenTheUserIsOnCHRON_01(){
		//dip.selectChronology();
	}
	@When("the user is on CHRON_02")
	public void whenTheUserIsOnCHRON_02(){
		dip.manageChronologies();
	}
	@When("the user is on CHRON_03")
	public void whenTheUserIsOnCHRON_03(){
		  //dip.reset();
	}
	@When("the user is on CHRON_04")
	public void whenTheUserIsOnCHRON_04(){
		  //dip.filter();
	}
	@When("the user is on CHRON_05")
	public void whenTheUserIsOnCHRON_05(){
		  //dip.newEntry();
	}
	@When("the user is on CHRON_06")
	public void whenTheUserIsOnCHRON_06(){
		  //dip.customTypes();
	}
	@When("the user is on CHRON_07")
	public void whenTheUserIsOnCHRON_07(){
		  //dip.importEntries();
	}
	@When("the user is on CHRON_08")
	public void whenTheUserIsOnCHRON_08(){
		  //dip.exportManager();
	}
	@When("the user is on CHRON_09")
	public void whenTheUserIsOnCHRON_09(){
		  //dip.tools();
	}
	@When("the user is on CHRON_10")
	public void whenTheUserIsOnCHRON_10(){
		  //dip.A_B_A();
	}
}