package com.opus2.enums;

public enum UserWorkspaceOption {
	DisableAccount("Disable Account"),
	EnableAccount("Enable Account"),
	DeleteAccount("Delete Account"),
	Enable2FA("Enable 2FA"),
	Disable2FA("Disable 2FA"),
	EnableMemorableWord("Enable Memorable Word"),
	DisableMemorableWord("Disable Memorable Word"),
	LoginAs("Login As"),
	ResetPassword("Reset Password"),
	ResetMemorableWord("Reset Memorable Word"),
	AuthenticateWithMagnum("Authenticate with Magnum"),
	AuthenticateWithLDAP("Authenticate with LDAP"),
	CloneWorkspace("Clone Workspace"),
	Archive("Archive"),
	Delete("Delete");
	
	private String option;
	private UserWorkspaceOption(String option){
		this.option = option;
	}
	public String returnOption(){
		return option;
	}
}
