package com.opus2.steps;
import net.serenitybdd.jbehave.SerenityStories;

import org.jbehave.core.annotations.*;

import com.opus2.enums.Pages;
import com.opus2.pages.Admin;
import com.opus2.pages.Home;
import com.opus2.pages.Login;
import com.opus2.pages.UserWorkspaces;
import com.opus2.util.Constants;
import com.opus2.util.Util;

public class UserLoginSteps extends SerenityStories{
	
	Login loginpage;
	Util util;
	Home homepage;
	UserWorkspaces userWorkspace;
	Admin adim;
	 
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
	
	@When("use clicks on the new workspace button")
	public void whenUseClicksOnTheNewWorkspaceButton(){
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
	@When("user clicks on Manage Users and Workspaces button")
	public void userClicksOnManageUsersAndWorkspacesButton(){
		homepage.manageUserAndWorkspace();
		userWorkspace.switchToCurrentWindow();
	}
	@Then("a new tab navigates user to adminUsers page where users can be added and removed from workspaces")
	public void userNaviagtesToNewTab(){
		userWorkspace.verifyUserWorkspace();
		util.wait(5);
	}
	
	@When("user clicks on New User button")
	public void userClickNewUser(){
		userWorkspace.clickNewUser();
	}
	@Then("add a new user dialog open")
	public void dialogBoxOpens(){
		//assert
	}
	@When("user enters '<email>'")
	public void userEntersEmail(@Named("email") String email){
		userWorkspace.typesUserEmail(email);
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
		userWorkspace.clicksNewWorkspace();
	}
	@When("type in a '<title>' and '<description>'")
	public void userTypedTitleAndDescription(@Named("title") String title, @Named("description") String desc){
		userWorkspace.entersTitleAndDescription(title,desc);
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
		userWorkspace.findWorkspace(workspace);
		userWorkspace.selectWorkspace(workspace);
	}

	@When("clicks on the view dropdown")
	public void clickOnViewDropdown(){
		userWorkspace.viewDropdown();
	}

	@When("select '<delete>' option")
	public void selectDeleteOption(@Named("delete") String delete){
	    userWorkspace.selectDeleteOption();
	    userWorkspace.confirmDelete();
	}

	@Then("'<workspace>' is removed from the list and no longer accessible")
	public void workspaceNoLongerAccessible(){
	    //assert: userWorkspace.confirmDelete();
	}

	@When("select '<disable account>' option")
	public void andSelectdisableAccountOption(@Named("disable account") String option){
		userWorkspace.selectDisableAccountOption(option);
	    userWorkspace.confirmAction();
	}
	
	@When("clicks on '<user>' view menu dropdown")
	public void whenClicksOnuserViewMenuDropdown(@Named("user") String user){
		userWorkspace.viewDropdown(user);
	}
	
	@When("admin selects a '<user>'")
	public void whenAdminSelectsAuser(@Named("user") String user){
		userWorkspace.findUser(user);
		userWorkspace.selectUser(user);
	}
	
	@When("select '<enable 2fa>' option")
	public void andSelectEnable2faOption(@Named("enable 2fa") String option){
		userWorkspace.selectDisableAccountOption(option);
		util.wait(1);
	    //userWorkspace.confirmAction();
	    util.confirmAction("Cancel");	
	}
	@When("select '<enable memorable word>' option")
	public void andSelectEnableMemorableWordOption(@Named("enable memorable word") String option){
		userWorkspace.selectDisableAccountOption(option);
		util.wait(1);
	    //userWorkspace.confirmAction();
	    util.confirmAction("Cancel");		
	}
	@When("select '<authenticate with Magnum>' option")
	public void andSelectAuthenticateWithMagnumOption(@Named("authenticate with Magnum") String option){
		userWorkspace.selectDisableAccountOption(option);
		util.wait(1);
	    //userWorkspace.confirmAction();		
	}
	@When("select '<authenticate with LDAP>' option")
	public void andSelectAuthenticateWithLDAPOption(@Named("authenticate with LDAP") String option){
		userWorkspace.selectDisableAccountOption(option);
		util.wait(1);
	    //userWorkspace.confirmAction();	
	}
	
	@When("martin enters '<username>' and '<password>' and clicks the login button")
	public void whenMartinEntersUsernameAndPasswordAndClicksTheLoginButton(@Named("username") String uid, @Named("password") String pwd){
		
	}
	
	@When("user navigates to home page")
	public void whenUserNavigatesToHomePage(){
		util.goTo(Pages.Home);
	}
	@Then("user should be in home page")
	public void thenUserShouldBeInHomePage(){
		util.wait(1);
	}
}