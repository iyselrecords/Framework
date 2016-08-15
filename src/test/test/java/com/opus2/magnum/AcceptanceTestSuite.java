package com.opus2.magnum;

import org.jbehave.core.annotations.AfterStories;
import org.jbehave.core.annotations.BeforeStories;

import com.opus2.core.Configuration;
import net.serenitybdd.jbehave.SerenityStories;

public class AcceptanceTestSuite extends SerenityStories {
	@BeforeStories
	public void beforeStories() {
		Configuration.getInstance();
	}
	
	@AfterStories
	public void afterStories(){	  	
		System.out.println("finished");
	}
}
