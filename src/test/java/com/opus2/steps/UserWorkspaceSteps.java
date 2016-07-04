package com.opus2.steps;

import java.io.IOException;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.opus2.enums.Pages;
import com.opus2.enums.UserWorkspaceOption;
import com.opus2.pages.Configuration;
import com.opus2.pages.Home;
import com.opus2.pages.UserAction;
import com.opus2.pages.UserWorkspaces;
import com.opus2.util.Util;

import net.thucydides.core.steps.ScenarioSteps;

public class UserWorkspaceSteps  extends ScenarioSteps {
	
	Home homepage;
	UserAction user;
	UserWorkspaces userWorkspace;
	Util util;
	

	@When("user navigates to home page")
	public void whenUserNavigatesToHomePage(){
		user.goTo(Pages.Home);
	}
	@When("clicks on the new workspace button")
	public void whenUserClicksOnTheNewWorkspaceButton(){
		homepage.newWorkspace();
	}
	@Then("it should open the New Workspace Dialog box")
	public void thenItShouldOpenTheNewWorkspaceDialogBox(){
		homepage.newWorkspaceDialog(); 
	}
	
	@When("user clicks the x icon")
	public void userClicksTheXIcon(){
		homepage.closeNewWorkspaceDialog();
	}
	@Then("user exit dialog box")
	public void userExitDialogBox(){
		//assert
	}
	
	
	//Admin_04
	@When("clicks on Manage Users and Workspaces button")
	public void clicksOnManageUsersAndWorkspacesButton(){
		homepage.manageUserAndWorkspace();
		user.switchToCurrentWindow(1);
	}

	@Then("a new tab navigates user to adminUsers page where users can be added and removed from workspaces")
	public void userNaviagtesToNewTab(){
		userWorkspace.verifyUserWorkspace();
	}
	
	//Admin_
	@Given("user is present on Admin-Roles page")
	public void givenUserIsPresentOnAdminRolesPage(){
		
	}
	
	
	@When("user clicks on New User button")
	public void userClickNewUser(){
		userWorkspace.newUser();
	}
	@When("enters email")
	public void entersEmail(){
		userWorkspace.enterUserEmail();
	}
	@When("clicks Invite button")
	public void clickInviteButton(){
		userWorkspace.inviteUser();
	}
	@Then("user should appear on the user list")
	public void shouldAppearOnUserList(){
		//assert
		util.pause(3);
	}
	
	@When("user clicks on the New Workspace button")
	public void userClicksOnNewWorkspaceButton(){
		userWorkspace.newWorkspace();
	}
	@When("type in a title and description")
	public void userTypedTitleAndDescription(){
		userWorkspace.enterTitleAndDescription();
	}
	@When("click Create Workspace button")
	public void clickCreateWorkspace(){
		userWorkspace.createWorkspace();
	}
	@Then("workspace should appear in the Workspace dropdown")
	public void workspaceList(){
		//assert
		util.pause(5);
	}
	
	//Admin_004c1
	@When("select disable account option")
	public void andSelectdisableAccountOption(){
		//userWorkspace.selectDisableAccountOption(option);
		userWorkspace.selectUserOption(UserWorkspaceOption.DisableAccount);
	    userWorkspace.confirmAction("OK");
	}
	
	@When("clicks on view menu dropdown")
	public void whenClicksOnViewMenuDropdown(){
		userWorkspace.viewDropdown("user");
	}
	
	@When("admin selects a user")
	public void whenAdminSelectsAuser() throws IOException{
		userWorkspace.findUser(Configuration.email);
		userWorkspace.selectUser(Configuration.email);
	}
	@When("admin selects a '$user'")
	public void whenAdminsSelectsAuser(String user){
		userWorkspace.findUser(user);
		userWorkspace.selectUser(user);
	}
	
	//Admin_004c2
	@When("select enable 2fa option")
	public void andSelectEnable2faOption(){	
		userWorkspace.selectUserOption(UserWorkspaceOption.Enable2FA);
		userWorkspace.confirmAction("OK");
		util.pause(3);
	}
	
	@When("select enable memorable word option")
	public void andSelectEnableMemorableWordOption(){
	    userWorkspace.selectUserOption(UserWorkspaceOption.EnableMemorableWord);
	    user.confirm("OK");
	    util.pause(3);
	}
	@When("select authenticate with Magnum option")
	public void andSelectAuthenticateWithMagnumOption(){
		userWorkspace.selectUserOption(UserWorkspaceOption.AuthenticateWithMagnum);
		util.pause(2);
	}
	@When("select authenticate with LDAP option")
	public void andSelectAuthenticateWithLDAPOption(){
		userWorkspace.selectUserOption(UserWorkspaceOption.AuthenticateWithLDAP);
		util.pause(2);
	}
	@When("select Delete Account option")
	public void andSelectDeleteAccountOption(){
		userWorkspace.selectUserOption(UserWorkspaceOption.DeleteAccount);
		user.confirm("OK");
	    util.pause(3);
	}
	
	
	
	@When("martin enters '<username>' and '<password>' and clicks the login button")
	public void whenMartinEntersUsernameAndPasswordAndClicksTheLoginButton(@Named("username") String uid, @Named("password") String pwd){
		
	}
	
	@Then("user should be in home page")
	public void thenUserShouldBeInHomePage(){
		util.pause(1);
	}
	
	
	//Admin_004b1
	@When("user select new workspace")
	public void selectAWorkspace(){		
		user.reloadPage();
		String workspace = UserAction.currentValue;
		userWorkspace.findWorkspace(workspace);
		userWorkspace.selectWorkspace(workspace);
	}
	@When("clicks on the view dropdown")
	public void clickOnViewDropdown(){
		userWorkspace.viewDropdown("workspace");
	}
	@When("select delete option")
	public void selectDeleteOption(){
	    userWorkspace.selectWorkspaceOption(UserWorkspaceOption.Delete);;
	    userWorkspace.confirmDelete();
	}
	@Then("new workspace is removed from the list and no longer accessible")
	public void workspaceNoLongerAccessible(){
	    //assert: userWorkspace.confirmDelete();
		user.reloadPage();
		util.pause(2);
		String workspace = UserAction.currentValue;
		userWorkspace.findWorkspace(workspace);
		util.pause(1);
	}
	
	@Given("user is present on Manage User and Workspace page")
	public void givenUserIsPresentOnManageUserAndWorkspacePage(){
		//assert page
	}

}
