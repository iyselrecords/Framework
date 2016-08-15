package com.opus2.pages.logout;

import java.util.concurrent.TimeUnit;

import com.opus2.util.Page;
import com.opus2.util.components.Logout;

import net.serenitybdd.core.annotations.findby.FindBy;

public class SignOut  extends Page  {
	private static final String LOGOUT = "log-out";
	
	@FindBy(id=LOGOUT)
	private static Logout user;
	
	public void signOut(){
		user.click();
	    this.setImplicitTimeout(3, TimeUnit.SECONDS);
		acceptAlert();
	}
	
	private Logout action;
	public void acceptAlert(){
		action.accceptAlert();
	}
}
