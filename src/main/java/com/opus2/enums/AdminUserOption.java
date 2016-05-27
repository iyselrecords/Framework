package com.opus2.enums;

public enum AdminUserOption {
	
	Delete("Delete"),
	Edit("Edit"),
	UnlockAccount("Unlock Account"),
	ResendRegistrationLink("Resend Registration Link"),
	SendTwoFactorCode("Send Two Factor Code"),
	EnableUserAccount("Enable User Account"),
	DisableWorkspaceUser("Disable Workspace User"),
	EnableWorkspaceUser("Enable Workspace User"),
	UndoAutoLock("Undo Auto-Lock");
	
	private String option;
	 
	 private AdminUserOption(String option){
		 this.option = option;
	 } 
	 
	 public String enumField(){
		 return option;
	 }
}
