package com.opus2.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

import com.opus2.pages.Config;

import net.serenitybdd.core.pages.PageObject;

public class Util extends PageObject {

	public Properties Test_Properties;
	public Properties Test_Table;
	private Properties file =null;
	Config config;
	
	
	public void pause(int waitTime) {
		try {
			Thread.sleep(1000 * waitTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void pause(double waitTime) {
		try {
			Thread.sleep((long) (1000 * waitTime));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
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
	}
	
	public Set<Object> getAllKeys(){
		Set<Object> keys = file.keySet();
		return keys;
	}
	     
	public String getPropertyValue(String key){
        return this.file.getProperty(key);
    }
	
	public void createObject(){
		Config.loginUrl = getPropertyValue("loginUrl");
		Config.memorableWordUrl = getPropertyValue("memorableWordUrl");
		Config.disclaimerUrl = getPropertyValue("disclaimerUrl");
		Config.homeUrl = getPropertyValue("homeUrl");
		Config.documentsUrl = getPropertyValue("documentsUrl");
		Config.transcriptsUrl = getPropertyValue("transcriptsUrl");
		Config.chronologyUrl = getPropertyValue("chronologyUrl");
		Config.notesUrl = getPropertyValue("notesUrl");
		Config.seachUrl = getPropertyValue("seachUrl");
		Config.adminUrl = getPropertyValue("adminUrl");
		Config.adminRoles = getPropertyValue("adminRoles");
		Config.adminUsersUrl = getPropertyValue("adminUsersUrl");
		Config.adminGroupsUrl = getPropertyValue("adminGroupsUrl");
		Config.adminDocumentStampsUrl = getPropertyValue("adminDocumentStampsUrl");
		Config.adminMetaDataUrl = getPropertyValue("adminMetaDataUrl");
		Config.adminRecoveryUrl = getPropertyValue("adminRecoveryUrl");
		Config.adminSettingsUrl = getPropertyValue("adminSettingsUrl");
		Config.adminMonitorActivity = getPropertyValue("adminMonitorActivity");
		Config.adminActivityReportsUrl = getPropertyValue("adminActivityReportsUrl");
		Config.forceLogin = getPropertyValue("forceLogin");
		Config.selectedUser = getPropertyValue("selectedUser");
		Config.email = getPropertyValue("email");
		Config.password = getPropertyValue("password");
		Config.memorable = getPropertyValue("memorable");
		Config.workspace = getPropertyValue("workspace");
		Config.baseUrl = getPropertyValue("baseUrl");
		Config.codeBase = getPropertyValue("codeBase");
	}
	
}
