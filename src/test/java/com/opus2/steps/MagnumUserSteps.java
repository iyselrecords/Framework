package com.opus2.steps;


import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.opus2.pages.Transcripts;
import com.opus2.pages.UserAction;
import com.opus2.util.Util;

import net.serenitybdd.jbehave.SerenityStories;
import net.thucydides.core.annotations.Steps;

public class MagnumUserSteps extends SerenityStories{
	@Steps
	Transcripts transcript;
	Util util;
	UserAction action;
	
	@When("user select '<testTranscripts>' Transcript")
	public void whenUserSelecttestTranscriptsTranscript(@Named("testTranscripts") String file){
		transcript.select(file);
	}
	@Then("'<testTranscripts>' Transcript is displayed on preview pane")
	public void thentestTranscriptsTranscriptIsDisplayedOnPreviewPane(@Named("testTranscripts") String file){
		util.wait(1);
	}
	@When("user clicks on '<testTranscripts>' Transcript")
	public void whenUserClicksOntestTranscripts2Transcript(@Named("testTranscripts") String file){
		transcript.clickPreview(file);
		action.switchToCurrentWindow(1);
	}
	@Then("'<testTranscripts>' Transcript should open in a new tab")
	public void thenTestTranscriptsTranscriptShouldOpenInANewTab(@Named("testTranscripts") String file){
		util.wait(1);
	}	
	
	
	@When("user clicks on the index dropdown")
	public void whenUserClicksOnTheIndexDropdown(){
		transcript.displaySearchList();
		util.wait(2);
	}
	@When("user clicks on each page number")	
	public void andUserClicksOnEachPageNumber(){
		transcript.indentifyText();
	}
	@Then("Search terms should appear on the index with page number on it")	
	public void thenSearchTermsShouldAppearOnTheIndexWithPageNumberOnIt(){
		
	}
	@Then("user should be taken to displayed result")	
	public void thenUserShouldBeTakenToDisplayedResult(){
		util.wait(2);
	}
	@When("user input <'search term>' on the input box")	
	public void whenUserInputSearchTermOnTheInputBox(@Named("search term") String text){
		transcript.enterSearchText(text);
	}
	@Then("dropdown should display list of search words")	
	public void thenDropdownShouldDisplayListOfSearchWords(){
		transcript.displaySearchList();
	}
}
