package com.opus2.core;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Properties;

import com.opus2.core.Configuration;
import com.opus2.enums.Role;
import com.opus2.util.User;



public final class Configuration {
   
	private static final String BASIC_CONF =  "/config.properties";
	private static final String BASE_URL =  "baseUrl";
	private static final String CODEBASE =  "codeBase";

	public static String baseUrl;
	public static String loginUrl;
	public static String disclaimerUrl;
	public static String memorableWordUrl;
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
	public static String adminActivityReportsUrl;

	public static String adminMonitorActivity;
	public static User selectedUser;

	private static HashMap<String,User> users;
	private static Configuration config;

	private static String selectedId;
	


	public static synchronized Configuration getInstance() {
		if (config == null) {
			config = new Configuration();
			selectedUser = users.get(selectedId);
		}
		return config;
	}

	private Configuration() {
		selectedUser =  null;
		users =  new HashMap<String,User>();
		loadConfig();
	};

	public void loadConfig(){
		Properties file = null;
		InputStream testData =  null;	
		try{
			file =  new Properties();
			testData =  this.getClass().getResourceAsStream(BASIC_CONF);
			file.load(testData);

			Configuration.baseUrl =  file.getProperty(BASE_URL).concat(file.getProperty(CODEBASE));
			
			//urls
			Configuration.loginUrl =  Configuration.baseUrl.concat(file.getProperty("loginUrl"));
			Configuration.memorableWordUrl = Configuration.baseUrl.concat(file.getProperty("memorableWordUrl"));
			Configuration.disclaimerUrl = Configuration.baseUrl.concat(file.getProperty("disclaimerUrl"));
			Configuration.homeUrl = Configuration.baseUrl.concat(file.getProperty("homeUrl"));
			Configuration.documentsUrl = Configuration.baseUrl.concat(file.getProperty("documentsUrl"));
			Configuration.transcriptsUrl = Configuration.baseUrl.concat(file.getProperty("transcriptsUrl"));
			Configuration.chronologyUrl = Configuration.baseUrl.concat(file.getProperty("chronologyUrl"));
			Configuration.notesUrl = Configuration.baseUrl.concat(file.getProperty("notesUrl"));
			Configuration.seachUrl = Configuration.baseUrl.concat(file.getProperty("seachUrl"));
			Configuration.adminUrl = Configuration.baseUrl.concat(file.getProperty("adminUrl"));
			Configuration.adminRoles = Configuration.baseUrl.concat(file.getProperty("adminRoles"));
			Configuration.adminUsersUrl = Configuration.baseUrl.concat(file.getProperty("adminUsersUrl"));
			Configuration.adminGroupsUrl = Configuration.baseUrl.concat(file.getProperty("adminGroupsUrl"));
			Configuration.adminDocumentStampsUrl = Configuration.baseUrl.concat(file.getProperty("adminDocumentStampsUrl"));
			Configuration.adminMetaDataUrl = Configuration.baseUrl.concat(file.getProperty("adminMetaDataUrl"));
			Configuration.adminRecoveryUrl = Configuration.baseUrl.concat(file.getProperty("adminRecoveryUrl"));
			Configuration.adminSettingsUrl = Configuration.baseUrl.concat(file.getProperty("adminSettingsUrl"));
			Configuration.adminMonitorActivity = Configuration.baseUrl.concat(file.getProperty("adminMonitorActivity"));
			Configuration.adminActivityReportsUrl = Configuration.baseUrl.concat(file.getProperty("adminActivityReportsUrl"));

			//selected user id
			Configuration.selectedId = file.getProperty("selectedUser" );
			String [] names =  file.getProperty("users").split(",");
			loadUsers(names);
			file =  null;
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	private void loadUsers(String[] names) {
		for(String filename : names){
			Path path =  Paths.get(("/"+filename.concat(".properties")));
			System.out.println(path.toString());
			readUserFile(filename,path.toString());
			
		}

	}

	private void readUserFile(String key , String location) {
		Properties file = null;
		InputStream testData =  null;	
		
		file =  new Properties();
		
		testData = this.getClass().getResourceAsStream(location);
		try {
		    System.out.println("It exists...");
			file.load(testData);
			User user = new User();
			user.setEmail(file.getProperty("email"));
			user.setPassword(file.getProperty("password"));
			user.setMemorableWord(file.getProperty("memorable"));
			user.setWorkspace(file.getProperty("workspace"));
			String roleId = file.getProperty("role");
			if(roleId.equals("admin")){
				user.setRole(Role.ADMIN);
			}else if(roleId.equals("viewer")){
				user.setRole(Role.VIEWER);
			}else if(roleId.equals("user")){
				user.setRole(Role.USER);
			}
			users.put(key, user);
			System.out.println(users.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static  User getSelectedUser() { 
		getInstance();
      return Configuration.selectedUser;
	}
	public static void setUser(User user){
		 getInstance();
    Configuration.selectedUser = user;
	}

  public static User setUserFromType(String typeOfUser) {
    System.out.println(typeOfUser);
    if(users.containsKey(typeOfUser)){
      Configuration.selectedUser = users.get(typeOfUser);
      return Configuration.selectedUser;
    }    
    return null;
  }
}
