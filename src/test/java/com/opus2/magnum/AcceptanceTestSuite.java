package com.opus2.magnum;

import org.jbehave.core.annotations.BeforeStories;

import com.opus2.core.configuration.Configuration;

import net.serenitybdd.jbehave.SerenityStories;

public class AcceptanceTestSuite extends SerenityStories {
	@BeforeStories
	public void beforeStories() {
		Configuration.getInstance();
	}
}
