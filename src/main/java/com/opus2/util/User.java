package com.opus2.util;

import com.opus2.enums.Role;

public class User {
	private String password;
	private String email;
	private Role role;
	public static String memorable;
	public static String workspace;
	public User() {
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getWorkspace(){
		return workspace;
	}
	public String getMemorableWordAt(int index){
		return memorable.substring(index,1);
	}
}
