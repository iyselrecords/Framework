package com.opus2.magnum.steps;

import com.opus2.pages.Home;

import net.thucydides.core.annotations.Step;
public class UserStepsInHomePage {
	Home page;
	@Step
	public void opensHomePage(){
		page = new Home();
		page.view();
	}
	@Step
	public void lookForWorkspace(String key){
		
		
	}
}
