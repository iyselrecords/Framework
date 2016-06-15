package com.opus2.steps;

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

import net.serenitybdd.jbehave.SerenityStories;
import net.thucydides.core.annotations.Steps;

public class CapabilitiesSteps extends SerenityStories{
	@Steps	
	Event event;
	Util util;
	Admin admin;
	Dialog dialog;
	static UserAction action;
	
	@When("user navigates to Admin page")
	public void whenUserNavigatesToAdminPage(){
		action.goTo(Pages.Admin);		
	}
	@Then("user should be in Admin page")
	public void thenUserShouldBeInAdminPage(){
		 util.wait(1);
	}
	@Given("user is present in Admin Role page")
	public void givenUserIsPresentInAdminRolePage(){
		 util.wait(1);
	}
	@Given("user is present in Admin User page")
	public void givenUserIsPresentInAdminUserPage(){
		 util.wait(1);
	}
	@When("user clicks on 'Roles' tab")	
	public void whenUserClicksOnRolesTab(){
		admin.select(SideMenu.Roles);
	}
	@When("clicks on 'Roles' tab")	
	public void andClicksOnRolesTab(){
		admin.select(SideMenu.Roles);
	}
	@Then("Roles tab should open default roles displaying list of capabilities")
	public void thenRolesTabShouldOpenDefaultRolesDisplayingListOfCapabilities(){
		util.wait(1);
	}
	@SuppressWarnings("static-access")
	@When("enter Role's name")
	public void whenEnterRolesName(){
		admin.roles.enterNewRole(Constants.NewRole);
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
		util.wait(2);
	}
	@SuppressWarnings("static-access")
	@When("user clicks on the New Role button")	
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
	@When("user select Role to Edit")
	public void whenUserSelectRoleToEdit(){
		admin.roles.edit(Constants.NewRole);
	}
	@Then("user should be able to toggle capabilities and save changes to the Role")
	public void thenUserShouldBeAbleToToggleCapabilitiesAndSaveChangesToTheRole(){
		util.wait(1);
	}
	
	@When("user clicks on 'Users' tab")	
	public void whenUserClicksOnUsersTab(){
		admin.select(SideMenu.Users);
	}
	@Then("user page should display 'Add Users' and 'Import User' Dialog")
	public void thenUserPageShouldDisplayAddUsersAndImportUserDialog(){
		util.wait(1);
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
		util.wait(1);
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
		util.wait(2);
	}
	@When("user role is selected")
	public void whenUserRoleIsSelected(){
		util.wait(1);
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
		util.wait(1);
	}

	@SuppressWarnings("static-access")
	@When("click on the Role dropdown")
	public void andClickOnTheRoleDropdown(){
		dialog.addUsers.selectRole(Constants.NewRole);
	}
	@Then("new Role should be listed")
	public void thenNewRoleShouldBeListed(){
		util.wait(1);
		System.out.println("assert new role");
	}
	
	//004
	@SuppressWarnings("static-access")
	@When("'<user>' is selected")
	public void whenuserIsSelected(@Named("user") String user){
		dialog.liveUser.select(user);
	}
	@Then("new Role should be assigned to '<user>'")
	public void thenNewRoleShouldBeAssignedTouser(){
		util.wait(2);
	}
	@SuppressWarnings("static-access")
	@When("new changes saved")
	public void whenNewChangesSaved(){
		dialog.editUser.save();
	}
	@SuppressWarnings("static-access")
	@When("Edit option selected")
	public void whenEditOptionSelected(){
		dialog.liveUser.selectOption("Edit");
	}
	@SuppressWarnings("static-access")
	@When("new Role is assigned")
	public void whenNewRoleIsAssigned(){
		dialog.editUser.selectRole(Constants.NewRole);
	}
	@SuppressWarnings("static-access")
	@When("user select Role to Delete")
	public void whenUserSelectRoleToDelete(){
		admin.roles.delete(Constants.NewRole);
	}
	@SuppressWarnings("static-access")
	@When("select Role to Delete")
	public void andUserSelectRoleToDelete(){
		admin.roles.delete(Constants.NewRole);
	}
	@Then("role should be deleted from Workspace")
	public void thenRoleShouldBeDeletedFromWorkspace(){
		util.wait(5);
	}
	
}

