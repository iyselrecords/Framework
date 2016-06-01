package com.opus2.steps;



import org.jbehave.core.annotations.When;

import com.opus2.pages.Testing;

import net.serenitybdd.jbehave.SerenityStories;
import net.thucydides.core.annotations.Steps;

public class NewFeaturesSteps extends SerenityStories{
	@Steps
	
	Testing testRun;
	
	@When("I'm designing")
	public void whenImDesigning(){
		testRun.designInProgress();
	}
}
