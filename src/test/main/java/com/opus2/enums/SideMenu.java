package com.opus2.enums;

public enum SideMenu {
	Overview ("Overview"),
	Roles ("Roles"),
	Users ("Users"),
	Groups ("Groups"),
	DocumentStamps ("Document Stamps"),
	Metadata ("Metadata"),
	DocumentTags ("Document Tags"),
	Recovery ("Recovery"),
	Settings ("Settings"),
	MonitorActivity ("Monitor Activity"),
	ACLReports ("ACL Reports"),
	ManageWorkspaces ("Manage Workspaces");
	
	 private  String sideMenu;
	 
	 private SideMenu (String sideMenu) {
	        this.sideMenu = sideMenu;
	 }
	 
	 public String enumField() {
	        return sideMenu; 
	 }
}
