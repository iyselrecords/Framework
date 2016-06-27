package com.opus2.enums;

public enum UsersCap {
	Delete ("Delete"),
	Edit ("Edit"),
	UnlockAccount ("Unlock Account"),
	ResendRegistrationLink ("Resend Registration Link"),
	SendTwoFactorCode ("Send Two Factor Code"),
	EnableUserAccount ("Enable User Account"),
	DisableWorkspaceUser ("Disable Workspace User"),
	EnableWorkspaceUser  ("Enable Workspace User "),
	UndoAutoLock ("Undo Auto-Lock");
	
	 private  String user;
	 
	 private UsersCap (String user) {
	        this.user = user;
	 }
	 
	 public String userFuntion() {
	        return user; 
	 }
}
