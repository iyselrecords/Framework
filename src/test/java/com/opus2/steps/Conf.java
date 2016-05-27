package com.opus2.steps;

import net.serenitybdd.jbehave.SerenityStories;

import org.jbehave.core.annotations.AfterScenario;
import org.jbehave.core.annotations.AfterStories;
import org.jbehave.core.annotations.AfterStory;
import org.jbehave.core.annotations.BeforeScenario;
import org.jbehave.core.annotations.BeforeStories;
import org.jbehave.core.annotations.BeforeStory;

import com.opus2.pages.Login;
import com.opus2.pages.Testing;
import com.opus2.util.Util;

public class Conf extends SerenityStories{
	Login loginpage;
	Util util;
	Testing test;
	
	@BeforeScenario
	public void beforeEachScenario() {
		// ...
	}
	@AfterScenario
	public void afterEachScenario() {
		// ...
	}
	
	
	@BeforeStory
	public void beforeStory() {
		loginpage.setUp();
	}
	@AfterStory
	public void afterStory() {
		loginpage.tearDown();
	}
	 
	
	@BeforeStories
	public void beforeStories() {
	    // ...
	}	 
	@AfterStories
	public void afterStories() {
	    // ...
	}
}
