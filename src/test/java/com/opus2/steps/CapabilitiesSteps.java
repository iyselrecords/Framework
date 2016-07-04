package com.opus2.steps;

import net.thucydides.core.steps.ScenarioSteps;

import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.opus2.enums.Pages;
import com.opus2.enums.SideMenu;
import com.opus2.enums.UsersCap;
import com.opus2.pages.Admin;
import com.opus2.pages.Dialog;
import com.opus2.pages.UserAction;
import com.opus2.util.Constants;
import com.opus2.util.Event;
import com.opus2.util.Util;

public class CapabilitiesSteps extends ScenarioSteps  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Admin admin;
	Util util;
	UserAction action;
	Event event;
	Dialog dialog;
	
	@When("click on <Roles> Sidemenu link")
	public void whenClicksOnSidemenuLink(){
		admin.select(SideMenu.Roles);
	}
	@Then("default roles displaying list of capabilities is visible")
	public void thenDefaultRolesDisplayingListOfCapabilitiesIsVisible(){
		util.pause(1);
	}
	
	
	@When("user navigates to Admin page")
	public void whenUserNavigatesToAdminPage(){
		action.goTo(Pages.Admin);		
	}
	@Then("user should be in Admin page")
	public void thenUserShouldBeInAdminPage(){
		 util.pause(1);
	}
	@When("user clicks on 'Roles' tab")	
	public void whenUserClicksOnRolesTab(){
		admin.select(SideMenu.Roles);
	}
	@When("clicks on 'Roles' tab")	
	public void andClicksOnRolesTab(){
		admin.select(SideMenu.Roles);
	}
	
	@When("user click on $link sidemenu")	
	public void whenUserClickOnLinkSidemenu(){
		admin.select(SideMenu.Roles);
	}
	
	@Then("Roles tab should open default roles displaying list of capabilities")
	public void thenRolesTabShouldOpenDefaultRolesDisplayingListOfCapabilities(){
		util.pause(1);
	}
	@SuppressWarnings("static-access")
	@When("enter Role's $name")
	public void whenEnterRolesName(String name){
		admin.roles.enterNewRole(name);
	}
	@SuppressWarnings("static-access")
	@When("set Chronology capabilities")	
	public void whenSetChronologyCapabilities(){
		admin.roles.chronologyCapabilities();
	}
	@SuppressWarnings("static-access")
	@When("set Exporting capabilities")	
	public void whenSetExportingCapabilities(){
		admin.roles.exportingCapabilities();
	}
	@SuppressWarnings("static-access")
	@When("save changes")	
	public void andSaveChanges(){
		admin.roles.saveChanges();
	}
	@Then("new Role is created with ability to choose its capabilities")	
	public void thenNewRoleIsCreatedWithAbilityToChooseItsCapabilities(){		
		util.pause(2);
	}
	
	@Given("user is present on Roles page")
	public void givenUserIsPresentOnRolesPage(){
		util.pause(1);
	}
	@SuppressWarnings("static-access")
	@When("user click on New Role button")
	@Alias("click on New Role button")	
	public void whenUserClicksOnTheNewRoleButton(){
		admin.roles.newRole();	
	}
	@SuppressWarnings("static-access")
	@When("set Transcripts capabilities")	
	public void whenSetTranscriptsCapabilities(){
		admin.roles.transcriptsCapabilities();
	}
	@SuppressWarnings("static-access")
	@When("set General capabilities")	
	public void whenSetGeneralCapabilities(){
		admin.roles.generalCapabilities();
	}
	@SuppressWarnings("static-access")
	@When("set Documents capabilities")	
	public void whenSetDocumentsCapabilities(){
		admin.roles.documentsCapability();
	}
	@SuppressWarnings("static-access")
	@When("user clicks on the Edit button")
	public void whenUserClicksOnTheEditButton(){
		admin.roles.edit(Constants.NewRole2);
	}
	@Then("user should be able to toggle capabilities and save changes to the Role")
	public void thenUserShouldBeAbleToToggleCapabilitiesAndSaveChangesToTheRole(){
		util.pause(1);
	}
	
	@When("user clicks on 'Users' tab")	
	public void whenUserClicksOnUsersTab(){
		admin.select(SideMenu.Users);
	}
	@Then("user page should display 'Add Users' and 'Import User' Dialog")
	public void thenUserPageShouldDisplayAddUsersAndImportUserDialog(){
		util.pause(1);
	}
	@SuppressWarnings("static-access")
	@When("user enters '<email>' on Email input on the Add User Dialog")	
	public void whenUserEntersemailOnEmailInputOnTheAddUserDialog(@Named("email") String email){
		dialog.addUsers.email(email);	
	}
	@SuppressWarnings("static-access")
	@When("select '<newRole>' from Role dropdown")	
	public void whenSelectnewRoleFromRoleDropdown(@Named("newRole") String newRole){
		//dialog.addUsers.selectRole(newRole);
/*		

		dialog.addUsers.createAccount();
		dialog.addUsers.selectRole();
		dialog.addUsers.firstName();	
		dialog.addUsers.lastName();
		dialog.addUsers.username();
		dialog.addUsers.signature();	
		dialog.addUsers.password();
		dialog.addUsers.confirmPassword();	
		dialog.addUsers.memorableWord();
		dialog.addUsers.confirmMemorableWord();
		dialog.addUsers.sendEmailNotification();
*/		
	}
	@SuppressWarnings("static-access")
	@When("click the Invite button")
	public void whenClickTheInviteButton(){
		//dialog.addUsers.invite();
	}
	@Then("new user should have the 'newRole' role capability")
	public void thenNewUserShouldHaveThenewRoleRoleCapability(){
		util.pause(1);
	}
	@SuppressWarnings("static-access")
	@When("user selects '<email>' to edit")	
	public void whenUserSelectsemailToEdit(@Named("email") String email){
		admin.users.select(UsersCap.Edit, email);
	}
	@SuppressWarnings("static-access")
	@When("Add FirstName and LastName")	
	public void whenAddFirstNameAndLastName(){
		admin.users.select(UsersCap.Delete, "email954@opus2.com");
	}
	@SuppressWarnings("static-access")
	@When("Username and Signature")	
	public void whenUsernameAndSignature(){
		admin.users.select(UsersCap.UnlockAccount, "email204@opus2.com");
	}
	@When("select role to 'newRole'")	
	public void whenSelectRoleTonewRole(){
		
	}
	@When("save")
	public void whenSave(){
		
	}
	@Then("existing user should have the 'newRole' role capability")	
	public void thenExistingUserShouldHaveThenewRoleRoleCapability(){
		
	}	
	@SuppressWarnings("static-access")
	@When("edit user capabilities")
	public void andEditUserCapabilities(){
		admin.roles.userCapabilities();
	}
	@Then("capabilities are updated to current changes")
	public void thenCapabilitiesAreUpdatedToCurrentChanges(){
		util.pause(2);
	}
	@When("user role is selected")
	public void whenUserRoleIsSelected(){
		util.pause(1);
	}
	@When("user click on the 'x' icon")
	public void andUserClickOnTheXIcon(){
		event.editDeleteRole(Constants.NewRole2, 1);
	}
	@When("confirm alert")
	public void andConfirmAlert(){
		action.acceptAlert();
	}
	@Then("user role should be deleted from role section")
	public void thenUserRoleShouldBeDeletedFromRoleSection(){
		util.pause(1);
	}
	
	
}
