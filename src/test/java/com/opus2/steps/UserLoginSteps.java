package com.opus2.steps;
import net.serenitybdd.jbehave.SerenityStories;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.*;

import com.opus2.enums.Pages;
import com.opus2.enums.UserWorkspaceOption;
import com.opus2.pages.Admin;
import com.opus2.pages.Home;
import com.opus2.pages.Login;
import com.opus2.pages.UserAction;
import com.opus2.pages.UserWorkspaces;
import com.opus2.util.Constants;
import com.opus2.util.Util;

public class UserLoginSteps extends SerenityStories{
	@Steps
	
	Login loginpage;
	Util util;
	Home homepage;
	UserWorkspaces userWorkspace;
	Admin adim;
	UserAction action;
	 
	@Given("that a user initialize a browser")
	public void givenThatAUserInitiliseABrowser(){
		loginpage.initilize();
	}
	
	@When("user enters '<username>' and '<password>'")
	public void whenUserEntersusernameAndpassword(@Named("username") String uid, @Named("password") String pwd){
		loginpage.loginAs(uid);
		loginpage.withPassword(pwd);
	}
	
	@When("click on the login button")
	public void whenClickOnTheLoginButton(){
		loginpage.login();
	}
	
	@Then("user should access list of available workspaces/mirrors")
	public void thenUserAccessWorkspace(){
		util.wait(2);
		//assert user is in homepage
	}
	
	@When("user clicks on the new workspace button")
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
	@When("clicks on Manage Users and Workspaces button")
	public void clicksOnManageUsersAndWorkspacesButton(){
		homepage.manageUserAndWorkspace();
		action.switchToCurrentWindow(1);
	}
	@Then("a new tab navigates user to adminUsers page where users can be added and removed from workspaces")
	public void userNaviagtesToNewTab(){
		userWorkspace.verifyUserWorkspace();
	}
	
	@When("user clicks on New User button")
	public void userClickNewUser(){
		userWorkspace.newUser();
	}
	@Then("add a new user dialog open")
	public void dialogBoxOpens(){
		//assert
	}
	@When("enters '<email>'")
	public void entersEmail(@Named("email") String email){
		userWorkspace.enterUserEmail(email);
	}
	@When("clicks Invite button")
	public void clickInviteButton(){
		userWorkspace.inviteUser();
	}
	@Then("user should appear on the user list")
	public void shouldAppearOnUserList(){
		//assert
		util.wait(3);
	}
	@When("user clicks on the New Workspace button")
	public void userClicksOnNewWorkspaceButton(){
		userWorkspace.newWorkspace();
	}
	@When("type in a '<title>' and '<description>'")
	public void userTypedTitleAndDescription(@Named("title") String title, @Named("description") String desc){
		userWorkspace.enterTitleAndDescription(title,desc);
	}
	@When("click Create Workspace button")
	public void clickCreateWorkspace(){
		userWorkspace.createWorkspace();
	}
	@Then("workspace should appear in the Workspace dropdown")
	public void workspaceList(){
		//assert
		util.wait(3);
	}
	
	@When("user select a '<workspace>'")
	public void selectAWorkspace(@Named("workspace") String workspace){
		action.reloadPage();
		userWorkspace.findWorkspace(workspace);
		userWorkspace.selectWorkspace(workspace);
	}

	@When("clicks on the view dropdown")
	public void clickOnViewDropdown(){
		userWorkspace.viewDropdown("workspace");
	}

	@When("select 'delete' option")
	public void selectDeleteOption(){
	    userWorkspace.selectWorkspaceOption(UserWorkspaceOption.Delete);;
	    userWorkspace.confirmDelete();
	}

	@Then("'<workspace>' is removed from the list and no longer accessible")
	public void workspaceNoLongerAccessible(){
	    //assert: userWorkspace.confirmDelete();
	}

	@When("select 'disable account' option")
	public void andSelectdisableAccountOption(){
		//userWorkspace.selectDisableAccountOption(option);
		userWorkspace.selectUserOption(UserWorkspaceOption.DisableAccount);
	    userWorkspace.confirmAction("OK");
	}
	
	@When("clicks on view menu dropdown")
	public void whenClicksOnViewMenuDropdown(){
		userWorkspace.viewDropdown("user");
	}
	
	@When("admin selects a '<user>'")
	public void whenAdminSelectsAuser(@Named("user") String user){
		userWorkspace.findUser(user);
		userWorkspace.selectUser(user);
	}
	
	@When("select 'enable 2fa' option")
	public void andSelectEnable2faOption(){	
		userWorkspace.selectUserOption(UserWorkspaceOption.Enable2FA);
		userWorkspace.confirmAction("OK");
	}
	@When("select 'enable memorable word' option")
	public void andSelectEnableMemorableWordOption(){
	    userWorkspace.selectUserOption(UserWorkspaceOption.EnableMemorableWord);
	    action.confirm("OK");
	}
	@When("select 'authenticate with Magnum' option")
	public void andSelectAuthenticateWithMagnumOption(){
		userWorkspace.selectUserOption(UserWorkspaceOption.AuthenticateWithMagnum);
	}
	@When("select 'authenticate with LDAP' option")
	public void andSelectAuthenticateWithLDAPOption(){
		userWorkspace.selectUserOption(UserWorkspaceOption.AuthenticateWithLDAP);
	}
	
	@When("martin enters '<username>' and '<password>' and clicks the login button")
	public void whenMartinEntersUsernameAndPasswordAndClicksTheLoginButton(@Named("username") String uid, @Named("password") String pwd){
		
	}
	
	@When("user navigates to home page")
	public void whenUserNavigatesToHomePage(){
		action.goTo(Pages.Home);
	}
	@Then("user should be in home page")
	public void thenUserShouldBeInHomePage(){
		util.wait(1);
	}
}