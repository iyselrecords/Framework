package com.opus2.steps;

import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.opus2.pages.Home;
import com.opus2.util.Util;
import net.serenitybdd.jbehave.SerenityStories;

public class HomepageSteps extends SerenityStories{
	Home homepage;
	Util util;
	
	@When("user search for '<workspace>' and navigate to it")
	public void whenUserSearchForworkspaceAndNavigateToIt(@Named("workspace") String workspace){
		homepage.findCase(workspace);
		homepage.selectWorkspace(workspace);
	}
	@Then("they should be at user's workspace")
	public void thenTheyShouldBeAtUsersWorkspace(){
		 util.wait(2);
	}
	
}
