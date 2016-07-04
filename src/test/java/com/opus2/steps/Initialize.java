package com.opus2.steps;

import java.util.Properties;

import net.serenitybdd.jbehave.SerenityStories;

import org.jbehave.core.annotations.AfterScenario;
import org.jbehave.core.annotations.AfterStories;
import org.jbehave.core.annotations.AfterStory;
import org.jbehave.core.annotations.BeforeScenario;
import org.jbehave.core.annotations.BeforeStories;
import org.jbehave.core.annotations.BeforeStory;

import com.opus2.pages.Configuration;
import com.opus2.util.Util;

public class Initialize extends SerenityStories{	
	Util util;
	Configuration config;
	
	@BeforeStories
	public void beforeStories() {
		
	}	 
	@AfterStories
	public void afterStories() {
	    // ...
	}
	
	@BeforeStory
	public void beforeStory(){
		config.loadConfig();
	}
	@AfterStory
	public void afterStory() {
		
	}
	
	@BeforeScenario
	public void beforeEachScenario() {
		// ...
	}
	@AfterScenario
	public void afterEachScenario() {
		// ...
	}
}
