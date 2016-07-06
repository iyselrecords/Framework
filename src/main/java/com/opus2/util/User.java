package com.opus2.util;

import com.opus2.enums.Role;

public class User {
  private String password;
  private String email;
  private Role role;
  private  String memorable;
  private  String workspace;
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
  public void setWorkspace(String workspace){
    this.workspace = workspace;
  }
  public String getMemorableWordAt(int index){
    return String.valueOf(memorable.charAt(index));
  }
  public void setMemorableWord(String memorable) {
    this.memorable = memorable;
  }
}
