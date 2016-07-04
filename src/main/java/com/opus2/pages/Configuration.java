package com.opus2.pages;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

import net.serenitybdd.core.pages.PageObject;

public class Configuration extends PageObject{
	private Properties file =null;
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
	public static String first;
	public static String second;
	public static String third;
	public static String fourth;
	public static String fifth;
	public static String sixth;

	public void loadConfig(){
		InputStream testData = null;	
		try{
			this.file = new Properties();
			testData = this.getClass().getResourceAsStream("/config.properties");
			file.load(testData);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		createObject();
		getMemorableWord();
	}
	
	public Set<Object> getAllKeys(){
		Set<Object> keys = file.keySet();
		return keys;
	}
	     
	public String getPropertyValue(String key){
        return this.file.getProperty(key);
    }
	
	public void createObject(){
		Configuration.loginUrl = getPropertyValue("loginUrl");
		Configuration.memorableWordUrl = getPropertyValue("memorableWordUrl");
		Configuration.disclaimerUrl = getPropertyValue("disclaimerUrl");
		Configuration.homeUrl = getPropertyValue("homeUrl");
		Configuration.documentsUrl = getPropertyValue("documentsUrl");
		Configuration.transcriptsUrl = getPropertyValue("transcriptsUrl");
		Configuration.chronologyUrl = getPropertyValue("chronologyUrl");
		Configuration.notesUrl = getPropertyValue("notesUrl");
		Configuration.seachUrl = getPropertyValue("seachUrl");
		Configuration.adminUrl = getPropertyValue("adminUrl");
		Configuration.adminRoles = getPropertyValue("adminRoles");
		Configuration.adminUsersUrl = getPropertyValue("adminUsersUrl");
		Configuration.adminGroupsUrl = getPropertyValue("adminGroupsUrl");
		Configuration.adminDocumentStampsUrl = getPropertyValue("adminDocumentStampsUrl");
		Configuration.adminMetaDataUrl = getPropertyValue("adminMetaDataUrl");
		Configuration.adminRecoveryUrl = getPropertyValue("adminRecoveryUrl");
		Configuration.adminSettingsUrl = getPropertyValue("adminSettingsUrl");
		Configuration.adminMonitorActivity = getPropertyValue("adminMonitorActivity");
		Configuration.adminActivityReportsUrl = getPropertyValue("adminActivityReportsUrl");
		Configuration.forceLogin = getPropertyValue("forceLogin");
		Configuration.selectedUser = getPropertyValue("selectedUser");
		Configuration.email = getPropertyValue("email");
		Configuration.password = getPropertyValue("password");
		Configuration.memorable = getPropertyValue("memorable");
		Configuration.workspace = getPropertyValue("workspace");
		Configuration.baseUrl = getPropertyValue("baseUrl");
		Configuration.codeBase = getPropertyValue("codeBase");
	}
	public void getMemorableWord(){
		String mw = Configuration.memorable;
		Configuration.first = mw.substring(0, 1);
		Configuration.second = mw.substring(1, 2);
		Configuration.third = mw.substring(2, 3);
		Configuration.fourth = mw.substring(3, 4);
		Configuration.fifth = mw.substring(4, 5);
		Configuration.sixth = mw.substring(5, 6);	
	}
	
	public static String defaultUrl(){	
		baseUrl = baseUrl+codeBase+loginUrl;
		return baseUrl;
	}
}
