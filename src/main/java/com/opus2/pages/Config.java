package com.opus2.pages;

public class Config {
	public static String loginUrl;
	public static String memorableWordUrl;
	public static String disclaimerUrl;
	public static String homeUrl;
	public static String documentsUrl;
	public static String transcriptsUrl;
	public static String chronologyUrl;
	public static String notesUrl;
	public static String seachUrl;
	public static String adminUrl;
	public static String adminRoles;
	public static String adminUsersUrl;
	public static String adminGroupsUrl;
	public static String adminDocumentStampsUrl;
	public static String adminMetaDataUrl;
	public static String adminRecoveryUrl;
	public static String adminSettingsUrl;
	public static String adminMonitorActivity;
	public static String adminActivityReportsUrl;
	public static String forceLogin;
	public static String selectedUser;
	public static String email;
	public static String password;
	public static String memorable;
	public static String workspace;
	public static String baseUrl;
	public static String codeBase;
	public static String userEmail;
	

	public static String defaultUrl(){	
		baseUrl = baseUrl+codeBase+loginUrl;
		return baseUrl;
	}

}
