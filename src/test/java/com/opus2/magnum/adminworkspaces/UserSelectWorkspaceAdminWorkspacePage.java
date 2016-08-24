package com.opus2.magnum.adminworkspaces;
import static org.assertj.core.api.Assertions.*;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.*;
public class UserSelectWorkspaceAdminWorkspacePage{
	@Steps
	AdminWorkspaceSteps user;	
	
	@When("the user clicks the all checkbox button")
	public void whenTheUserClicksTheAllCheckboxButton(){
		//user.selectWorkspace();
		//user.selectAll();
	}
}